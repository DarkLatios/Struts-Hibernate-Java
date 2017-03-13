<%-- 
    Document   : signup
    Created on : Jul 30, 2016, 10:31:37 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*,java.util.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
    </head>
    <body>
        <h1>Welcome New User</h1>
        <form action="logic.jsp">
            Username
            <input type="text" name="Usern"><br>
            <br>
            Password
            <input type="text" name="Pas"><br>
            <br>
            Mobile Number
            <input type="text" name="Phone"><br>
            <br>
            Email Address
            <input type="text" name="email"><br>
            <br>
            <input type="submit" value="Generate"><br>
        </form>
        
    </body>
</html>

