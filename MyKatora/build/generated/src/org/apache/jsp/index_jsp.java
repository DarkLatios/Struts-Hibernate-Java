package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lightning Haze</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <h1>Welcome to Lightning Haze</h1>\n");
      out.write("        &nbsp;<h2>Donors</h2>\n");
      out.write("        <form action=\"login.jsp\" class=\"login\">\n");
      out.write("            \n");
      out.write("            <input type=\"text\" class=\"login-input\" name=\"Username\" value=\"Username\"><br>\n");
      out.write("            \n");
      out.write("            <input type=\"password\"class=\"login-input\" name=\"Password\" value=\"Password\"><br>\n");
      out.write("            <input type=\"submit\" value=\"Login\" class=\"login-submit\" ><br>\n");
      out.write("            <p class=\"login-help\" ><a href=\"\">Forgot Password?</a></p>\n");
      out.write("            <a href=\"signup.jsp\">Sign Up</a>\n");
      out.write("        </form>\n");
      out.write("        &nbsp;<h3>Receivers</h3>\n");
      out.write("        <form action=\"takerlogin.jsp\" class=\"login\">\n");
      out.write("            <input type=\"text\" class=\"login-input\" name=\"Usern\" value=\"Username\"><br>\n");
      out.write("            <input type=\"password\" class=\"login-input\" name=\"Pass\" value=\"Password\"><br>\n");
      out.write("            <input type=\"submit\" value=\"Login\" class=\"login-submit\"><br>\n");
      out.write("            <p class=\"login-help\" ><a href=\"\">Forgot Password?</a></p>\n");
      out.write("            <a href=\"takersign.jsp\">Sign Up</a>\n");
      out.write("        </form>  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
