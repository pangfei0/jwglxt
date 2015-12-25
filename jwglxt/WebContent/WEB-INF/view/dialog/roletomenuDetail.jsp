<%--
  Created by IntelliJ IDEA.
  User: 53804
  Date: 2015/9/4
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/tagLib.jsp" %>
<html>
<head>
    <title></title>
</head>
<body>
<div style="float:left;height:167px; padding:5px;">
  <select multiple="multiple" id="select3" style="width:150px; height:167px; padding:5px; " onchange="getselectValue()">
  </select>
</div>
<div style="float:left;height:167px; padding:5px;">
  <select multiple="multiple" id="select1"  style="width:150px; height:167px; padding:5px;" >
    <option value="1">选项1</option>
    <option value="2">选项2</option>
    <option value="3">选项3</option>
    <option value="4">选项4</option>
    <option value="5">选项5</option>
    <option value="6">选项6</option>
    <option value="7">选项7</option>
  </select>
  <span style="  display:block; width:100px; background:#eee; cursor:pointer; border:1px solid #ccc; padding:5px 0; margin:5px 0;"id="remove">移除选中权限>></span>
  <span style=" display:block; width:100px; background:#eee; cursor:pointer; border:1px solid #ccc; padding:5px 0; margin:5px 0;"id="remove_all">移除全部权限>></span></div>
<div style="float:left;height:167px; padding:5px;">
  <select multiple="multiple" id="select2"  style="width:150px; height:167px; padding:5px;">
  </select>
  <span style=" display:block; width:100px; background:#eee; cursor:pointer; border:1px solid #ccc; padding:5px 0; margin:5px 0;" id="add">添加选中权限>></span>
  <span style=" display:block; width:100px; background:#eee; cursor:pointer; border:1px solid #ccc; padding:5px 0; margin:5px 0;" id="add_all">移除全部权限></span>
</div>
<script type="text/javascript">
  $(function(){

    $.ajax({
      async: false,
      type : "POST",
      url : 'getRoleList.do',
      dataType : 'json',
      success : function(data) {
        var str="";
        $.each(data,function(i,n){
                  //<option value="1">选项1</option>
                  str+="<option value='"+ n.roleid+"'>"+ n.rolename+"</option>";
                }
        );
        $("#select3").append(str);
      }
    });
    //按钮----移除选中的已有权限
    $("#remove").click(function(){
      $("#select1 option:selected").appendTo("#select2");
    });
    //按钮----增加选中未有权限
    $("#add").click(function(){
      var roleid = $("#select3 option:selected").val();
      var str="";
      var list= $("#select2 option:selected");
      for(var i=0;i<list.length;i++)
      {
        str+=list[i].value+",";
      }
      $.ajax({
        async: false,
        type: 'post',
        url: 'addRoletomenu.do',
        data: {roleid: roleid,menuids:str},
        dataType: 'json',
        success: function (data) {
          bRes = $("input",$(data)).val() == "Success";
          if(bRes == false) $.messager.alert("提示", $("span", $(data)).text());
        }

      })
      $("#select2 option:selected").appendTo("#select1");

    });
   //按钮----移除所有权限
    $("#remove_all").click(function(){

      $("#select1 option").appendTo("#select2");

    });//按钮----添加所有未有权限
    $("#add_all").click(function(){

      $("#select2 option").appendTo("#select1");

    });
    //双击移除已有权限
    $("#select1").dblclick(function(){

      $("#select1 option:selected").appendTo("#select2");

    });
     //双击添加未有权限
    $("#select2").dblclick(function(){
      var roleid = $("#select3 option:selected").val();
      var str="";
      var list= $("#select2 option:selected");
      for(var i=0;i<list.length;i++)
      {
        str+=list[i].value+",";
      }
      $.ajax({
        async: false,
        type: 'post',
        url: 'addRoletomenu.do',
        data: {roleid: roleid,menuids:str},
        dataType: 'json',
        success: function (data) {
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

      })
      $("#select2 option:selected").appendTo("#select1");
    });

  })

  function getselectValue() {
    var roleid = $("#select3 option:selected").val();
    //获取没有的权限
    $.ajax({
      async: false,
      type: 'post',
      url: 'getMenuListnoByRoleid.do',
      data: {roleid: roleid},
      dataType: 'json',
      success: function (data) {
        var str = "";
        $.each(data, function (i, n) {
          str += "<option value='" + n.menuid + "'>" + n.menuname + "</option>";
        })
        $("#select2").html(str);
      }
    });
    //获取已权限
    $.ajax({
      async: false,
      type: 'post',
      url: 'getMenuListByRoleid.do',
      data: {roleid: roleid},
      dataType: 'json',
      success: function (data) {
        var str = "";
        $.each(data, function (i, n) {
          str += "<option value='" + n.menuid + "'>" + n.menuname + "</option>";
        })
        $("#select1").html(str);
      }
    });
  }
</script>
</body>

</html>
