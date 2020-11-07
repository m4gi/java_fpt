<%-- 
Document   : HelloEL
Created on : Oct 6, 2020, 1:55:10 PM
Author     : Magi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
            <li>5 + 6 = ${5+6}</li>
            <li>Name: ${param.name}</li>
        </ul>
    </body>
</html>
