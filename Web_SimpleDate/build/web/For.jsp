<%-- 
    Document   : For
    Created on : Sep 22, 2020, 1:46:46 PM
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
        <form name="for_n" method="GET">
            Nhập n: <input type="text" name="soLuong"> <br><br>
            <input type="submit" name="bt" value="Phát Sinh"> <br><br>
            <%
                String s = request.getParameter("soLuong");
                
                if (s != null) {
                    int n = Integer.parseInt(s);
                    for (int i = 0; i < n; i++) {
                        out.print("<b>" + i + "<br>");
                        out.print("<br>");
                    }
                } else {
                    out.print("<b>Nhập lại n!!! </b>");
                }
            %>
        </form>
    </body>
</html>
