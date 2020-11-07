<%-- 
    Document   : AddGroup
    Created on : Nov 7, 2020, 8:58:18 AM
    Author     : Magi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a Group</title>
    </head>
    <body>
        <h1>Add a Group!</h1>
        <br/>
        <s:form action="addGroup">
            <s:textfield name="name" label="Name: "/>
            <s:textfield name="description" label="Description: "/>
            <s:submit value="Add Group"/>
        </s:form>
    </body>
</html>
