<%--
  Created by IntelliJ IDEA.
  User: ChoseN
  Date: 4/16/2023
  Time: 1:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>R E P O N S E</title>
</head>
<body>
        <p> Nom     : <%= request.getParameter("nom")%></p>
        <p> Prenom  : <%= request.getParameter("prenom")%></p>
        <p>
            <% if (request.getParameterValues("radio1")[0].equals(("mas"))){ %>
            C'est un homme. IL
            <% } else { %>
            C'est une femme. Elle <% } %>
            a écrit : <%= request.getParameter("textarea") %>
        </p>
</body>
</html>
