<%--
  Created by IntelliJ IDEA.
  User: 53801
  Date: 2015/8/18
  Time: 2:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><%@ include file="/tagLib.jsp"%>
{
"urlocation":"${urlocation}",
"tagret":"${tagret}",
"Result":"${Result}",
"Message":"${Message}",
"confirmMsg":"${param.callbackType eq 'forwardConfirm' ? message : ''}",
"navTabId":"${param.navTabId}",
"rel":"${param.rel}",
"callbackType":"${callbackType}",
"forwardUrl":"${empty forwardUrl ? param.forwardUrl : forwardUrl}",
"isAjax":true
}