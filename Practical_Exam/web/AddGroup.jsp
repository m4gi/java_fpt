<%@page import="controller.GroupController"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Group | Add</title>
        
    </head>
    <body>
        <h2>Add group form</h2>
        <c:if test="<%=GroupController.log!=null%>">
                <p><%=GroupController.log%></p>
                <%GroupController.log=null;%>
        </c:if>
        <form action="add_group" method="post">    
            Name:
            <input type="text" name="name"><br><br>   
            Description:
            <input type="text" name="description"><br><br>   
            <input type="submit" value="Add New Group">
        </form>
        <hr>
        <a href="view_group" ><button>Return to group list</button></a> 
    </body>
</html>
