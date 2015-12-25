<%@page import="com.jw.common.JsonUtil"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%><%@ include file="/tagLib.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%   
String path = request.getContextPath();   
String basePath = request.getScheme()+"://" +request.getServerName()+":"+request.getServerPort()+path+"/" ;   
%>   
<base href="<%=basePath%>" > 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>用户管理</title>
<!--         <link rel="stylesheet" type="text/css" href="css/themes/gray/easyui.css"> -->
        <link rel="stylesheet" type="text/css" href="css/themes/icon.css">
        <script type="text/javascript" src="javascript/public/jquery.min.js"></script>
        <script type="text/javascript" src="javascript/public/jquery.easyui.min.js"></script>

        <script type="text/javascript" src="javascript/public/pageload.js"></script>

        <style>html,body{height:100%; margin:0px;}</style>
        <%request.setAttribute("tv", JsonUtil.RandName());%>
    </head>
<body>
    <div id="${tv}" class="easyui-panel" data-options="border:false, fit:true, noheader:true">
        
        <table id="${tv}grid" class="">
        </table>
        
        <div id="${tv}tbar" style="padding : 2px 5px;">
            <table>
                <tr>
                    <td>
                        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="addRow('${tv}grid')">新建用户</a>
                    </td>
                    <td>
                        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="beforeUserDelete()">删除用户</a>
                    </td>
                    <td>
                        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="beforeUserEdit()">修改用户</a>
                    </td>
                    <td><a class="datagrid-btn-separator"></a></td>
                    <td>
                        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="saveRow('${tv}grid')">确定操作</a>
                    </td>
                    <td>
                        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-undo" plain="true" onclick="cancelRow('${tv}grid')">取消操作</a>
                    </td>
                    <td><a class="datagrid-btn-separator"></a></td>
                    <td>
                        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editPWD('${tv}grid')">修改密码</a>
                    </td>
                    <td>
                        <select id="${tv}srcType" class="easyui-combobox" data-options="prompt:'选择查询类型', value:'', panelHeight:'auto'" name="method"style="width:150px;">
                            <option value="username">用户名</option>
                        </select>
                    </td>
                    <td>
                        <input id="${tv}valoneID" name="valone" class="easyui-searchbox" size="30" data-options="prompt:'输入查询内容', searcher:${tv}search" >

                    </td>
                </tr>
            </table>
        </div>
        <script type="text/javascript">
            $(function(){
                $.ajax({
                    async: false,
                    type : "get",
                    url : 'getAllRoles',
                    dataType : 'json',
                    success : function(data) {
                        roleList=data;
                    }
                });
               /*  $.ajax({
                    async: false,
                    type : "get",
                    url : 'getDeptList',
                    dataType : 'json',
                    success : function(data) {
                        deptList=data;
                    }
                }); */
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
                    url : 'getUser',
                    columns : [[
                    {
                        field : 'id',
                        title : '用户编号',
                        width : 100,
                        hidden:true,
                        editor : {
                            type : 'validatebox',
                            options : {
                                required : false,
                                validType : 'length[0, 10]'
                            }
                        }
                    },
                    {
                        field : 'uname',
                        title : '用户名',
                        width : 100,
                        editor : {
                            type : 'validatebox',
                            options : {
                                required : true,
                                missingMessage:'用户名为空',
                                validType : 'length[1, 20]',

                            }
                        }
                    },
                        {
                            field : 'upwd',
                            title : '用户密码',
                            width : 100,
                            hidden:true,
                            formatter:function(){return "******"},
                            editor : {
                                type : 'validatebox',
                                options : {
                                    required : false,
                                    missingMessage:'用户密码为空',
                                    validType : 'length[1, 20]'
                                }
                            }
                        },
                        {
                            field : 'rname',
                            title : '真实姓名',
                            width : 100,
                            editor : {
                                type : 'validatebox',
                                options : {
                                    required : true,
                                    missingMessage:'真实姓名为空',
                                    validType : 'length[1, 20]'
                                }
                            }
                        },
                       /*  {
                            field : 'department',
                            title : '部门',
                            width : 150,
                            formatter: function(value,row,index){
                                deptname = 'null';
                                $(deptList).each(function(i,e){
                                    if(e.deptid===value)
                                    {
                                        deptname = e.deptname;
                                        return;
                                    }
                                })
                                return deptname;
                            }, 
                            editor : {
                                type:'combobox',options : {
                                    valueField: 'deptid',
                                    textField: 'deptname',
                                    panelHeight: 'auto',
                                    method:'get',
                                    data: deptList,
                                    required: true,
                                    missingMessage:'部门为空',
                                    editable:false
                                }
                            }
                        },*/
                    {
                        field : 'roleid',
                        title : '用户角色',
                        width : 150,
                        formatter: function(value,row,index){
                            rolename = 'null';
                            $(roleList).each(function(i,e){
                                if(e.roleid===value)
                                {
                                    rolename = e.rolename;
                                    return;
                                }
                            })
                            return rolename;
                        },
                        editor : {
                            type:'combobox',options : {
                                valueField: 'roleid',
                                textField: 'rolename',
                                panelHeight: 'auto',
                                method:'get',
                                data: roleList,
                                onBeforeLoad: function(param){
                                    //param.where = '_where';
                                },
                                required: true,
                                missingMessage:'用户角色为空',
                                editable:false
                            }
                        }
                    },
                        {
                            field : 'remark',
                            title : '备注',
                            width : 100,
                            editor : {
                                type : 'text'
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


            function editPWD(theGrid){
                var datagd=$("#"+theGrid);
                if("undefined"!=typeof datagd.attr("editRow")) return;
                var row = datagd.datagrid("getSelected");
                if (row){
                    $('[textboxname="passwd"]').remove();
                    var d= $('<form>').data('url','editPWD')
                            .append($('<p>').
                                    append(
                                    $('<input type="hidden" name="userid" data-title="用户ID" value="'+row.userid+'">')))
                            .append($('<p>').css('text-align','center')
                                    .append($('<input type="text" class="passwd" style="width:200px" name="passwd" data-title="输入密码">')))
                            .append($('<p>').css('text-align','center')
                                    .append($('<input type="text" name="same" style="width:200px" class="same" data-title="确认密码">'))).dialog({
                                modal:true,
                                title:'修改密码:'+row.username,
                                width:250,
                                buttons:[{
                                    text:'提交',
                                    handler:function(){
                                        if(!$('input:text.same',d).validatebox('isValid')){
                                            messageHelper.show("错误", '输入为空或两次输入的密码不一致！');
                                        }
                                        else
                                        {
                                            $.post(d.data('url'),d.serializeArray(),function(data){
                                                d.window('close');
                                                messageHelper.show("成功", data.Message);
                                            },"json");
                                        }
                                    }
                                },
                                    {
                                        text:'关闭',
                                        handler:function(){d.window('close')}
                                    }]
                            });
                    $('input:text',d).each(function(i,e){$(e).textbox({
                        buttonText:$(e).data('title'),buttonAlign:'left',type:'password'
                    });})
                    $('input:text.same',d).validatebox({required:true,validType:'equals["input:text.passwd"]'});
                }
                else
                {
                    $.messager.alert('警告','您还没有选择操作行！');
                }
            }

            function ${tv}search(){
                $('#${tv}grid').datagrid({
                    queryParams:{method : $('#${tv}srcType').combobox('getValue'), valone : $('#${tv}valoneID').textbox('getValue')}
                })        
                $('#${tv}grid').datagrid('load');
            }
            function beforeUserDelete()
            {
                var datagd = $("#${tv}grid");
                var row = datagd.datagrid("getSelected");
                if(row.init==1)
                {
                    $.messager.alert('警告', '预置用户不可删除！');
                }
                else{
                    deleteRow('${tv}grid');
                }
            }
            function ${tv}onGridDel(row, idx){
                var bRes = false;
                    subwindowdata("${tv}grid", "deleteUser?id=" + row.id, null, function(data){
                        bRes = $("input",$(data)).val() == "Success";
                        if(bRes == false)
                        {
                            $.messager.alert("失败", $("span", $(data)).text() || $(data).eq(0).text());
                        }
                        else{
                            messageHelper.info("成功", $("span", $(data)).text());
                        }
                    });
                    return bRes;
            }
            function beforeUserEdit()
            {
                var datagd = $("#${tv}grid");
                var row = datagd.datagrid("getSelected");
                if(row.init==1)
                {
                    $.messager.alert('警告', '预置用户不可修改！');
                }
                else{
                    editRow('${tv}grid');
                }
            }
            function ${tv}onGridEndEdit(idex, row, changes){
                var bRes = false;
                var editor = $("#${tv}grid").datagrid("getEditor", {index:idex, field:'id'});
                var  url = "addUser";
                if($(editor.target).attr("readonly") == "readonly")
                         url = "editUser";
                    subwindowdata("${tv}grid", url, row, function(data){
                        if(data.indexOf('isAjax')>=0){
                            data = eval('('+data+')');
                            bRes = data.Result == "Success";
                            if(bRes == false){
                                $.messager.alert("失败", data.Message);
                            }
                            else{messageHelper.info("成功",data.Message);}
                        }
                        else{
                            bRes = $("input",$(data)).val() == "Success";
                            if(bRes == false){
                                $.messager.alert("失败", $("span", $(data)).text() || $(data).eq(0).text());
                            }
                            else{messageHelper.info("成功", $("span", $(data)).text());}
                        }

                    });
                    return bRes;


            }

            function ${tv}onGridBeginEdit(idex,row){
                console.log(1);
                //hide passwd
                $("#${tv}grid").datagrid("getEditor",{index:idex,field:'upwd'}).target.val('');
                var editor= $("#${tv}grid").datagrid("getEditor",{index:idex,field:'id'});
                var s= $("#${tv}grid").datagrid("getEditor",{index:idex,field:'uname'});
                    $(p.target).attr("readonly",true);
                    if(row.id==undefined){
                        //$(p.target).val(0);
                        //$(s.target).val(0);

                        return;
                    }
                    else{
                        $(s.target).attr("readonly",true);
                        $(editor.target).attr("readonly",true);
                    }



            }
            
            function ${tv}onWndClose(){
                $("#${tv}grid").datagrid("reload");
            }
            
            function ${tv}buildState(value, row){
                if(undefined!=value&&Status[value])
                    return Status[value].statusname;
            }
            function ${tv}initState(value, row){
                var Status = ['非预置','预置'];
                return Status[value];
            }
        </script>
    </div>
</body>
</html>