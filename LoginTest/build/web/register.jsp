<%-- 
    Document   : register
    Created on : Oct 6, 2020, 3:36:35 PM
    Author     : Magi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Register Page</h1>
        <form action="Controller" method="POST">
            Username <input type="text" name="txtUser" value=""/><br/>
            Password <input type="password" name="txtPass" value=""/><br/>
            Lastname <input type="text" name="txtLast" value=""/><br/>
            Admin <input type="checkbox" name="chkAdmin" value="ADMIN"/><br/>
            <input type="submit" value="Register" name="btnAction"/>
        </form>
    </body>

</html>
