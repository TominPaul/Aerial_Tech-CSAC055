package org.apache.jsp._1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Main_005fPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>  \r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">        \r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("        <title>Main_Page</title>               \r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("        table {\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        th, td {\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            padding: 8px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        tr:nth-child(even){background-color: #f2f2f2}\r\n");
      out.write("\r\n");
      out.write("        th {\r\n");
      out.write("            background-color: #4CAF50;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        </style>\r\n");
      out.write("        <!-- Font Icon -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Main css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_MainPage.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>           \r\n");
      out.write("        <!-- Sidebar -->\r\n");
      out.write("        <div class=\"w3-sidebar w3-light-grey w3-bar-block\" style=\"width:10%\">\r\n");
      out.write("            <h3 class=\"w3-bar-item\"></h3>\r\n");
      out.write("            <a href=\"Main_Page.jsp\" class=\"w3-bar-item w3-button\">Home</a>\r\n");
      out.write("            <a href=\"#\" class=\"w3-bar-item w3-button\">Category</a>\r\n");
      out.write("            <a href=\"#\" class=\"w3-bar-item w3-button\">Products</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Page Content -->\r\n");
      out.write("        <div style=\"margin-left:10%\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"w3-container\" align=\"center\">\r\n");
      out.write("            <figure>\r\n");
      out.write("                <img src=\"images/AerialTech_Logo.png\" alt=\"Main_Logo\" align=\"center\">                      \r\n");
      out.write("                <a href=\"Login.jsp\" class=\"right-half\" style=\"width:1%\">Logout</a>\r\n");
      out.write("            </figure>            \r\n");
      out.write("            </br></br>\r\n");
      out.write("        </div>\r\n");
      out.write("            \r\n");
      out.write("        <div align=\"right\" class=\"form-group form-button\" style=\"margin-right:10%\">\r\n");
      out.write("            <h2 class=\"form-title\" align=\"left\" style=\"margin-left:5%\"><b>Inventory Details</b></h2>\r\n");
      out.write("            <input type=\"submit\" name=\"Add Category\" id=\"btn_AddCategory\" class=\"form-submit\" value=\"Add Category\"/>\r\n");
      out.write("            <input type=\"submit\" name=\"Add Product\" id=\"btn_AddProduct\" class=\"form-submit\" value=\"Add Product\"/>\r\n");
      out.write("            </br>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"w3-container\">\r\n");
      out.write("            </br></br>\r\n");
      out.write("            <div class=\"left-half\">\r\n");
      out.write("                <table>                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>Category Name</th>\r\n");
      out.write("                        <th>Number of Products</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Drones</td>\r\n");
      out.write("                        <td>2</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Drone Controllers</td>\r\n");
      out.write("                        <td>1</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Accessories</td>\r\n");
      out.write("                        <td>2</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"right-half\" style=\"width:39%\">\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>Category Name</th>\r\n");
      out.write("                        <th>Product Name</th>\r\n");
      out.write("                        <th>Available Quantity</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Drones</td>\r\n");
      out.write("                        <td>DJI Movic Pro</td>\r\n");
      out.write("                        <td>10</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Drones</td>\r\n");
      out.write("                        <td>Parrot Bebop</td>\r\n");
      out.write("                        <td>5</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Drone Controller</td>\r\n");
      out.write("                        <td>Bebop Controller</td>\r\n");
      out.write("                        <td>15</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Accessories</td>\r\n");
      out.write("                        <td>Battery Pack</td>\r\n");
      out.write("                        <td>10</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Accessories</td>\r\n");
      out.write("                        <td>Toolkit</td>\r\n");
      out.write("                        <td>25</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- JS -->\r\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
