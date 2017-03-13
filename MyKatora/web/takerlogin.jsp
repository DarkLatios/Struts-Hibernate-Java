<%-- 
    Document   : takerlogin
    Created on : Jul 31, 2016, 2:35:55 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
                <%
            String us=request.getParameter("Usern");
            String pass=request.getParameter("Pass");
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
               String sql ="Select * from takers Where Username='" + us + "' and Password='" + pass + "'";
                        
//System.out.println("Query Run Properly");
                        ResultSet rs=stmt.executeQuery(sql);
                        if(rs.next())
                        {
                            stmt2=conn.createStatement();
                            String sql1 ="SELECT * FROM takers";
                            ResultSet rs2=stmt2.executeQuery(sql1);
                            while(rs2.next())
                            {%>
                            <table>
                                <tr>
                                     <td><%=rs2.getString(2) %></td>
                                     <td><%=rs2.getString(3) %></td>
                                    
                                </tr>
                                </table>
                                     <%
          
      
                                
                            }
                            out.println("OK");
                          
                            
                                

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
