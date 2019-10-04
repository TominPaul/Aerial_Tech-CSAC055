<%-- 
    Document   : loginpr
    Created on : 23 Aug, 2014, 2:45:27 PM
    Author     : Administrator
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="DBConnection.DBConnection"%>
<%
                 
                      DBConnection ob = new DBConnection();
                      String type = null;
                          String username = request.getParameter("u_name");
                          String password = request.getParameter("password");
                          ResultSet rs = ob.select("select * from user where u_name='" + username + "' and password='" + password + "'");
                          System.out.println("Query="+ username+" "+password);
                          if (rs.next()) {
                              session.setAttribute("u_name", rs.getString(1));
                              
                              System.out.println(rs);
                              
                                  
                                  response.sendRedirect("../1/main.jsp");
                              
                              }
                else{
                      %>
                      <script>
                          alert("Invalid Login.. try again");
                          window.location="../index.jsp";
                      </script>
                      <%
                }
           
                   
%>
   