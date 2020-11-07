<%-- 
    Document   : Login
    Created on : Sep 15, 2020, 2:59:03 PM
    Author     : Hoang Chi Nhan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login!</h1>
        <form action="Controller">
            Username: <input type="text" name="txtUser"/><br>
            Password: <input type="password" name="txtPass"/><br>
            <input type="submit" value="Login" name="acion" />
            <a href="controller?action=new"> Register New User </a>
        </form>
    </body>
</html>
