<%--
    Document   : typeManager
    Created on : 2015-4-2, 18:42:27
    Author     : wangpu
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://" +request.getServerName()+":"+request.getServerPort()+path+"/" ;
%>
<html>
<head>
    <base href="<%=basePath%>" >
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>角色权限管理</title>
    <link rel="stylesheet" type="text/css" href="css/themes/gray/easyui.css">
    <link rel="stylesheet" type="text/css" href="css/themes/icon.css">
    <script type="text/javascript" src="javascript/public/jquery.min.js"></script>
    <script type="text/javascript" src="javascript/public/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="javascript/public/pageloads.js"></script>
    <style>html,body{height:100%;margin:0px;}</style>
</head>
<body>
<div id="${tv}" class="easyui-panel" data-options="border:false,fit:true,noheader:true">

    <table id="${tv}grid" class="easyui-datagrid"
           data-options="<%--onDelete:${tv}onGridDel,
                       onBeforeEnd:${tv}onGridEndEdit,
                       onBeginEdit:${tv}onGridBeginEdit,--%>
                       rownumbers:true,collapsible:true,singleSelect:true,striped:true,toolbar:'#${tv}tbar',fit:true,pagination:true,url:'getRole.do'">
        <thead>
        <tr>
            <th data-options="checkbox:true,field:'',width:150"><strong>选择</strong></th>
            <th data-options="field:'roleid',width:50" editor="{type:'validatebox',options:{required:true}}"><strong>角色Id</strong></th>
            <th data-options="field:'rolename',width:150" editor="{type:'validatebox',options:{required:true}}"><strong>角色名称</strong></th>
            <th data-options="field:'remark',width:250" editor="{type:'validatebox',options:{required:true}}"><strong>角色描述</strong></th>
        </tr>
        </thead>
    </table>
    <div id="${tv}tbar" style="padding:2px 5px;">
        <%--    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editRow('${tv}grid')">修改角色</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="saveRow('${tv}grid')">保存角色</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-undo" plain="true" onclick="cancelRow('${tv}grid')">取消操作</a>--%>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick="${tv}showWindowUi()">修改子项</a>
        <select id="${tv}srcType" class="easyui-combobox" data-options="prompt:'选择查询类型',value:'',panelHeight:'auto'" name="method" style="width:150px;">
            <option value="rolename">角色名称</option>
        </select>
        <input id="${tv}roleid" name="valone" class="easyui-searchbox" size="30"
               data-options="prompt:'输入查询内容',searcher:${tv}search" >
    </div>


    <div id="${tv}window" class="easyui-window" title='用户信息' style="width:90%;height:90%"
         data-options="onClose:${tv}onWndClose,maximizable:false,minimizable:false,collapsible:false,modal:true,inline:true,closed:true">
        <div style="display:none;"><span id="theroleName"></span></div>
        <!--privileges in role use treegrid-->
        <div id="${tv}treegriddiv" style="height: 90%">
            <table id="${tv}rolePrivilegeTreeGrid" class="easyui-treegrid" >
                <!--<thead>
                        <tr>
                            <th data-options="checkbox:true,field:'ck',width:150"><strong>选择</strong></th>
                            <th data-options="field:'name'"><strong>权限名称</strong></th>
                            <th data-options="field:'Level'"><strong>层级</strong></th>
                            <th data-options="field:'funcs'"><strong>具体操作</strong></th>
                        </tr>
                </thead>-->
            </table>
        </div>
        <div id="${tv}privilegeTreeBar" style="padding:2px 5px">
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="saveUserPri('${tv}rolePrivilegeTreeGrid')">保存权限</a>
        </div>

    </div>

    <script type="text/javascript">
        //获取角色id 和选中的菜单ID
        function saveUserPri(theGrid){
            var bRes=false;
            var treegd = $("#"+theGrid);
            var rows = treegd.treegrid('getSelections');
            var _list ="";
            for(var i= 0;i<rows.length;i++){
                _list+= rows[i].menuid+",";
            }

            var parerow = $("#${tv}grid").datagrid("getSelected");
            var roleid = parerow.roleid;
            //return false;
            var  url="addRoletomenu.do";
            var ou={"roleid":roleid,"menuids":_list};

            $.ajax({
                url: url,
                data: ou,
                //data: _list,
                type: "POST",
                traditional: true,
                success: function (data) {
                    // your logic
                    //$.messager.alert(data.Message);
                    bRes = $("input",$(data)).val() == "Success";
                    if(bRes == false)
                    {
                        $.messager.alert("提示", $("span", $(data)).text());
                    }
                    else
                    {
                        messageHelper.info("成功", $("span", $(data)).text());
                    }
                }
            });
            treegd.treegrid('reload');
            return true;
            /*
             subwindowdata("${tv}rolePrivilegeTreeGrid",url,ou,function(data){
             bRes=$("input",$(data)).val()=="Success";
             if(bRes==false)$.messager.alert("提示",$("span",$(data)).text());
             });

             return bRes;
             */
        }
        //---------user datagrid begin----------------
        function ${tv}showWindowUi(){
            cancelRow('${tv}rolePrivilegeGrid');

            ////隐藏域放main grid的role name，便于添加用户查表
            $('#${tv}roleid').text("");
            //选择角色
            var row = $("#${tv}grid").datagrid("getSelected");
            if (row){


                //初始化角色菜单表
                $("#${tv}rolePrivilegeTreeGrid").treegrid({
                    url:"getMenuList.do"
                });

                /*
                 $("#${tv}rolePrivilegeGrid").datagrid({
                 url:"GetRolerPrivileges.do",//?rolerName="+row.name
                 onBeforeLoad: function(param){
                 param.rolerName = row.name;
                 }
                 });
                 */
                $("#${tv}window").window({title:row.rolename});
                $("#theroleName").text(row.rolename);
                //alert($("#theroleName").text());
                //showtreegrid(row.name);

                $('#${tv}rolePrivilegeTreeGrid').treegrid("unselectAll");


                $("#${tv}window").window("open");
            }
            else
            {
                $.messager.alert('警告','您还没有选择操作行！');
            }
        }

        function ${tv}onWndClose(){
            $("#${tv}grid").datagrid("reload");
            cancelRow("${tv}grid");
        }

        $('#${tv}rolePrivilegeTreeGrid').treegrid({
            //url:'GetPrivileges.do',
            idField:'menuid',
            treeField:'menuname',
            singleSelect:false,
            fit:true,
            toolbar:'#${tv}privilegeTreeBar',
            columns:[[
                {field:'ck',checkbox:true},
                {title:'菜单名称',field:'menuname',width:150},
                {title:'层级',field:'sortorder',width:150},
                {title:'入口方法',field:'url',width:150},
                {title:'描述',field:'description'}
            ]],
            onLoadSuccess:function(data){//加载完毕后获取所有的checkbox遍历
                //ajax查询目前已经拥有的菜单并进行标记
                //var x = $('#theroleName').text();
                var parerow = $('#${tv}grid').datagrid('getSelected');
                if(parerow != null && parerow != ''){
                    $.post('management/getMenuListByRoleid.do', {roleid:parerow.roleid}, function (data) {
                        var menu = JSON.parse(data);
                        //alert(role.length);
                        for(var i=0;i<menu.length;i++){
                            //alert(role[i].name+i);
                            var x = menu[i];
                            if(menu[i].menuid != null &&menu.menuid != '')
                                $('#${tv}rolePrivilegeTreeGrid').treegrid('select',menu[i].menuid);
                        }
                    });
                }
                //var row = $('#${tv}rolePrivilegeTreeGrid').treegrid('select','hello');

                $('#${tv}treegriddiv input:checkbox').each(function(index,el){
                    el.disabled=true;
                    /*
                     if(index%2 == 0)
                     el.checked=true;
                     */
                });
                //var rows = $(this).treegrid('getSelections');
            },
            onClickRow:function(row){
                //级联选择
                $(this).treegrid('cascadeCheck',{
                    id:row.menuid, //节点ID
                    deepCascade:true //深度级联
                });
            },
            loadFilter:function(data){
                //alert(data[0].name);
                //data[0].name= 'hello';
                //data[0].ck = true;
                //data[10].ck = false;
                return data;
            }
        });

        /**
         * 扩展树表格级联勾选方法：
         * @param {Object} container
         * @param {Object} options
         * @return {TypeName}
         */
        $.extend($.fn.treegrid.methods,{
            /**
             * 级联选择
             * @param {Object} target
             * @param {Object} param
             *      param包括两个参数:
             *          id:勾选的节点ID
             *          deepCascade:是否深度级联
             * @return {TypeName}
             */
            cascadeCheck : function(target,param){
                var opts = $.data(target[0], "treegrid").options;
                if(opts.singleSelect)
                    return;
                var idField = opts.idField;//这里的idField其实就是API里方法的id参数
                var status = false;//用来标记当前节点的状态，true:勾选，false:未勾选
                var selectNodes = $(target).treegrid('getSelections');//获取当前选中项
                for(var i=0;i<selectNodes.length;i++){
                    if(selectNodes[i][idField]==param.id)
                        status = true;
                }
                //级联选择父节点
                if(status==true)
                    selectParent(target[0],param.id,idField,status);
                selectChildren(target[0],param.id,idField,param.deepCascade,status);
                /**
                 * 级联选择父节点
                 * @param {Object} target
                 * @param {Object} id 节点ID
                 * @param {Object} status 节点状态，true:勾选，false:未勾选
                 * @return {TypeName}
                 */
                function selectParent(target,id,idField,status){
                    var parent = $(target).treegrid('getParent',id);
                    if(parent){
                        var parentId = parent[idField];
                        if(status)
                            $(target).treegrid('select',parentId);
                        else
                            $(target).treegrid('unselect',parentId);
                        selectParent(target,parentId,idField,status);
                    }
                }
                /**
                 * 级联选择子节点
                 * @param {Object} target
                 * @param {Object} id 节点ID
                 * @param {Object} deepCascade 是否深度级联
                 * @param {Object} status 节点状态，true:勾选，false:未勾选
                 * @return {TypeName}
                 */
                function selectChildren(target,id,idField,deepCascade,status){
                    //深度级联时先展开节点
                    if(!status&&deepCascade)
                        $(target).treegrid('expand',id);
                    //根据ID获取下层孩子节点
                    var children = $(target).treegrid('getChildren',id);
                    for(var i=0;i<children.length;i++){
                        var childId = children[i][idField];
                        if(status)
                            $(target).treegrid('select',childId);
                        else
                            $(target).treegrid('unselect',childId);
                        selectChildren(target,childId,idField,deepCascade,status);//递归选择子节点
                    }
                }
            }
        }); //extend

        ${tv}edr=-1;${tv}edtgrd=null; ${tv}acturl='';

        function ${tv}search(){
            $('#${tv}grid').datagrid({
                queryParams:{method: $('#${tv}srcType').combobox('getValue'),valone: $('#${tv}roleid').textbox('getValue')}
            });
            $('#${tv}grid').datagrid('load');
        }



        function ${tv}buildState(value,row){
            var states=["禁用","正常"];
            return states[value];
        }
        /*
         function ${tv}buildWareUser(value,row,rowIndex){
         if(this.field && row.usersn)
         return row.usersn[this.field];
         }
         */
    </script>
    <style>${style}</style>
</div>
</body>
</html>