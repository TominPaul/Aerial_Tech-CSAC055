<%-- 
    Document   : signup_pr
    Created on : Oct 7, 2019, 10:14:23 AM
    Author     : VISHNU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:useBean id="con" class="beanfiles.Signup"/>
        <jsp:setProperty name="con" property="*"/>
    </head>
    <body>
        <%
            
                    if(con.putData(1)>0){
                        
                        response.sendRedirect("../login.jsp");
                        %>
                        <script>
                            window.alert("Registration Successfull");
                            </script>
                                                    <%
                        
                    }
               
        %>
    </body>
</html>
