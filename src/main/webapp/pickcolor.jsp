<%--
  Created by IntelliJ IDEA.
  User: dr
  Date: 5/3/23
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color Pick</title>
</head>
<body>
<div class="container">
    <h1>Enter your favorite color below:</h1>
    <form action="/pickcolor" method="POST">
        <div class="form-group">
            <label for="color">Favorite color:</label>
            <!--Parameter name = "name"-->
            <input id="color" name="colorpick" class="form-control" type="text">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Submit">
    </form>
</div>
</body>
</html>
