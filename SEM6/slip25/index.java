<%@ page language="java" contentType="text/html"%>

<html>
<head>
    <title>Voter</title>
</head>

<body>
    <h2>Voter Eligiblity</h2>
    <form action="" method="post">
            Enter your name : <input type="text" name="name">
            Enter your age : <input type="text" name = "age">
    </form>

    <% 
        if(request.getMethod().equals("POST")){
            String name = request.getParameter("name");
            int age = Integer.parseInt(request.getParameter("age"));
        }  
    %>
    <% if(age>=18) {%>
        <p style="color:green"><%= name%>is eligible for voting</p>
    <%} else {%>
        <p style="color:red"><%= name%>is not eligible for voting</p>
    <%} %>
</body>