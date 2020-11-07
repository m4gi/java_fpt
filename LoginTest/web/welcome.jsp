<%-- 
    Document   : welcome
    Created on : Oct 6, 2020, 2:39:37 PM
    Author     : Magi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <font color="red">Welcome, ${sessionScope.USER}</font>
        <h1>Welcome to MVC World</h1>
        <form action="Controller">
            Name <input type="text" name="txtSearch" value=""/><br/>
            <input type="submit" value="Search" name="btnAction"/>
        </form>
    </body>
</html>
