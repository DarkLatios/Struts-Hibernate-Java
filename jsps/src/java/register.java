/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
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
      String na=request.getParameter("Firstname");
      String ln=request.getParameter("Lastname");
      String ag=request.getParameter("Age");
      String gen=request.getParameter("gender");
      String st=request.getParameter("state");
      String q=request.getParameter("class");
      out.print(na+ln+ag);
      int a=Integer.parseInt(ag);
      stmt=(Statement) conn.createStatement();
      String sql="INSERT INTO info (Firstname,Lastname,Age,Gender,State,Quality) VALUES('"+na+"','"+ln+"',"+a+",'"+gen+"','"+st+"','"+q+"')";
      stmt.executeUpdate(sql);
      System.out.println("Data inserted successfully.");
      response.sendRedirect("web\register.jsp");
           }
   catch(Exception e){
       e.printStackTrace();
   }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
