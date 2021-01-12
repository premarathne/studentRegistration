

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADMIN LOGIN </title>
    </head>
    <body>
        <div>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Student_Registration</a>
                </div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="http://localhost:8080/StudentRegistrations/AdminLogin.jsp">Login</a></li>
                <li> <a href="http://localhost:8080/StudentRegistrations/Disable_Enable_User.jsp">Student Account Handle</a></li>
            </ul>
            </div>
        </nav>
        </div>
        <h1>ADMIN LOGIN</h1>
        <div class="container">
            <div class="box">
                    <form action="AdminLogin" method="POST">
                        <p>UserName</p><input type="text" name="username" placeholder="username" required> 
                        <p>Password</p><input type="password" name="password" placeholder="password" required>
                                <input type="submit" value="Sign in">   
                    </form>
                
            </div>
        </div>    
    </body>
</html>
