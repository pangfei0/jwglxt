<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>影吧管理系统</title>
	<link href="javascript/login/Default.css" rel="stylesheet" type="text/css">
	<link href="javascript/login/css_ns6up.css" type="text/css" rel="stylesheet">
	<link href="javascript/login/sweet-alert.css" type="text/css" rel="stylesheet">
	<script type="text/javascript" src="javascript/public/jquery.min.js"></script>
	<script type="text/javascript" src="javascript/sweet-alert.min.js"></script>
	<script type="text/javascript" src="javascript/login/MD5.js"></script>
	<script type="text/javascript" src="javascript/login/placeholder.js"></script>
	<script type="text/javascript" src="javascript/login/login.js"></script>
	<script language="javascript">
		if(top.location != self.location) {
			top.location=self.location; 
		} 
	</script>
</head>
<body id="body" class="p-login1">
	<div id="bg">
		<div class="login-ctn" id="loginSection">
			<div class="sec-lg">
				<div class="lgctn">
					<div class="lgwrap" id="loginWrap">
						<div class="lg-hd">
							<a href="javascript:;" hidefocus="true" class="w-logo">
								<h1></h1> </a>
							<%--<div style="float: left"><img src="image/upload/logo/${logo}" alt="logo" style="float: left" width="100px" height="50px"></div>--%>
							<span class="tit"></span>
							<div class="m-links">
								<a target="_blank" href="VersionUpdate.do">版本更新说明</a>
								<a target="_blank" href="http://wg.suda.edu.cn/">使用帮助</a>
								<a target="_blank" href=""></a>
							</div>
						</div>

						<div class="lg-bd">
							<div class="m-slides">
								<div class="slide slide-1"></div>
							</div>
							<div class="lg-mn" id="panelCt">
								<div class="person" style="background-image: url('../../../image/dl_logo.png');">
									<a href="#" target="_blank"></a>
								</div>
								<div class="m-mem m-mem-login" id="loginPanel">

									<div class="cnt">
										<div class="hd">
											欢迎使用，请登录<br>
										</div>
										<div class="bd">
											<div class="info" id="logHeadInfo">

												<div class="m-wrap" style="display: none;">
													<div class="w-txticon">
														<span class="txt f-size-large" id="userNameDetail"></span>
													</div>
												</div>
											</div>
											<form name="Login" action="" onsubmit="checkSubmit();" method="post">
												<div class="form">
													<div class="m-wrap f-padding-vlarge" id="loginNameIpt">
														<div class="m-ipt">
															<div class="ipt-value">
																<div class="w-ipt">
																	<input type="text" class="value" name="uname" placeholder="请输入账户" id="username" autocomplete="off">
																</div>
																<div class="ipt-tip" id="unameErr"
																	style="display: none;"></div>
															</div>
														</div>
													</div>
													<div class="m-wrap">
														<div class="m-ipt">
															<div class="ipt-value">
																<div class="w-ipt">
																	<input type="password" class="value" name="pwd" placeholder="请输入密码" id="passwd" autocomplete="off">
																</div>
																<div class="ipt-tip" id="pwdErr"
																	style="display: none;">错误提示</div>
															</div>
														</div>
													</div>
													<div class="m-wrap" style="margin-top: 17px">
														<div class="m-ipt">
															<div class="ipt-value">
																<div class="w-ipt">
																	<select id="role" style="width:230px;padding: 4px 0px 4px 0px">
																		<option value="1">超级管理员</option>
																	</select>
																</div>
																<div class="ipt-tip" id="roleErr"
																	 style="display: none;">角色错误提示</div>
																<div class="ipt-tip" id="statusErr"
																	 style="display: none;">状态错误提示</div>
															</div>
														</div>
													</div>

												</div>
												<div class="act m-hrz">
													<div class="m-wrap">
														<a type="submit" hidefocus="true"
															class="w-button w-button-submit" id="loginBtn"
															onclick="checkSubmit();" style="cursor:pointer"> <span
															class="txt f-size-middle" data-am-modal="">登&nbsp;&nbsp;录</span>
														</a>
													</div>
													<div class="m-wrap m-wrap-right" id="regBtn">
														<div id="goRegister" class="w-button">
															<input class="txt f-size-middle" type="button" id="regTxt"
																style="padding-top:9px;background-color:#FFFFFF;" onclick="cleanall();"
																value="重  置">
														</div>
													</div>
												</div>
											</form>
										</div>
										<!--
										<div>
											<span class="info" style="float:right"><a href="resetPwdRest.do">忘记密码？请点击在线重置</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
										</div>
										-->
									</div>
									<div class="bg"></div>
								</div>
							</div>
						</div>

						<div class="lg-ft">
							<div class="m-links">
								<a target="_blank"
									href="http://its.suda.edu.cn/details.aspx?id=17">关于影吧管理系统</a> <a
									target="_blank" href="http://its.suda.edu.cn/">联系我们</a> <span>苏州大学计算机科学与技术学院
									版权所有 © 2015</span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
