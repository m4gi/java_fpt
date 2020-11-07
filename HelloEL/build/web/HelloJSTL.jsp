<%-- 
    Document   : HelloJSTL
    Created on : Oct 6, 2020, 1:56:58 PM
    Author     : Magi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="num" value="0"/>
        <p>Number: <c:out value="${num}"/></p>
        <c:if test="${num%2==0}">
            <p>Even</p>
        </c:if>
        <c:if test="${num%2!=0}">
            <p>Odd</p>
        </c:if>

        <c:catch var="ex">
            Divide:
            <%
                int a = 0;
                int c = 10 / a;
            %>
        </c:catch>
        <c:if test="${ex!=null}">
            Exception: ${ex}
        </c:if>
    </body>
</html>
