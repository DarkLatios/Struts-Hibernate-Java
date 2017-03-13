<%-- 
    Document   : register
    Created on : Jun 16, 2016, 3:41:04 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>School page</title>
    </head>
    <body>
        <form action="update.jsp">
            ID:<br>
            <input type="text" name="id"><br>
            
            <input type="submit" value="Search">
            
        </form>
        <h1>Students Details</h1>
        <% String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
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
      while (rs.next()){%>
      <table >
          <tr >
              <td><%=rs.getString(2) %></td>
              <td><%=rs.getString(3) %></td>
              <td><%=rs.getInt(4) %></td>
              <td><%=rs.getString(5)%></td>
              <td><%=rs.getString(6)%></td>
              <td><%=rs.getString(7)%></td>
          </tr>
      </table>
      
      <%//System.out.print("Name ="+na);
     // System.out.print("Query ="+sql);
      //out.print("Data inserted successfully.");
           }
   }
   catch(Exception e){
       e.printStackTrace();
   }
      
      
      %>
    </body>
    
</html>
