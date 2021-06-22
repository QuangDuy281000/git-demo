<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/6/2021
  Time: 9:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pro</title>
</head>
<body>
<%
    String name = request.getParameter("username");
    request.setAttribute("stringName",name);
    RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/Home.jsp");
    rd.forward(request,response);
%>
</body>
</html>
