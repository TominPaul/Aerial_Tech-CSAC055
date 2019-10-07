package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>  \n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">        \n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Main_Page</title>               \n");
      out.write("\n");
      out.write("        <!-- Font Icon -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Main css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_MainPage.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>           \n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <div class=\"w3-sidebar w3-light-grey w3-bar-block\" style=\"width:10%\">\n");
      out.write("            <h3 class=\"w3-bar-item\"></h3>\n");
      out.write("            <a href=\"Main_Page.jsp\" class=\"w3-bar-item w3-button\">Home</a>\n");
      out.write("            <a href=\"Category_Page.jsp\" class=\"w3-bar-item w3-button\">Category</a>\n");
      out.write("            <a href=\"Products_Page\" class=\"w3-bar-item w3-button\">Products</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Page Content -->\n");
      out.write("        <div style=\"margin-left:10%\">\n");
      out.write("\n");
      out.write("        <div class=\"w3-container\" align=\"center\">\n");
      out.write("            <figure>\n");
      out.write("                <img src=\"images/AerialTech_Logo.png\" alt=\"Main_Logo\" align=\"center\">                      \n");
      out.write("                <a href=\"Login.jsp\" class=\"right-half\" style=\"width:1%\">Logout</a>\n");
      out.write("            </figure>            \n");
      out.write("            </br></br>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <div align=\"right\" class=\"form-group form-button\" style=\"margin-right:10%\">\n");
      out.write("            <h2 class=\"form-title\" align=\"left\" style=\"margin-left:5%\"><b>Inventory Details</b></h2>\n");
      out.write("            <input type=\"submit\" name=\"Add Category\" id=\"btn_AddCategory\" class=\"form-submit\" value=\"Add Category\"/>\n");
      out.write("            <input type=\"submit\" name=\"Add Product\" id=\"btn_AddProduct\" class=\"form-submit\" value=\"Add Product\"/>\n");
      out.write("            </br>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"w3-container\">\n");
      out.write("            </br></br>\n");
      out.write("            <div class=\"left-half\">\n");
      out.write("                <table>                    \n");
      out.write("                    <tr>\n");
      out.write("                        <th>Category Name</th>\n");
      out.write("                        <th>Number of Products</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Drones</td>\n");
      out.write("                        <td>2</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Drone Controllers</td>\n");
      out.write("                        <td>1</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Accessories</td>\n");
      out.write("                        <td>2</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right-half\" style=\"width:39%\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Category Name</th>\n");
      out.write("                        <th>Product Name</th>\n");
      out.write("                        <th>Available Quantity</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Drones</td>\n");
      out.write("                        <td>DJI Movic Pro</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Drones</td>\n");
      out.write("                        <td>Parrot Bebop</td>\n");
      out.write("                        <td>5</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Drone Controller</td>\n");
      out.write("                        <td>Bebop Controller</td>\n");
      out.write("                        <td>15</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Accessories</td>\n");
      out.write("                        <td>Battery Pack</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Accessories</td>\n");
      out.write("                        <td>Toolkit</td>\n");
      out.write("                        <td>25</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- JS -->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
