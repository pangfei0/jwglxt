<%--
  Created by IntelliJ IDEA.
  User: 53804
  Date: 2015/8/25
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/tagLib.jsp" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>影吧信息管理</title>
    <link rel="stylesheet" type="text/css" href="css/basic.css">
  <link rel="stylesheet" type="text/css" href="css/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="css/themes/gray/easyui.css">

    <script type="text/javascript" src="javascript/public/jquery.min.js"></script>
  <script type="text/javascript" src="javascript/public/jquery.easyui.min.js"></script>
  <script type="text/javascript" src="javascript/public/pageload.js"></script>
  <style>
    html,body {
      height: 100%;
      margin: 0px;
    }

  </style>
</head>
<body>
<link rel="stylesheet" type="text/css" href="css/moviebarmanage.css">
<div id="${tv}" class="easyui-panel"
     data-options="border:false, fit:true, noheader:true">
  <div id="barinfo"  class="easyui-panel"   data-options="border:false, fit:true, noheader:true ,title:'影吧信息'">
    <table class="basictable">
            <tr><td class="td_1">影吧名称:</td><td><span id="name_1">${name}</span></td></tr>
            <tr><td class="td_1">所有者:</td><td><span id="owner_1">${owner}</span></td></tr>
            <tr><td class="td_1">影吧管理员：</td><td><span id="manager_1">${manager}</span></td></tr>
            <tr><td class="td_1">影吧地址：</td><td><span id="address_1">${address}</span></td></tr>
            <tr><td class="td_1">影吧电话：</td><td><span id="telephone_1">${telephone}</span></td></tr>
            <tr><td class="td_1">影吧传真：</td><td><span id="fax_1">${fax}</span></td></tr>
            <tr><td class="td_1">影吧LOGO：</td><td>
                <c:if test="${logo!=null}">
                <img id="logo_1"  src="image/upload/logo/${logo}"width="200" height="100">
                </c:if>
                <c:if test="${logo}==null||${logo}==''">
                <span id="logo_1">${logo}</span>
                </c:if>
            </tr>
            <tr><td class="td_1">影吧IP：</td><td><span id="publicip_1">${publicip}</span></td></tr>

        <tr><td class="td_1">修改影片时间：</td><td><span id="changeMtime_1">${changeMtime}（分钟）</span></td></tr>
            <tr><td class="td_1">影吧描述：</td><td style="min-width: 200px; max-width: 200px; word-break:break-all;word-wrap:break-word;white-space: pre-wrap; "><span id="description_1">${description}</span></td></tr>
            <tr><td class="td_1">备注：</td><td style="min-width: 200px; max-width: 200px; word-break:break-all;word-wrap:break-word;white-space: pre-wrap; "><span id="remark_1">${remark}</span></td></tr>
            <tr><td colspan="2"><a href="javascript:void(0)"  class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="edit_click()" style="width:100%">修改影吧信息</a></td></tr>
    </table>
  </div>
  <div id="editbar"   style="display: none" class="easyui-panel"   data-options="border:false, fit:true, noheader:true ,title:'影吧信息'">
      <div class="easyui-panel" title="修改影吧信息 " style="width:900px">
          <div style="padding:10px 60px 20px 60px">
              <form id="editmoviebarform" method="post"  enctype="multipart/form-data">
                  <input type="hidden" name="logoname" id="logoname">
                  <table cellpadding="5" class="basictable">
                      <tr><td class="td_1">影吧名称:</td><td><input class="easyui-textbox"    id="name" name="name" data-options="required:true,missingMessage:'请输入影吧名称。'"  style="width:200px" /></td><td class="td_1">所有者:</td><td><input class="easyui-textbox"   id="owner" name="owner" data-options="required:true,missingMessage:'请输入影吧所有者。'" style="width:200px"/></td></tr>
                      <tr></tr>
                      <tr><td class="td_1">影吧管理员：</td><td><input class="easyui-textbox"    id="manager" name="manager"  data-options="required:true,missingMessage:'请输入影吧管理员。'" style="width:200px"/></td><td class="td_1">影吧地址：</td><td><input class="easyui-textbox"   id="address" name="address"  data-options="required:true,missingMessage:'请输入影吧地址。'" style="width:200px" /></td></tr>
                      <tr><td class="td_1">影吧LOGO：</td>
                          <td><input type="file" name="pic" ></td>
                          <td class="td_1">影吧IP：</td><td><input class="easyui-textbox"   id="publicip" name="publicip" validtype="ip" data-options="required:true,missingMessage:'请输入影吧IP。'" style="width:200px"/></td>
                      </tr>
                      <tr><td class="td_1">影吧传真：</td><td colspan="3"><input class="easyui-textbox"   id="fax" name="fax"   validtype="faxno" data-options="required:true,missingMessage:'请输入影吧传真。'" style="width:200px"/></td></tr>
                      <tr><td class="td_1">影吧电话：</td><td colspan="3"><input class="easyui-textbox"   id="telephone"  name="telephone"  validtype="phone" data-options="required:true,missingMessage:'请输入影吧电话。'" style="width:200px"/></td></tr>
                      <tr><td class="td_1">影片更改时间：</td><td colspan="3"><input class="easyui-textbox"   id="changeMtime" name="changeMtime" validtype="posinteger" data-options="required:true,missingMessage:'请输入电影更改时间段。',invalidMessage:'请输入整数。'" style="width:200px"/>(分钟)</td>
                      </tr>
                      <tr><td class="td_1">影吧描述：</td><td colspan="3"><input class="easyui-textbox"   id="description"  name="description" data-options="required:true, multiline:true,missingMessage:'请输入影吧描述。'" style="height:60px;width:500px" /></td></tr>
                      <tr></tr>
                      <tr><td class="td_1">备注：</td><td colspan="3"><input class="easyui-textbox"  id="remark" name="remark" data-options="multiline:true" style="height:60px;width:500px"  /></td></tr>
                  </table>
              </form>
              <div style="text-align:center;padding:5px">
                  <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save"  onclick="javascript:$('#editmoviebarform').submit()">提交</a>
                  <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-no"  onclick="quitUpdate()">取消</a>
              </div>
          </div>
  </div>
     <%-- <form id="editmoviebarform"  method="post" enctype="multipart/form-data">
          <input type="hidden" name="logoname" id="logoname" >
                 <div>
                     <label for="name">影吧名称:</label><input class="easyui-textbox"    id="name" name="name" data-options="required:true,missingMessage:'请输入影吧名称。'"/>
                 </div>
                <div>
                   <lable for="owner">所有者:</lable><input class="easyui-textbox"   id="owner" name="owner" data-options="required:true,missingMessage:'请输入影吧所有者。'" />
                </div>
              <div>
                   <lable for="manager">影吧管理员：</lable><td><input class="easyui-textbox"    id="manager" name="manager"  data-options="required:true,missingMessage:'请输入影吧管理员。'"/>
              </div>
              <div>
                   <label for="address">影吧地址：</label><input class="easyui-textbox"   id="address" name="address"  data-options="required:true,missingMessage:'请输入影吧地址。'" />
              </div>
              <div>
                   <label for="telephone">影吧电话：</label><input class="easyui-textbox"   id="telephone"  name="telephone" data-options="required:true,missingMessage:'请输入影吧电话。'"/>
              </div>
              <div>
                   <label for="fax">影吧传真：</label><input class="easyui-textbox"   id="fax" name="fax" data-options="required:true,missingMessage:'请输入影吧传真。'"/>
              </div>
              <div>
                   <label for="publicip">影吧IP：</label><input class="easyui-textbox"   id="publicip" name="publicip"  data-options="required:true,missingMessage:'请输入影吧IP。'"/>
              </div>
              <div>
                   <label for="description">影吧描述：</label><input class="easyui-textbox"   id="description"  name="description" data-options="required:true,missingMessage:'请输入影吧描述。'"/>
              </div>
              <div>
                  <label for="remark">备注：</label><input class="easyui-textbox"  id="remark" name="remark"  />
              </div>
              <div>
                  <label for="pic">影吧LOGO：</label> <div id="pic1"> <input type='file'style='width:100%' name='pic' id='pic'></div>

              </div>








   &lt;%&ndash; <tr><td colspan="2" class="td_1"><input type="button" class="easyui-linkbutton" iconCls="icon-save" onclick="javascript:$('#editmoviebarform').submit()" value="保存" style="width:100%"/></td></tr>&ndash;%&gt;
      </form>--%>
  <%--    <button  class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="">提交</button>--%>


  </div>


