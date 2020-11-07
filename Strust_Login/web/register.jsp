<%-- 
    Document   : register
    Created on : Nov 3, 2020, 4:15:30 PM
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Register new account!</h1>
        <s:form action="registerAction" method="post">
            <s:textfield name="username" label="User name" required="true" />
            <s:password name="password" label="Password" required="true"/>
            <s:password name="confirm" label="Confirm Password"/>
            <s:textfield name="lastname" label="Last Name" required="true"/>
            <s:textfield name="emailID" label="Email" required="true"/>
            <s:textfield name="phoneNo" label="Phone No. (e.g:08.38987456)" />
            <s:submit value="Register"/>             
        </s:form>
    </body>
</html>
