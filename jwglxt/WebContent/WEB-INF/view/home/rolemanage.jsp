<%@page import="com.jw.common.JsonUtil"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%   
String path = request.getContextPath();   
String basePath = request.getScheme()+"://" +request.getServerName()+":"+request.getServerPort()+path+"/" ;   
%>   
<base href="<%=basePath%>" > 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>角色管理</title>
        <link rel="stylesheet" type="text/css" href="css/themes/gray/easyui.css">
        <link rel="stylesheet" type="text/css" href="css/themes/icon.css">
        <script type="text/javascript" src="javascript/public/jquery.min.js"></script>
        <script type="text/javascript" src="javascript/public/jquery.easyui.min.js"></script>
        <script type="text/javascript" src="javascript/public/pageload.js"></script>
        <style>html,body{height:100%; margin:0px;}</style>
        <%request.setAttribute("tv", JsonUtil.RandName());%>
    </head>
<body>
    <div id="${tv}" class="easyui-panel" data-options="border:false, fit:true, noheader:true">
        
        <table id="${tv}grid" class="easyui-datagrid">
        </table>
        
        <div id="${tv}tbar" style="padding : 2px 5px;">
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="addRow('${tv}grid')">新建角色</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="beforeRoleDelete()">删除角色</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="beforeRoleEdit()">修改角色</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="saveRow('${tv}grid')">保存角色</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-undo" plain="true" onclick="cancelRow('${tv}grid')">取消操作</a>
            <select id="${tv}srcType" class="easyui-combobox" data-options="prompt:'选择查询类型', value:'', panelHeight:'auto'" name="method" style="width:150px;">
                <option value="roleid">角色编号</option>
                <option value="rolename">角色名称</option>
            </select>
            <input id="${tv}valoneID" name="valone" class="easyui-searchbox" size="30" data-options="prompt:'输入查询内容', searcher:${tv}search" >
        </div>
        
        <script type="text/javascript">
            $(function(){

                $("#${tv}grid").datagrid({
                    //height :
                    //width :
                    iconCls : 'icon-search',
                    onDelete : ${tv}onGridDel,
                    onBeforeEnd : ${tv}onGridEndEdit,
                    onBeginEdit : ${tv}onGridBeginEdit,
                    //rownumbers : true,
                    singleSelect : true,
                    striped : true,
                    toolbar : '#${tv}tbar',
                    fit : true,
                    pagination : true,
                    pageSize:30,
                    url : 'getRole.do',
                    columns : [[
                    {
                        field : 'roleid',
                        title : '角色编号',
                        width : 100,
                        editor : {
                            type : 'validatebox',
                            options : {
                                required : true,
                                validType : 'length[1, 10]'
                            }
                        }
                    },
                    {
                        field : 'rolename',
                        title : '角色名称',
                        width : 100,
                        editor : {
                            type : 'validatebox',
                            options : {
                                required : true,
                                validType : 'length[1, 20]'
                            }
                        }
                    },
                    {
                        field : 'remark', 
                        title : '备注',
                        width : 150,
                        editor : {
                            type : 'validatebox',
                            options : {
                                required : false,
                                validType : 'length[1, 20]'
                            }
                        }
                    },
                    {
                        field : '', 
                        title : '选择',
                        width : 150,
                        checkbox : true
                    }        
                    ]]
                });
            });
            
            //设置分页控件 
		    var p = $("#${tv}grid").datagrid("getPager"); 
		    $(p).pagination({ 
		        //pageSize: 10,//每页显示的记录条数，默认为10 
		        //pageList: [5,10,15],//可以设置每页记录条数的列表 
		        beforePageText: "第",//页数文本框前显示的汉字 
		        afterPageText: "页    共 {pages} 页", 
		        displayMsg: "当前显示 {from} - {to} 条记录   共 {total} 条记录", 
		        /*onBeforeRefresh:function(){
		            $(this).pagination('loading');
		            alert('before refresh');
		            $(this).pagination('loaded');
		        }*/ 
		    });
		    
            ${tv}edr = -1;
            ${tv}edtgrd = null; 
            ${tv}acturl = '';
                
            function ${tv}search(){
                $('#${tv}grid').datagrid({
                    queryParams:{method : $('#${tv}srcType').combobox('getValue'), valone : $('#${tv}valoneID').textbox('getValue')}
                })        
                $('#${tv}grid').datagrid('load');
            }
             function beforeRoleDelete()
             {
                 var datagd = $("#${tv}grid");
                 var row = datagd.datagrid("getSelected");
                 if(row.init==1)
                 {
                     $.messager.alert('警告', '预置角色不可删除！');
                 }
                 else{
                     deleteRow('${tv}grid');
                 }
             }

            function ${tv}onGridDel(row, idx){
                var bRes = false;
                    subwindowdata("${tv}grid", "deleteRole.do?roleid=" + row.roleid, null, function(data){
                        bRes = $("input",$(data)).val() == "Success";
                        if(bRes == false) $.messager.alert("提示", $("span", $(data)).text());
                    });
                    return bRes;
            }
           
            function ${tv}onGridEndEdit(idex, row, changes){
                var bRes = false;
                var editor = $("#${tv}grid").datagrid("getEditor", {index:idex, field:'roleid'});
                var  url = "addRole.do";
                if($(editor.target).attr("readonly") == "readonly")
                    url = "editRole.do";
                subwindowdata("${tv}grid", url, row, function(data){
                   bRes = $("input",$(data)).val() == "Success";
                   if(bRes == false)
                       $.messager.alert("提示", $("span", $(data)).text());
                   else
                       $.messager.alert("提示", $("span", $(data)).text());

                });
                return bRes;
            }
            function beforeRoleEdit()
            {
                var datagd = $("#${tv}grid");
                var row = datagd.datagrid("getSelected");
                if(row.init==1)
                {
                    $.messager.alert('警告', '预置角色不可修改！');
                }
                else{
                    editRow('${tv}grid');

                }
            }
            function ${tv}onGridBeginEdit(idex,row){
                var editor= $("#${tv}grid").datagrid("getEditor",{index:idex,field:'roleid'});
                //var p= $("#${tv}grid").datagrid("getEditor",{index:idex,field:'pcount'});
                //var s= $("#${tv}grid").datagrid("getEditor",{index:idex,field:'scount'});
                //$(p.target).attr("readonly",true);
                //$(s.target).attr("readonly",true);
                if(row.roleid==undefined||row.roleid==""){
                    //$(p.target).val(0);
                    //$(s.target).val(0);
                    return;
                }
                else
                    $(editor.target).attr("readonly",true);
            }
            
            function ${tv}onWndClose(){
                $("#${tv}grid").datagrid("reload");
            }
            
            function ${tv}buildState(value, row){
                var states = ["禁用", "正常"];
                return states[value];
            }

            function ${tv}initState(value, row){
                var Status = ['非预置','预置'];
                return Status[value];
            }

        </script>
    </div>
</body>
</html>