</div>
<script>
  function edit_click(){
      $.ajax({
          async: false,
          type : "get",
          url : 'getMoviebar.do',
          dataType : 'json',
          success : function(data) {
              $("#name").textbox('setValue',data['name']);
              $("#owner").textbox('setValue',data['owner']);
              $("#manager").textbox('setValue',data['manager']);
              $("#address").textbox('setValue',data['address']);
              $("#telephone").textbox('setValue',data['telephone']);
              $("#fax").textbox('setValue',data['fax']);
              //图片
              if(data['logo']==""||data['logo']==undefined)
              {

              }
              else
              {
                  $("#logoname").val(data['logo']);
              }
              $("#changeMtime").textbox('setValue',data['changeMtime']);
              $("#publicip").textbox('setValue',data['publicip']);
              $("#description").textbox('setValue',data['description']);
              $("#remark").textbox('setValue',data['remark']);
          }
      });
    $("#barinfo").css('display','none');
    $("#editbar").css('display','block');

  }
  $("#editmoviebarform").form({
    url: 'editMoviebar.do',
    onSubmit: function(){
      var isValid = $(this).form('validate');
            var filepath = $("input[name='pic']").val();
            var extStart = filepath.lastIndexOf(".");
            var ext = filepath.substring(extStart, filepath.length).toUpperCase();
            if (ext != ".BMP" && ext != ".PNG" && ext != ".GIF" && ext != ".JPG" && ext != ".JPEG"&&filepath!=""&&filepath!=undefined)
            {

                    isValid = false;
                    $.messager.alert('图片格式错误',"图片限于bmp,png,gif,jpeg,jpg格式",'info');

            }
      $.messager.progress({
        msg: "正在发送数据..."
      });
      if (!isValid){
        $.messager.progress('close');	// 当form不合法的时候隐藏工具条
      }
      return isValid;	// 返回false将停止form提交
    },
    success: function(data){
      $.messager.progress("close");
      bRes = $("input", $(data)).val() == "Success";
        if(bRes == false)
        {
            $.messager.alert("提示", $("span", $(data)).text());
        }
     else {
        var logo1= $("label", $(data)).text()
        $("#name_1").html($("#name").textbox('getValue'));
        $("#owner_1").html($("#owner").textbox('getValue'));
        $("#manager_1").html($("#manager").textbox('getValue'));
        $("#address_1").html($("#address").textbox('getValue'));
        $("#telephone_1").html($("#telephone").textbox('getValue'));
        $("#fax_1").html($("#fax").textbox('getValue'));
        $("#logo_1").attr("src","image/upload/logo/"+logo1)
        $("#publicip_1").html($("#publicip").textbox('getValue'));
            $("#changeMtime_1").html($("#changeMtime").textbox('getValue'));
            $("#description_1").html($("#description").textbox('getValue'));
        $("#remark_1").html($("#remark").textbox('getValue'));
       $("#barinfo").css('display','block');
       $("#editbar").css('display','none');
        messageHelper.info("成功", "修改成功！","info");
        //
      }
    },
    onLoadError:function(data)
    {
      $.messager.progress("close");
      $.messager.alert("网络通信失败！");
    }
  })
    //取消修改
    function quitUpdate()
    {
        $("#barinfo").css('display','block');
        $("#editbar").css('display','none');
    }

  $.extend($.fn.validatebox.defaults.rules, {
      ip: {// 验证IP地址
          validator: function (value) {
              var reg = /^((1?\d?\d|(2([0-4]\d|5[0-5])))\.){3}(1?\d?\d|(2([0-4]\d|5[0-5])))$/ ;
              return reg.test(value);
          },
          message: 'IP地址格式不正确'
      }
  });
</script>
</body>
</html>