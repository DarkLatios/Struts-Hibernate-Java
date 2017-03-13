<%-- 
    Document   : index
    Created on : Jun 16, 2016, 1:23:41 PM
    Author     : user
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.io.*,java.util.*" %>

<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>School Page</title>
    </head>
    
    <body>
        <h1>Hello World!</h1>
        <form action="register">
            First name:<br>
            <input type="text" name="Firstname"><br>
            Last Name:<br>
            <input type="text" name="Lastname"><br>
            Age:<br>
            <input type="number" name="Age"><br>
            Gender:<br>
            <input type="radio" name="gender" value="Male">Male
            <input type="radio" name="gender" value="Female">Female<br>
            State:
            <select name="state">
                <option value="">choose a state...</option>
                <option value="UP">Uttar Pradesh</option>
                <option value="MH">Maharashtra</option>
                <option value="RJ">Rajasthan</option>
                <option value="AS">Assam</option>
            </select><br>
            <br>
            This Database is:
            <input type="checkbox" name="class" value="Awesome">Awesome
            <input type="checkbox" name="class" value="Excellent">Excellent
            <input type="checkbox" name="class" value="Good">Good
            <br>
            <br>
            <input type="submit" value="Submit">
            <a href="register.jsp">Show Details</a>
                
        </form>
              
    </body>
</html>
