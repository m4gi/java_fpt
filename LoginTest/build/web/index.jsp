<%-- 
    Document   : index
    Created on : Oct 6, 2020, 2:10:31 PM
    Author     : Magi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <form action="Controller" method="POST">
            Username <input type="text" name="txtUsername" value=""/> <br/>
            Password <input type="password" name="txtPass" value=""/><br/>
            <input type="submit" value="Login" name="btnAction"/>
            <input type="reset" value="Reset" />
        </form>
    </body>
</html>
