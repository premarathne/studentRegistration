

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enable/Disable Account</title>
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
            </div>
            </ul>
            </div>
        </nav>
        </div>
        
        <h1>Enable/Disable Account</h1>
        <div class="container">
            <div class="box">
                <Form action="AccountHandle" method="post">
                    <p>StudentID</p><p>  <input type="text" name="Studentid"></p>
                     <p> Activate Account</p><p><input type="radio" name="radios" value="1" checked></p>
                    <p> Deactivate Account</p><p><input type="radio" name="radios" value="0"></p>
            
                     
                    
   
                    <input type="submit" value="Submit">
                </Form>
            </div>   
        </div>
    </body>
</html>
