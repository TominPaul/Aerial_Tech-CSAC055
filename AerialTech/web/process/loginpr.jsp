<%-- 
    Document   : loginpr
    Created on : Oct 7, 2019, 10:14:23 AM
    Author     : VISHNU
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="DBConnection.DBConnection"%>
<%
    DBConnection ob = new DBConnection();
    String type = null;
    String username = request.getParameter("your_name");
    String password = request.getParameter("your_pass");
    ResultSet rs = ob.select("select * from user where u_name='" + username + "' and password='" + password + "'");
    System.out.println("Query="+ username+" "+password);
    
    if (rs.next())  {
        session.setAttribute("u_name", rs.getString(1));
        
        response.sendRedirect("../main.jsp");
    }
    else  {
        %>
        <script>
            alert("Invalid Login.. Try Again.");
            window.location="../aerial_signup.jsp";
        </script>
        <%
    }                             
%>
