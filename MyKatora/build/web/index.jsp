<%-- 
    Document   : index
    Created on : Jul 30, 2016, 5:43:28 PM
    Author     : user
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lightning Haze</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    
    <body>
        <h1>Welcome to Lightning Haze</h1>
        &nbsp;<h2>Donors</h2>
        <form action="login.jsp" class="login">
            
            <input type="text" class="login-input" name="Username" value="Username"><br>
            
            <input type="password"class="login-input" name="Password" value="Password"><br>
            <input type="submit" value="Login" class="login-submit" ><br>
            <p class="login-help" ><a href="">Forgot Password?</a></p>
            <a href="signup.jsp">Sign Up</a>
        </form>
        &nbsp;<h3>Receivers</h3>
        <form action="takerlogin.jsp" class="login">
            <input type="text" class="login-input" name="Usern" value="Username"><br>
            <input type="password" class="login-input" name="Pass" value="Password"><br>
            <input type="submit" value="Login" class="login-submit"><br>
            <p class="login-help" ><a href="">Forgot Password?</a></p>
            <a href="takersign.jsp">Sign Up</a>
        </form>  
    </body>
</html>







