package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Student_Registration</a>\n");
      out.write("                </div>\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("                <li><a href=\"http://localhost:8080/StudentRegistrations/AdminLogin.jsp\">Login</a></li>\n");
      out.write("                <li> <a href=\"http://localhost:8080/StudentRegistrations/Disable_Enable_User.jsp\">Student Account Handle</a></li>\n");
      out.write("            </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <form action=\"Registration\" method=\"POST\">\n");
      out.write("            \n");
      out.write("                    <p>StudentID</p><input type=\"text\" name=\"Studentid\" required>\n");
      out.write("                    <p>FullName</p><input type=\"text\" name=\"FullName\" required>\n");
      out.write("                    <p>Address</p><input type=\"text\" name=\"adrress\" required>\n");
      out.write("                    <p>Email</p><input type=\"email\" name=\"email\"  required>\n");
      out.write("                    <p>Date of Birth</p><input type=\"text\" name=\"birthdate\" required>(MM/DD/YYYY)\n");
      out.write("                    <p>NIC</p><input type=\"text\"  name=\"nic\" required>\n");
      out.write("                    <p>Contact No</p><input type=\"text\" name=\"contactno\" required>\n");
      out.write("                    <p>User Name</p><input type=\"text\" name=\"username\" required>\n");
      out.write("                    <p>Password</p><input type=\"password\" name=\"password\" required>\n");
      out.write("                    <p>Confirm Password</p><input type=\"password\" name=\"confirmpassword\" required>\n");
      out.write("                    <input type=\"submit\" value=\"Register\">  \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html> ");
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
