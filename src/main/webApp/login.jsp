<%--
  Created by IntelliJ IDEA.
  User: dr
  Date: 5/1/23
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>JSP Form</title>
</head>
<body>
<% request.setAttribute("message", "Welcome to my JSP page!");%>
<h1>${message}</h1>
<form method="POST" action="/login.jsp">
<label for="username">Username</label>
<input id="username" name="username" type="text">
<br><br>
<label for="password">Password</label>
<input id="password" name="password" type="password">
<br><br>
<input type="submit">
</form>
</body>
<% if (request.getMethod().equals("POST")) {
    if (request.getParameter("username").equals("admin")
            && request.getParameter("username") != null
            && request.getParameter("password").equals("password")
            && request.getParameter("password") != null){
      response.sendRedirect("/profile.jsp");
    } else {
        response.sendRedirect("/login.jsp");
    }
}
%>
</html>
