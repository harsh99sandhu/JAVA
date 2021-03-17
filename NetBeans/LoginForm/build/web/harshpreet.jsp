
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
        <style>
            td{
                padding: 10px;
            }
            div{
                width: 50%;
                border: 1px solid black;
                border-radius: 5px;
                background-color: lightskyblue;
            }
        </style>
    </head>
    <body>
    <center><h1><u>Login to your account</u></h1></center>
    <br />
    <br />
    <center><u>Harshpreet_page</u></center>
    <center>
        <div>
            <form action="login" method="POST">
            <table>
                <tr>
                    <td>Username</td>
                    <td><input type="text"  class="form-control" name="username" placeholder="example@gmail.com"></td>
                </tr> 
                <tr>
                    <td>Password</td>
                    <td><input type="password" class="form-control" name="password" placeholder="Password"></td>
                </tr> 
                <tr>
                    <td colspan="2" style="text-align: center"><input class="btn btn-success" type="submit" value="Submit"></td>
                </tr>
            </table>
            </form>
        </div>
    </center>
    
    </body>
</html>
