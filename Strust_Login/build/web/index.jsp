<%-- 
    Document   : index
    Created on : Oct 31, 2020, 9:11:13 AM
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <s:head/>
    </head>
    <body>
        <h1>Login Page!</h1>
        <s:form action="login" method="post">
            <s:textfield name="username" label="Username"/>
            <s:password name="password" label="Password"/>
            <s:submit value="Login"/>
            <s:reset value="Reset"/>
        </s:form>
        Are you new user? Click <a href="register.jsp">here</a>to create new account.
    </body>
</html>
