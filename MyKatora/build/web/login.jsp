<%-- 
    Document   : login
    Created on : Jul 30, 2016, 6:08:51 PM
    Author     : user
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello User</title>
    </head>
    <body>
        <%
            String us=request.getParameter("Username");
            String pass=request.getParameter("Password");
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
      //System.out.println("Database connected successfully");
               stmt = conn.createStatement();
               String sql ="Select * from login Where Username='" + us + "' and Password='" + pass + "'";
                        
//System.out.println("Query Run Properly");
                        ResultSet rs=stmt.executeQuery(sql);
                        if(rs.next())
                        {
                           // stmt2=conn.createStatement();
                            //String sql1 ="SELECT * FROM login";
                            //ResultSet rs2=stmt2.executeQuery(sql1);
                            //while(rs2.next())
                            {%>
                            <a href="durables.jsp">Durables</a><br>
                            <a href="stale.jsp">Consumables</a><br>
                            
             
                                     <%
          
      
                                
                            }
                            
                          
                            
                                

                        }
                        else
                        {
                                out.println("ERROR");
                        }

                        stmt.close();
                        conn.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            %>
            
            
   
   
   
   
       
     
      
        
                    
      
   
        
            
        
      
      
        
            
      
      
      
        
     
   
  
        
        
        
    </body>
</html>
