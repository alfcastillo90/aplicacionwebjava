<%-- 
    Document   : response
    Created on : 29/06/2017, 12:58:23 AM
    Author     : Alfredo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.99.0/css/materialize.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col m12">
                    <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
                    <jsp:setProperty name="mybean" property="email"/>
                    <jsp:setProperty name="mybean" property="name"/>
                    <jsp:setProperty name="mybean" property="last_name"/>
                    <jsp:setProperty name="mybean" property="password"/>
                    <jsp:setProperty name="mybean" property="username" />
                     <ul class="collection with-header">
                        <li class="collection-header"><h4>Welcome <jsp:getProperty name="mybean" property="username" />, this is your account information</h4></li>
                        <li class="collection-item"><div>First Name: <jsp:getProperty name="mybean" property="name"/><a href="#!" class="secondary-content"><i class="material-icons">send</i></a></div></li>
                        <li class="collection-item"><div>Last Name: <jsp:getProperty name="mybean" property="last_name"/><a href="#!" class="secondary-content"><i class="material-icons">send</i></a></div></li>
                        <li class="collection-item"><div>Email: <jsp:getProperty name="mybean" property="email"/><a href="#!" class="secondary-content"><i class="material-icons">send</i></a></div></li>
                        <li class="collection-item"><div>Password: <jsp:getProperty name="mybean" property="password"/><a href="#!" class="secondary-content"><i class="material-icons">send</i></a></div></li>
                      </ul>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.99.0/js/materialize.min.js"></script>
    </body>
</html>
