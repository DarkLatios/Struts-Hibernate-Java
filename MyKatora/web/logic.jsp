<%-- 
    Document   : logic
    Created on : Jul 31, 2016, 12:06:11 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String na=request.getParameter("Usern");
            String pas=request.getParameter("Pas");
            String s=request.getParameter("Phone");
            String em=request.getParameter("email");
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
            String DB_URL = "jdbc:mysql://localhost:3306/mykatora";
            String USER = "root";
            String PASS = "root";
            Connection conn = null;
            Statement stmt = null;
            Class.forName(JDBC_DRIVER);
            try{
 
       
       
     
      Class.forName(JDBC_DRIVER);

      
      
      conn =(Connection) DriverManager.getConnection(DB_URL, USER, PASS);
   
               stmt = conn.createStatement();
               String sql ="INSERT INTO login (Username,Password,Phone,Email) VALUES('"+na+"','"+pas+"','"+s+"','"+em+"')";
               int a=stmt.executeUpdate(sql);
               if(a!=0)
               {
                   out.println("OK");
               }else
               {
                   out.println("Error");
               }
            }catch(Exception ex)
            {
                ex.printStackTrace();
            }

                        
                        
               
                            
        %>

    </body>
            
</html>







    
    