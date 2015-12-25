<%--
  Created by IntelliJ IDEA.
  User: wangpu
  Date: 2015/8/12
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://" +request.getServerName()+":"+request.getServerPort()+path+"/" ;
%>
<base href="<%=basePath%>">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>影吧管理系统</title>
  <link rel="stylesheet" type="text/css" href="css/themes/gray/easyui.css">
  <link rel="stylesheet" type="text/css" href="css/themes/icon.css">

  <script type="text/javascript" src="javascript/public/jquery.min.js"></script>
  <script type="text/javascript" src="javascript/public/jquery.easyui.min.js"></script>
  <script type="text/javascript" src="javascript/public/easyui-lang-zh_CN.js"></script>
  <script type="text/javascript" src="javascript/public/pageload.js"></script>
  <script type="text/javascript" src="javascript/public/validatebox-extends.js"></script>
  <script type="text/javascript" src="javascript/public/datagrid-detailview.js"></script>
  <script type="text/javascript" src="javascript/public/moment.js"></script>
  <script type="text/javascript" src="javascript/My97DatePicker/WdatePicker.js"></script>
<%--  <script type="text/javascript" src="javascript/roomprice/saveRoomprice.js"></script>--%>

  <!--[if IE]>
  <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->
  <style>
    html,body {
      margin: 0; /* Remove body margin/padding */
      padding: 0;
      font-size: 85%;
      color: #2E6E9E;
      background: #b6b7bc;
    }

    article,aside,figure,footer,header,hgroup,menu,nav,section {
      display: block;
    }
    .weekdayhidden{
      display: none;
    }
    .west {
      width: 220px;
      padding: 10px;
    }

    .north {
      height: 100px;
      overflow: hidden;
      /*background: rgba(255, 255, 255, 0.5);*/
/*       background-image: url("../../../image/fot_bg.png"); */
    }
    .north h1{
      color: #98A24A;
      margin-left: 200px;
    }
    .north table,.north table a{color: #615959;}
    .logo{
      width:200px;
      height:100px;
      float:left;
     /*  background-image: url("../../../image/mj_logo.png"); */
    }
    .south {
      height: 50px;
      overflow: hidden;
      /*color: #4e5766;*/
      color: #fff;
      padding-bottom: 6px;
      margin: 0px auto;
/*      line-height: normal;*/
      font-size: 1.2em;
      text-align: center;
      /*background: rgba(255, 255, 255, 0.5);*/
      line-height:4;
      /* background-image: url("../../../image/fot_bg.png"); */
    }

    #userinfo{
      font-size :14px;
      color:blue;
     /* margin-left:15px;*/
      margin-left: 200px;
      height:25px;
    }


    .main {
      width: 630px;
      margin: 0 auto;
      font-family: "微软雅黑";
      font-size: 15px;
    }
    .title {
      font-size: 24px;
      margin: 10px auto;
      width: 144px
    }
    .subtitle {
      font-weight: bold;
      margin:10px 0;
    }
    .odd{
      width:105px;
    }
    .even{
      width:176px;
    }
    .tab {
      text-align: left;
      margin-left:64px;
      border-spacing:0;
      font:inherit;
    }
    .tab td {
      height: 27px;
      padding:0;
    }
    label{
      display: inline-block;
      margin-bottom: 5px;
    }
    .lab1{
      font-weight:bolder;
    }

  </style>
</head>
<body class="easyui-layout layout panel-noscroll" style="text-align:left">
<div region="north" class="north">
  <div class="logo"></div>
  <h1>XX管理系统</h1>
  <div id="userinfo">
    
    <table style="width:100%;min-width:760px;">
      <tr>
        <td style="width:80%;">当前用户：<span id="user"><%=session.getAttribute("rname")%></span>&nbsp;&nbsp;
          角色：<%=session.getAttribute("rolename")%>&nbsp;&nbsp;</td>
        <td style="display:none">
          <span id="deptid"><%=session.getAttribute("deptid")%></span>
          <span id="roleid"><%=session.getAttribute("roleid")%></span></td>
        <td style="width:10%"><a href="logOut.do"
                                 style="float:right;margin-right:15px;font-size :14px;">退出系统</a>
        </td>
      </tr>
    </table>

  </div>
</div>
<div region="center" class="center">
  <div class="easyui-tabs" data-options="fit:true,border:false" fit="true" border="false" id="tabs">
    <div title="欢迎使用">
      欢迎使用XX教务管理系统
    </div>
  </div>
</div>
<div region="west" class="west" title="功能菜单">
  <ul id="tree"></ul>
</div>
<div region="south" class="south">版权所有 &copy; 苏州大学计算机科学与技术学院 2015
</div>

<div id="tabsMenu" class="easyui-menu" style="width:120px;">
  <div name="close">关闭</div>
  <div name="Other">关闭其他</div>
  <div name="All">关闭所有</div>
</div>
<script type="text/javascript">
//动态时间
function getNowTime(){
  var now = new Date();
 /* var month = now.getMonth();
  if(month<10){
    month = "0"+month;
  }*/
  var day = now.getDate();
  if(day<10){
    day = "0"+day;
  }
  var hour = now.getHours();
  if(hour<10){
    hour = "0"+hour;
  }
  var minute = now.getMinutes();
  if(minute<10){
    minute = "0"+minute;
  }
  var second = now.getSeconds();
  if(second<10){
    second = "0"+second;
  }
  $("#currenttime").text(now.getFullYear()+"-"+(now.getMonth()+1)+"-"+day+" "+hour+":"+minute+":"+second);
}
window.setInterval("getNowTime()",1000);

  $(function () {
   
    //实例化树形菜单
    $("#tree").tree({
      url : 'management/leftMenu.do',
      lines : true,
      onContextMenu: function(e, title){
        e.preventDefault();
        $("#tabsMenu").menu('show', {
          left: e.pageX,
          top: e.pageY
        }).data("tabTitle", title.text);
      },
      onClick : function(node){
        if (node.attributes) {
          Open(node.text, node.attributes.url);
        }
      }
    });
    
    //在右边center区域打开菜单，新增tab
    function Open(text, url) {
      if ($("#tabs").tabs('exists', text)) {
        $('#tabs').tabs('select', text);
      } else {
        $('#tabs').tabs('add', {
          title : text,
          border:false,
          closable : true,
          href : url,
          onLoad:function(){
            console.log('onLoad');
          }
        });
      }
    }

    //绑定tabs的右键菜单
    $("#tabs").tabs({
      onContextMenu : function (e, title) {
        e.preventDefault();
        $('#tabsMenu').menu('show', {
          left : e.pageX,
          top : e.pageY
        }).data("tabTitle", title);
      }
    });

    //实例化menu的onClick事件
    $("#tabsMenu").menu({
      onClick : function (item) {
        CloseTab(this, item.name);
      }
    });

    //几个关闭事件的实现
    function CloseTab(menu, type) {
      var curTabTitle = $(menu).data("tabTitle");
      var tabs = $("#tabs");

      if (type === "close") {
        tabs.tabs("close", curTabTitle);
        return;
      }

      var allTabs = tabs.tabs("tabs");
      var closeTabsTitle = [];

      $.each(allTabs, function () {
        var opt = $(this).panel("options");
        if (opt.closable && opt.title != curTabTitle && type === "Other") {
          closeTabsTitle.push(opt.title);
        } else if (opt.closable && type === "All") {
          closeTabsTitle.push(opt.title);
        }
      });

      for (var i = 0; i < closeTabsTitle.length; i++) {
        tabs.tabs("close", closeTabsTitle[i]);
      }
    }

  });
</script>
</body>
</html>
