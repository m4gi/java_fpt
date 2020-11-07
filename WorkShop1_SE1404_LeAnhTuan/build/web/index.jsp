<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Course"%>
<%@page import="Model.CourseDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>COURSE MANAGER</title>
    </head>
    <body>
        <h1>COURSE MANAGER</h1>

        <table border="1">
            <br><br>
            <tr>
                <td>Course_ID</td>
                <td>Subject</td>
                <td>Lecturer</td>
                <td>Schedule</td>
            </tr>
            <%
                ArrayList<Course> list = CourseDB.GetAll();

                for (Course i : list) {
                    out.print(("<tr>"
                            + "<td>" + i.getCourse_ID()) + "</td>"
                            + "<td>" + i.getSubject() + "</td>"
                            + "<td>" + i.getLecturer() + "</td>"
                            + "<td>" + i.getSchedule() + "</td>"
                            + "</tr>");
                }
            %>
        </table>
        <form action = "course.jsp">
            <br><br>
            <input type="submit" value="New Course"> 
        </form>
        <br><br>
        <!-- hitwebcounter Code START -->
        <a href="https://www.hitwebcounter.com" target="_blank">
            <img src="https://hitwebcounter.com/counter/counter.php?page=7697280&style=0001&nbdigits=5&type=page&initCount=0" title="Total Website Hits" Alt="Web Hits"   border="0" /></a>    
    </body>
</html>

