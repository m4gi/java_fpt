<%-- 
    Document   : fail
    Created on : Nov 3, 2020, 4:21:08 PM
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Fail!</h1>
        <%@taglib uri="/struts-tags" prefix="s" %>
        <s:if test="not empty #request.NamingErrors">
            The Naming Service occurs errors: <s:property value="%{#request.NamingErrors}"/><br/>
        </s:if>
        <s:if test="not empty #request.SQLErrors">
            The SQL Service occurs errors: <s:property value="%{#request.SQLErrors}"/><br/>
        </s:if>
    </body>
</html>
