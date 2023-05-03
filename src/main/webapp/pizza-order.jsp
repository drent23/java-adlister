<%--
  Created by IntelliJ IDEA.
  User: dr
  Date: 5/2/23
  Time: 12:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Renteria Pizzeria</title>
</head>
<body>
<h1>Please place your pizza order below:</h1>
<form action="/pizza-order" method="POST">
  <div class="form-group">
    <label for="crust">Pick your type of crust:</label>
    <select id="crust" name="crust">
      <option value="thin">Crunchy Thin</option>
      <option value="original">Original</option>
      <option value="deepDish">Deep Dish</option>
      <option value="newYork">New York</option>
    </select>
    <label for="sauce">Pick your sauce:</label>
    <select name="sauce" id="sauce">
      <option value="marinara">Marinara</option>
      <option value="barbecue">BBQ</option>
      <option value="alfredo">Alfredo</option>
      <option value="garlicParm">Garlic Parmesan</option>
      <option value="ranch">Ranch</option>
    </select>
    <label for="size">Pick your size:</label>
    <select name="size" id="size">
      <option value="small">Small</option>
      <option value="medium">Medium</option>
      <option value="large">Large</option>
      <option value="extraLg">XL</option>
    </select>
    <h6>What kind of toppings would you like?</h6>
    <label for="pepperoni">Pepperoni<input id="pepperoni" name="toppings" value="pepperoni" type="checkbox"></label>
    <label for="sausage">Sausage<input id="sausage" name="toppings" value="sausage" type="checkbox"></label>
    <label for="mushrooms">Mushrooms<input id="Mushrooms" name="toppings" value="mushrooms" type="checkbox"></label>
    <label for="onions">Onions<input id="onions" name="toppings" value="true" type="checkbox"></label>
    <label for="olives">Olives<input id="olives" name="toppings" value="true" type="checkbox"></label>
  </div>
  <button type="submit">Order Up!</button>
</form>
</body>
</html>
