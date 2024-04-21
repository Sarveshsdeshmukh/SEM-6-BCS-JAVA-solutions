<%@ page language="java" contentType="text/html"%>
<html>
    <head>
        <title>Slip 20 || Q1</title>
    </head>
    <body>
        <h2>Number to word Converter</h2>
        <form action = "" method="post">
            Enter the number <input type="text" name="no">
            <input type="submit" value ="Convert">
        </form>

        <% 
            if(request.getMethod().equals("POST")){
                String str = request.getParameter('no');
                int no = Integer.parseInt(str);

                String[]words = {
                    "ZERO","ONE","TWO","FOUR","FIVE",
                    "SIX","SEVEN","EIGHT","NINE"
                }

                String result = "";

                while(no != 0){
                    ind d = no%10;
                    result = words[d]+" "+result;
                    no = no/10;
                }
        %>

    <p style="color : red"><% str%-<%=result.trim()%></p>

    <% } %>
    </body>
</html>
