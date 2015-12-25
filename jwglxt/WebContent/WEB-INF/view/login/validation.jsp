<%--
  Created by IntelliJ IDEA.
  User: 53804
  Date: 2015/11/19
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
  <title>验证影吧信息</title>
  <link rel="stylesheet" type="text/css" href="css/themes/gray/easyui.css">
  <link rel="stylesheet" type="text/css" href="css/themes/icon.css">
  <script type="text/javascript" src="javascript/public/jquery.min.js"></script>
  <script type="text/javascript" src="javascript/public/jquery.easyui.min.js"></script>
  <style>
    .head
    {
      width:100%;
      background-color: #A0C5E8;;
      text-align: center;
      height:100px;
    }
    .head h1
    {
      padding-top:26px;
    }
    .main
    {
      font-size: 20px;
    }
    .info {
      margin-left: 805px;
      margin-top: 50px;
    }
  </style>
  <script>
    //验证按钮点击事件
    function validation()
    {
      $.ajax({
         async:false,
         type: 'post',
         url: 'validation',
         data:{'moviebarname':$("#moviebarname").textbox("getValue")},
         dataType: 'json',
         success:function(data){
           if(data.result=="success"){
             $.messager.confirm('提示', data.msg, function(r){
               if (r){
                 window.location.href="login";
               }
             });
           }else{
             $.messager.alert("提示",data.msg,'warning');
           }
         },error:function(){
           $.messager.alert("错误",'网络通讯错误！','error');
         }
       });
    }

  </script>
</head>
<body>
<div class="head"><h1>影吧初始化信息验证</h1></div>
<div class="main">
  <div class="info">
    <div style="margin-top:20px;">
      <label>影吧名称:</label> <input class="easyui-textbox" name="moviebarname" id="moviebarname">
    </div>
    <div style="margin-top:20px;"><a type="button" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" onclick="validation()">验证</a></div>
  </div>


</div>
</body>
</html>
