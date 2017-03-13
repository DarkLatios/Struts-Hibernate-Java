package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>School page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"update.jsp\">\n");
      out.write("            ID:<br>\n");
      out.write("            <input type=\"text\" name=\"id\"><br>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Search\">\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        <h1>Students Details</h1>\n");
      out.write("        ");
 String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
      String DB_URL = "jdbc:mysql://localhost:3306/report";

   //  Database credentials
   String USER = "root";
   String PASS = "root";
   
  
   Connection conn = null;
   //Statement stmt1=null;
   Statement stmt = null;
   try{
       
     
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      out.print("Connection Success");      
      stmt=(Statement) conn.createStatement();
      String sql="SELECT * FROM INFO";
      ResultSet rs= stmt.executeQuery(sql);
      while (rs.next()){
      out.write("\n");
      out.write("      <table >\n");
      out.write("          <tr >\n");
      out.write("              <td>");
      out.print(rs.getString(2) );
      out.write("</td>\n");
      out.write("              <td>");
      out.print(rs.getString(3) );
      out.write("</td>\n");
      out.write("              <td>");
      out.print(rs.getInt(4) );
      out.write("</td>\n");
      out.write("              <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("              <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("              <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("      </table>\n");
      out.write("      \n");
      out.write("      ");
//System.out.print("Name ="+na);
     // System.out.print("Query ="+sql);
      //out.print("Data inserted successfully.");
           }
   }
   catch(Exception e){
       e.printStackTrace();
   }
      
      
      
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
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
