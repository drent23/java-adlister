<%--
  Created by IntelliJ IDEA.
  User: dr
  Date: 5/4/23
  Time: 11:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create an Ad</title>
</head>
<body>
<h1>Create A Product</h1>
<form action="/ads" method="post">
    <label for="userId">Please enter your user ID:</label>
    <input name="userId" id="userId" type="number">
    <br />
    <label for="title">Please create a title for your ad:</label>
    <input name="title" id="title" type="text">
    <br />
    <label for="description">Please describe your product:</label>
    <input name="description" id="description" type="text">
    <br />
    <button type="submit">Create Ad</button>
</form>
</body>
</html>
