<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession sessionObject = request.getSession(false);
    String username = (String) sessionObject.getAttribute("username");
    if(username.equals("")){
        response.sendRedirect("index.html");
    }
%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Welcome</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>hello <% out.println(username); %> your access is enabled</h1>
    </body>
</html>
