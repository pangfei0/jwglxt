<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page trimDirectiveWhitespaces="true" %> 
<!DOCTYPE html>
<%   
String path = request.getContextPath();   
String basePath = request.getScheme()+"://" +request.getServerName()+":"+request.getServerPort()+path+"/" ;   
%>   
<base href="<%=basePath%>" > 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/themes/gray/easyui.css">
        <link rel="stylesheet" type="text/css" href="css/themes/icon.css">
        <script type="text/javascript" src="javascript/public/jquery.min.js"></script>
        <script type="text/javascript" src="javascript/public/jquery.easyui.min.js"></script>
        <script type="text/javascript" src="javascript/public/pageload.js"></script>
    </head>
    <body>
        <div>
            <input name="Result" type="hidden" value="${Result}" />
            <label>${logo1}</label>
            <c:if test="${Result=='Success'}">
                <script type="text/javascript">
                    window.setTimeout(function () {
                        var param="${param.ipg}";
                        var url="${urlocation}";
                        if(param!="")
                            url=url+"?ipg="+param;
                        window.location=url;
                    }, 1500);
               </script>
            </c:if>
            <c:if test="${Result=='Success'}">
                <span>${Message}</span>
                <p>${parameter}</p>
            </c:if> 
            <c:if test="${Result=='Failed'}">
                <span style="color: #0000ff">${Message}</span>
            </c:if> 
            <c:if test="${Result=='Error'}">
                <span style="color:#FF0000">${Message}</span>
            </c:if>
        </div>
    </body>
</html>
