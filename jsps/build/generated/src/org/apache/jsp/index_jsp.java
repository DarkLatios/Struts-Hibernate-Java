package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;

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
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>School Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <form action=\"register\">\n");
      out.write("            First name:<br>\n");
      out.write("            <input type=\"text\" name=\"Firstname\"><br>\n");
      out.write("            Last Name:<br>\n");
      out.write("            <input type=\"text\" name=\"Lastname\"><br>\n");
      out.write("            Age:<br>\n");
      out.write("            <input type=\"number\" name=\"Age\"><br>\n");
      out.write("            Gender:<br>\n");
      out.write("            <input type=\"radio\" name=\"gender\" value=\"Male\">Male\n");
      out.write("            <input type=\"radio\" name=\"gender\" value=\"Female\">Female<br>\n");
      out.write("            State:\n");
      out.write("            <select name=\"state\">\n");
      out.write("                <option value=\"\">choose a state...</option>\n");
      out.write("                <option value=\"UP\">Uttar Pradesh</option>\n");
      out.write("                <option value=\"MH\">Maharashtra</option>\n");
      out.write("                <option value=\"RJ\">Rajasthan</option>\n");
      out.write("                <option value=\"AS\">Assam</option>\n");
      out.write("            </select><br>\n");
      out.write("            <br>\n");
      out.write("            This Database is:\n");
      out.write("            <input type=\"checkbox\" name=\"class\" value=\"Awesome\">Awesome\n");
      out.write("            <input type=\"checkbox\" name=\"class\" value=\"Excellent\">Excellent\n");
      out.write("            <input type=\"checkbox\" name=\"class\" value=\"Good\">Good\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"Submit\">\n");
      out.write("            <a href=\"register.jsp\">Show Details</a>\n");
      out.write("                \n");
      out.write("        </form>\n");
      out.write("              \n");
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
