<%@page import="Controller.ContactController"%>
<%@page import="Controller.GroupController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact | Add</title>
    <body>
        <h2>Add contact form</h2>
        <form action="add_contact" method="post">    
            <c:if test="<%=ContactController.log != null%>">
                <p style="color:red;font-size: 20px;"><%=ContactController.log%></p>
                <%ContactController.log = null;%>
            </c:if>
            First Name:
            <input type="text" name="first_name"><br><br>  
            Last Name:
            <input type="text" name="last_name"><br><br>   
            Group:
            <select name="id_group">
                <c:forEach var="i" items="<%=GroupController.groupList%>">    
                    <option value="${i.id_group}">${i.name}</option>
                </c:forEach>    
            </select><br><br>
            Phone:
            <input type="text" name="phone"><br><br>   
            <input type="submit" value="Add New Contact">
        </form>
        <hr>
        <a href="view_contact" ><button>View All Contacts</button></a> 
        <!-- hitwebcounter Code START -->
        <br></br>
        <a href="https://www.hitwebcounter.com" target="_blank">
            <img src="https://hitwebcounter.com/counter/counter.php?page=7697280&style=0001&nbdigits=5&type=page&initCount=0" title="Total Website Hits" Alt="Web Hits"   border="0" /></a>    
    </body>
</html>
