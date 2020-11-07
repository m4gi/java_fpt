<%-- 
    Document   : course
    Created on : Oct 20, 2020, 11:16:11 PM
    Author     : Le Anh Tuan
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Model.Course"%>
<%@page import="Model.CourseDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New</title>
    </head>
    <body>
        <h1>Add new Course!</h1>

        <form action="Controller" method="post">
            <br><br>
            Course ID:
            <input type="text" name="courseID"><br><br>
            Subject:
            <input type="text" name="subject"><br><br>
            Lecturer: 
            <input type="text" name="lecturer"><br><br>
            Schedule:
            <input type="text" name="schedule"><br><br>
            <br><br>
            <input type="submit" value="Add Course">            
        </form> 
        <br><br>
        <!-- hitwebcounter Code START -->
        <a href="https://www.hitwebcounter.com" target="_blank">
            <img src="https://hitwebcounter.com/counter/counter.php?page=7697280&style=0001&nbdigits=5&type=page&initCount=0" title="Total Website Hits" Alt="Web Hits"   border="0" /></a>    
    </body>
</html>