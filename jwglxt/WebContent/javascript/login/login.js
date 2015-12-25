//以下为全局声明
var host = window.location.host;
var username;

//jquery 主程序开始
$(document).ready(function () {

    cleanall();
    //初始化操作
    $("#username").focus().select();


    //密码焦点丢失
    $("#passwd").focus(function () {
        $("#pwdErr").html(" ");
    });
    //密码焦点丢失
    /* $("#passwd").blur(function()
     {
     $("#pwdErr").html(" ");
     });*/
    $("#role").focus(function () {
        $("#roleErr").html(" ");
    });

    $("#username").focus(function () {
        $("#statusErr").html(" ");
    });
    $("#passwd").focus(function () {
        $("#statusErr").html(" ");
    });
    $.ajax({
    	async: false,
        type : "get",
        url : 'getAllRoles',
        dataType : 'json',
        success : function(data) {
        	str="";
        	$.each(data,function(i,n)
        			{
        		     str=str+"<option value="+n.roleid+">"+n.rolename+"</option>";
        			});
        	$("#role").html(str);
        	
        }
    	
    });

    $(document).keydown(function (event) {
        if ((event.which == 13 || event.keyCode == 13) && $("#passwd").focus()) checkSubmit();
    });
});
//jquery主程序结束 


function cleanall() {
    $("#username").val("");
    $("#passwd").val("");

    $("#unameErr").html("");
    $("#unameErr").hide();

    $("#pwdErr").html("");
    $("#pwdErr").hide();
}

//登录验证
function checkSubmit() {
    $("#unameErr").html("");
    $("#unameErr").hide();

    $("#pwdErr").html("");
    $("#pwdErr").hide();

    if ($("#username").val() == "") {
        $("#unameErr").html("请输入账号");
        $("#unameErr").show();
        $("#username").focus().select();
        return false;
    }
    else if ($("#passwd").val() == "") {
        $("#pwdErr").html("请输入密码");
        $("#pwdErr").show();
        $("#passwd").focus().select();
        return false;
    }
    else {
        $(function () {
            gotoSubmit()
        });
    }
}

//checkSubmit()的callback，发送数据给后台，并进行登陆 
function gotoSubmit() {
    var url;
    var username = $("#username").val();
    var passwd = $("#passwd").val();
    var roleid = $("#role option:selected").val();
    $.ajax({
        type: "post", url: "checkLogin.do", async: false, data: {uname: username, pwd: passwd, roleid: roleid},
        cache: false, dataType: "json", success: function (msg) {
            if (msg.result) {
                    url = "http:"+'//' + host + "/jwglxt/management/main"; //直接跳到收银员界面
                    window.location.href = url;
            } else if (msg.user == null) {
                $("#pwdErr").html(msg.message);
                //$("#passwd").attr("value","");
                //$("#passwd").focus().select();
                $("#pwdErr").show();
            } else if (msg.user.status == 1) {
                $("#statusErr").html(msg.statusmessage);
                $("#statusErr").show();
            } else {
                $("#roleErr").html(msg.rolemessage);
                $("#roleErr").show();
            }

        }, error: function (msg) {
            $("#unameErr").html("网络错误！");
        }
    });
}





