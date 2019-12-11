package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import java.util.Iterator;
import DBConnection.DBConnection;
import java.sql.ResultSet;

public final class products_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Products_Edit</title>    \r\n");
      out.write("\t");
      beanfiles.Product con = null;
      synchronized (_jspx_page_context) {
        con = (beanfiles.Product) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new beanfiles.Product();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">        \r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">       \r\n");
      out.write("        \r\n");
      out.write("        <!-- Font Icon -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Main css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_MainPage.css\">\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Sidebar -->\r\n");
      out.write("        <div class=\"w3-sidebar w3-light-grey w3-bar-block\" style=\"width:8%\" >\r\n");
      out.write("            <h3 class=\"w3-bar-item\"></h3>\r\n");
      out.write("            <a href=\"main_page.jsp\" class=\"w3-bar-item w3-button\">Home</a>\r\n");
      out.write("            <a href=\"category_page.jsp\" class=\"w3-bar-item w3-button\">Category</a>\r\n");
      out.write("            <a href=\"products_page.jsp\" class=\"w3-bar-item w3-button\">Products</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Page Content -->        \r\n");
      out.write("        <div class=\"w3-container\" align=\"center\" style=\"padding: 2%\">\r\n");
      out.write("            <figure>\r\n");
      out.write("                <img src=\"images/AerialTech_Logo.png\" alt=\"Main_Logo\" align=\"center\">                      \r\n");
      out.write("                <a href=\"login.jsp\" class=\"right-half\" style=\"width:1%\">Logout</a>\r\n");
      out.write("            </figure>            \r\n");
      out.write("            </br></br>\r\n");
      out.write("        </div>  \r\n");
      out.write("        \r\n");
      out.write("        <form class=\"form-inline\" action=\"process/products_edit.jsp\" method=\"post\">\r\n");
      out.write("            <div align=\"right\" class=\"form-group form-button\" style=\"margin-right:5%; margin-left:12%\">\r\n");
      out.write("                 <h2 class=\"form-title\" align=\"left\"><b>Edit Product</b></h2>\r\n");
      out.write("                <div class=\"form-inline\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                        <label for=\"Category_Name\">Category</label>\r\n");
      out.write("                        &nbsp;\r\n");
      out.write("                        <input type=\"text\" value=\"");
out.print(request.getParameter("category")); 
      out.write("\"  class=\"form-control\" id=\"c_name\" name=\"category\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"Category_ID\">Product Name</label>\r\n");
      out.write("                        &nbsp;\r\n");
      out.write("                        <input type=\"text\" value=\"");
out.print(request.getParameter("p_name")); 
      out.write("\" class=\"form-control\" id=\"p_name\" name=\"p_name\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </br>\r\n");
      out.write("                <div class=\"form-inline\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"Product_ID\">Product ID</label>\r\n");
      out.write("                        \r\n");
      out.write("                        <input type=\"text\" value=\"");
out.print(request.getParameter("p_id")); 
      out.write("\" class=\"form-control\" id=\"p_id\" name=\"p_id\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"Sales_Price\">Sales Price        </label>\r\n");
      out.write("                        \r\n");
      out.write("                        <input type=\"text\" value=\"");
out.print(request.getParameter("price")); 
      out.write("\" class=\"form-control\" id=\"p_price\" name=\"price\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                </br>\r\n");
      out.write("                <div class=\"form-inline\">\r\n");
      out.write("                    &nbsp;\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"Available_Quantity\">Available Quantity</label>\r\n");
      out.write("                        &nbsp;\r\n");
      out.write("                        <input type=\"text\" value=\"");
out.print(request.getParameter("quantity")); 
      out.write("\" class=\"form-control\" id=\"quantity\" name=\"quantity\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </br></br>\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success\">UPDATE</button>\r\n");
      out.write("                    &nbsp;&nbsp;\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success\">CANCEL</button>\r\n");
      out.write("                    </br></br>                    \r\n");
      out.write("                </div>\r\n");
      out.write("                </br>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"table-wrapper\">\r\n");
      out.write("                    <table class=\"table table-bordered\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>Product ID</th>\r\n");
      out.write("                                <th>Category</th>\r\n");
      out.write("                                <th>Product Name</th>                        \r\n");
      out.write("                                <th>Sales Price</th>\r\n");
      out.write("                                <th>Available Quantity</th>\r\n");
      out.write("                                <th>Edit</th>\r\n");
      out.write("                                <th>Delete</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        ");
	
                            Vector v=null;
                            Iterator it=con.getData(2).iterator();
                            while(it.hasNext()){
                                v=(Vector)it.next();
                        
      out.write("\r\n");
      out.write("                       \r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td id=\"P_id\">");
out.print(v.get(0)); 
      out.write(" </td>\r\n");
      out.write("                                <td id=\"category\">");
out.print(v.get(4)); 
      out.write(" </td>\r\n");
      out.write("                                <td id=\"p_name\">");
out.print(v.get(1)); 
      out.write("</td>\r\n");
      out.write("                                <td id=\"price\">");
out.print(v.get(2)); 
      out.write("</td>                                                \r\n");
      out.write("                                <td id=\"quantity\">");
out.print(v.get(3)); 
      out.write("</td>                                                                 \r\n");
      out.write("                                <td>\r\n");
      out.write("                                     <a href=\"products_edit.jsp?&p_id=");
out.print(v.get(0)); 
      out.write("&p_name=");
out.print(v.get(1));
      out.write("&category=");
out.print(v.get(1));
      out.write("&price=");
out.print(v.get(2));
      out.write("&quantity=");
out.print(v.get(3)); 
      out.write("\"  class=\"edit\" title=\"Edit\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE254;</i></a>                                                                 \r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                   <a href=\"/process/product_delete.jsp?&p_id=");
out.print(v.get(0)); 
      out.write(" \" class=\"delete\" title=\"Delete\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE872;</i></a>\r\n");
      out.write("                                \r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>                            \r\n");
      out.write("                        </tbody>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                       \r\n");
      out.write("                    </table>  \r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write(" </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
