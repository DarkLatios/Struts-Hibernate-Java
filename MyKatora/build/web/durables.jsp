<%-- 
    Document   : durables
    Created on : Jul 31, 2016, 3:54:33 PM
    Author     : user
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.io.*,java.util.*" %>

<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Durables</title>
    </head>
    <h1>Hello</h1>
    <body>
        <%  /*String us=request.getParameter("Username");
            
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
            String DB_URL = "jdbc:mysql://localhost:3306/mykatora";
            String USER = "root";
            String PASS = "root";
            Connection conn = null;
            Statement stmt = null;
            Statement stmt2=null;
            Class.forName(JDBC_DRIVER);
            try{
 
       
       
     
      Class.forName(JDBC_DRIVER);

      
      
      conn =(Connection) DriverManager.getConnection(DB_URL, USER, PASS);
      
               stmt = conn.createStatement();
               
               String sql ="Select * from login Where Username='" + us + "'";
         
                        

         ResultSet rs=stmt.executeQuery(sql);
         if(rs.next())
                 {
                  rs.getString(2);*/   
                 
        %>
        
         
         
        
         <% /*     
                 }
                 stmt.close();
                 conn.close();
                }catch(Exception e){
                    e.printStackTrace();
                }*/%>
        
                <form action="donor">
            Full Name:
            <input type="text" name="fname">
            &nbsp;City:
            <select name="city">
                <option value="">Choose a city...</option>
                <option value="MUM">Mumbai</option>
                <option value="Lko">Lucknow</option>
                <option value="Del">Delhi </option>
                <option value="Chan">Chandigarh</option>
                <option value="Jai">Jaipur</option>
                
            </select><br>
            <br>
            What Do You Want to donate :
            <input type="checkbox" name="eclass" value="Food">Food
            <input type="checkbox" name="fclass" value="Shelter">Shelter
            <input type="checkbox" name="gclass" value="Clothes">Clothes
            <input type="checkbox" name="lclass" value="Medicine">Medicine
            <br>
            <br>
            <input type="submit" value="Submit">
            
                
        </form>
              
    </body>
</html>




