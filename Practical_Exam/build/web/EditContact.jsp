<%@page import="controller.ContactController"%>
<%@page import="controller.GroupController"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact | Edit</title>
        
    </head>
    <body>
        <h2>Edit contact form</h2>
        <c:if test="<%=ContactController.log!=null%>">
                <p style="color:red;font-size: 20px;"><%=ContactController.log%></p>
        </c:if>
        <form action="edit_contact" method="post">    
            First Name:
            <input type="text" name="first_name" value="<%=ContactController.selectedContact.getFirst_name()%>"><br><br>   
            Last Name:
            <input type="text" name="last_name" value="<%=ContactController.selectedContact.getLast_name()%>"><br><br>   
            Group:
            <select name="id_group">
                <c:forEach var="i" items="<%=GroupController.groupList%>">    
                    <option value="${i.id_group}">${i.name}</option>
                </c:forEach>    
            </select><br><br>
            Phone:
            <input type="text" name="phone" value="<%=ContactController.selectedContact.getPhone()%>"><br><br>   
            <input type="submit" value="Edit">
        </form>
        <hr>
        <a href="view_contact" ><button style="font-size:22px;background-color: orange;border-radius: 5px;">Back To Contacts List</button></a> 
    
    </body>
</html>
