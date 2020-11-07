<%-- 
    Document   : AddContact
    Created on : Nov 7, 2020, 8:29:36 AM
    Author     : Magi
--%>
<%@page import="controller.ContactController"%>
<%@page import="controller.GroupController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Contact</title>
    </head>
    <body>
        <h1>Add a Contact</h1>
        <s:form action="add_contact" method="POST">
            <s:textfield name="firstname" label="First Name:"/>
            <s:password name="lastname" label="Last Name:"/>
            <select name="id_group">
                <c:forEach var="i" items="<%=GroupController.groupList%>">    
                    <option value="${i.id_group}">${i.name}</option>
                </c:forEach>    
            </select>
            <s:textfield name="phone" label="Phone Number:"/>
            <s:submit value="Add Contact"/>
        </s:form>
    </body>
</html>
