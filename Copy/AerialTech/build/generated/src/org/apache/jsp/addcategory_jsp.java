package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <style>\r\n");
      out.write("    * {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    body {\r\n");
      out.write("    font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    table {\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    line-height: 40px;\r\n");
      out.write("    border-collapse: separate;\r\n");
      out.write("    border-spacing: 0;\r\n");
      out.write("    border: 2px solid #ed1c40;\r\n");
      out.write("    width: 500px;\r\n");
      out.write("    margin: 50px auto;\r\n");
      out.write("    border-radius: .25rem;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    thead tr:first-child {\r\n");
      out.write("    background: #ed1c40;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    border: none;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    th:first-child,\r\n");
      out.write("    td:first-child {\r\n");
      out.write("    padding: 0 15px 0 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    th {\r\n");
      out.write("    font-weight: 500;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    thead tr:last-child th {\r\n");
      out.write("    border-bottom: 3px solid #ddd;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    tbody tr:hover {\r\n");
      out.write("    background-color: #f2f2f2;\r\n");
      out.write("    cursor: default;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    tbody tr:last-child td {\r\n");
      out.write("    border: none;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    tbody td {\r\n");
      out.write("    border-bottom: 1px solid #ddd;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    td:last-child {\r\n");
      out.write("    text-align: right;\r\n");
      out.write("    padding-right: 10px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .button {\r\n");
      out.write("    color: #aaa;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    vertical-align: middle;\r\n");
      out.write("    margin-top: -4px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .edit:hover {\r\n");
      out.write("    color: #0a79df;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .delete:hover {\r\n");
      out.write("    color: #dc2a2a;\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("    <body>\r\n");
      out.write("    <h1>Hello World!</h1>\r\n");
      out.write("    <table>\r\n");
      out.write("    <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <th colspan=\"3\">Atividades do projeto</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <th>#</th>\r\n");
      out.write("    <th colspan=\"2\">Atividade</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>1</td>\r\n");
      out.write("    <td>Atualizar página da equipe</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <i class=\"material-icons button edit\">edit</i>\r\n");
      out.write("    <i class=\"material-icons button delete\">delete</i>\r\n");
      out.write("    </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>2</td>\r\n");
      out.write("    <td>Design da nova marca</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <i class=\"material-icons button edit\">edit</i>\r\n");
      out.write("    <i class=\"material-icons button delete\">delete</i>\r\n");
      out.write("    </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>3</td><!DOCTYPE html>\r\n");
      out.write("    <html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Bootstrap Table with Add and Delete Row Feature</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    body {\r\n");
      out.write("    color: #404E67;\r\n");
      out.write("    background: #F5F7FA;\r\n");
      out.write("            font-family: 'Open Sans', sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("    .table-wrapper {\r\n");
      out.write("            width: 700px;\r\n");
      out.write("            margin: 30px auto;\r\n");
      out.write("    background: #fff;\r\n");
      out.write("    padding: 20px;\t\r\n");
      out.write("    box-shadow: 0 1px 1px rgba(0,0,0,.05);\r\n");
      out.write("    }\r\n");
      out.write("    .table-title {\r\n");
      out.write("    padding-bottom: 10px;\r\n");
      out.write("    margin: 0 0 10px;\r\n");
      out.write("    }\r\n");
      out.write("    .table-title h2 {\r\n");
      out.write("    margin: 6px 0 0;\r\n");
      out.write("    font-size: 22px;\r\n");
      out.write("    }\r\n");
      out.write("    .table-title .add-new {\r\n");
      out.write("    float: right;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("            text-shadow: none;\r\n");
      out.write("            min-width: 100px;\r\n");
      out.write("            border-radius: 50px;\r\n");
      out.write("            line-height: 13px;\r\n");
      out.write("    }\r\n");
      out.write("    .table-title .add-new i {\r\n");
      out.write("            margin-right: 4px;\r\n");
      out.write("    }\r\n");
      out.write("    table.table {\r\n");
      out.write("    table-layout: fixed;\r\n");
      out.write("    }\r\n");
      out.write("    table.table tr th, table.table tr td {\r\n");
      out.write("    border-color: #e9e9e9;\r\n");
      out.write("    }\r\n");
      out.write("    table.table th i {\r\n");
      out.write("    font-size: 13px;\r\n");
      out.write("    margin: 0 5px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write("    table.table th:last-child {\r\n");
      out.write("    width: 100px;\r\n");
      out.write("    }\r\n");
      out.write("    table.table td a {\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    margin: 0 5px;\r\n");
      out.write("            min-width: 24px;\r\n");
      out.write("    }    \r\n");
      out.write("    table.table td a.add {\r\n");
      out.write("    color: #27C46B;\r\n");
      out.write("    }\r\n");
      out.write("    table.table td a.edit {\r\n");
      out.write("    color: #FFC107;\r\n");
      out.write("    }\r\n");
      out.write("    table.table td a.delete {\r\n");
      out.write("    color: #E34724;\r\n");
      out.write("    }\r\n");
      out.write("    table.table td i {\r\n");
      out.write("    font-size: 19px;\r\n");
      out.write("    }\r\n");
      out.write("    table.table td a.add i {\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    margin-right: -1px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    top: 3px;\r\n");
      out.write("    }    \r\n");
      out.write("    table.table .form-control {\r\n");
      out.write("    height: 32px;\r\n");
      out.write("    line-height: 32px;\r\n");
      out.write("    box-shadow: none;\r\n");
      out.write("    border-radius: 2px;\r\n");
      out.write("    }\r\n");
      out.write("    table.table .form-control.error {\r\n");
      out.write("            border-color: #f50000;\r\n");
      out.write("    }\r\n");
      out.write("    table.table td .add {\r\n");
      out.write("            display: none;\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$('[data-toggle=\"tooltip\"]').tooltip();\r\n");
      out.write("\tvar actions = $(\"table td:last-child\").html();\r\n");
      out.write("\t// Append table with add row form on add new button click\r\n");
      out.write("    $(\".add-new\").click(function(){\r\n");
      out.write("\t\t$(this).attr(\"disabled\", \"disabled\");\r\n");
      out.write("\t\tvar index = $(\"table tbody tr:last-child\").index();\r\n");
      out.write("        var row = '<tr>' +\r\n");
      out.write("            '<td><input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\"></td>' +\r\n");
      out.write("            '<td><input type=\"text\" class=\"form-control\" name=\"department\" id=\"department\"></td>' +\r\n");
      out.write("            '<td><input type=\"text\" class=\"form-control\" name=\"phone\" id=\"phone\"></td>' +\r\n");
      out.write("\t\t\t'<td>' + actions + '</td>' +\r\n");
      out.write("        '</tr>';\r\n");
      out.write("    \t$(\"table\").append(row);\t\t\r\n");
      out.write("\t\t$(\"table tbody tr\").eq(index + 1).find(\".add, .edit\").toggle();\r\n");
      out.write("        $('[data-toggle=\"tooltip\"]').tooltip();\r\n");
      out.write("    });\r\n");
      out.write("\t// Add row on add button click\r\n");
      out.write("\t$(document).on(\"click\", \".add\", function(){\r\n");
      out.write("\t\tvar empty = false;\r\n");
      out.write("\t\tvar input = $(this).parents(\"tr\").find('input[type=\"text\"]');\r\n");
      out.write("        input.each(function(){\r\n");
      out.write("\t\t\tif(!$(this).val()){\r\n");
      out.write("\t\t\t\t$(this).addClass(\"error\");\r\n");
      out.write("\t\t\t\tempty = true;\r\n");
      out.write("\t\t\t} else{\r\n");
      out.write("                $(this).removeClass(\"error\");\r\n");
      out.write("            }\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(this).parents(\"tr\").find(\".error\").first().focus();\r\n");
      out.write("\t\tif(!empty){\r\n");
      out.write("\t\t\tinput.each(function(){\r\n");
      out.write("\t\t\t\t$(this).parent(\"td\").html($(this).val());\r\n");
      out.write("\t\t\t});\t\t\t\r\n");
      out.write("\t\t\t$(this).parents(\"tr\").find(\".add, .edit\").toggle();\r\n");
      out.write("\t\t\t$(\".add-new\").removeAttr(\"disabled\");\r\n");
      out.write("\t\t}\t\t\r\n");
      out.write("    });\r\n");
      out.write("\t// Edit row on edit button click\r\n");
      out.write("\t$(document).on(\"click\", \".edit\", function(){\t\t\r\n");
      out.write("        $(this).parents(\"tr\").find(\"td:not(:last-child)\").each(function(){\r\n");
      out.write("\t\t\t$(this).html('<input type=\"text\" class=\"form-control\" value=\"' + $(this).text() + '\">');\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t\t$(this).parents(\"tr\").find(\".add, .edit\").toggle();\r\n");
      out.write("\t\t$(\".add-new\").attr(\"disabled\", \"disabled\");\r\n");
      out.write("    });\r\n");
      out.write("\t// Delete row on delete button click\r\n");
      out.write("\t$(document).on(\"click\", \".delete\", function(){\r\n");
      out.write("        $(this).parents(\"tr\").remove();\r\n");
      out.write("\t\t$(\".add-new\").removeAttr(\"disabled\");\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"table-wrapper\">\r\n");
      out.write("            <div class=\"table-title\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-8\"><h2>Employee <b>Details</b></h2></div>\r\n");
      out.write("                    <div class=\"col-sm-4\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-info add-new\"><i class=\"fa fa-plus\"></i> Add New</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <table class=\"table table-bordered\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>Name</th>\r\n");
      out.write("                        <th>Department</th>\r\n");
      out.write("                        <th>Phone</th>\r\n");
      out.write("                        <th>Actions</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>John Doe</td>\r\n");
      out.write("                        <td>Administration</td>\r\n");
      out.write("                        <td>(171) 555-2222</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"add\" title=\"Add\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE03B;</i></a>\r\n");
      out.write("                            <a class=\"edit\" title=\"Edit\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE254;</i></a>\r\n");
      out.write("                            <a class=\"delete\" title=\"Delete\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE872;</i></a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Peter Parker</td>\r\n");
      out.write("                        <td>Customer Service</td>\r\n");
      out.write("                        <td>(313) 555-5735</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"add\" title=\"Add\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE03B;</i></a>\r\n");
      out.write("                            <a class=\"edit\" title=\"Edit\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE254;</i></a>\r\n");
      out.write("                            <a class=\"delete\" title=\"Delete\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE872;</i></a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Fran Wilson</td>\r\n");
      out.write("                        <td>Human Resources</td>\r\n");
      out.write("                        <td>(503) 555-9931</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"add\" title=\"Add\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE03B;</i></a>\r\n");
      out.write("                            <a class=\"edit\" title=\"Edit\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE254;</i></a>\r\n");
      out.write("                            <a class=\"delete\" title=\"Delete\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE872;</i></a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>      \r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>     \r\n");
      out.write("</body>\r\n");
      out.write("</html>                            \r\n");
      out.write("      <td>Encontrar desenvolvedor front-end</td>\r\n");
      out.write("      <td>\r\n");
      out.write("        <i class=\"material-icons button edit\">edit</i>\r\n");
      out.write("        <i class=\"material-icons button delete\">delete</i>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </tbody>\r\n");
      out.write("</table>\r\n");
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