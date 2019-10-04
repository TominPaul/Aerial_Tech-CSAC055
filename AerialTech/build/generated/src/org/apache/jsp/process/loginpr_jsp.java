package org.apache.jsp.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import DBConnection.DBConnection;

public final class loginpr_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

                 
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
                      
      out.write("\n");
      out.write("                      <script>\n");
      out.write("                          alert(\"Invalid Login.. try again\");\n");
      out.write("                          window.location=\"../index.jsp\";\n");
      out.write("                      </script>\n");
      out.write("                      ");

                }
           
                   

      out.write("\n");
      out.write("   ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
