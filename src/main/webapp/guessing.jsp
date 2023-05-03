<%--
  Created by IntelliJ IDEA.
  User: dr
  Date: 5/3/23
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Take a Guess!</title>
</head>
<body>
<h1>Guess a number between 1 and 3:</h1>
<form action="guessing-outcome.jsp" method="POST">
<input name="numGuess" placeholder="Numbers 1, 2, or 3 only" type="number">
<button type="submit">Press for chance to win!</button>
</form>
</body>
</html>
