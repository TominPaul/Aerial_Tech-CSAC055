<%-- 
    Document   : logout
    Created on : Dec 10, 2019, 12:46:24 AM
    Author     : mrvis
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body>
        <%
            session.setAttribute("login","");
            response.sendRedirect("/aerial_signup.jsp");
            %>
    </body>
</html>
