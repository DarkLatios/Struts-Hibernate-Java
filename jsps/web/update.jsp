<%-- 
    Document   : update
    Created on : Jul 15, 2016, 12:32:04 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
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
      String na=request.getParameter("id");
      int i=Integer.parseInt(na);
      //String ln=request.getParameter("Lastname");
      //String ag=request.getParameter("Age");
      out.print(i);
      //int a=Integer.parseInt(ag);
      stmt=(Statement) conn.createStatement();
      String sql="SELECT * FROM INFO Where id="+i;
      ResultSet rs= stmt.executeQuery(sql);
      if(rs.next()){
      %>
      <form action="search">
            ID:<br>
            <input type="text" name="id" value="<%=rs.getInt(1) %>"><br>
            First name:<br>
            <input type="text" name="Firstname" value="<%=rs.getString(2) %>"><br>
            Last Name:<br>
            <input type="text" name="Lastname" value="<%=rs.getString(3) %>"><br>
            Age:<br>
            <input type="number" name="Age" value="<%=rs.getInt(4) %>"><br>
            <input type="submit" value="Update">
            
        </form>
      
      <%
      System.out.print("id ="+na);
      System.out.print("Query ="+sql);
      out.print("Data inserted successfully.");
      }
           }
   catch(Exception e){
       e.printStackTrace();
   }
      
      
      %>
    </body>
</html>
