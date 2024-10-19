<%--
  Created by IntelliJ IDEA.
  User: Dorisnguyeen
  Date: 2024/10/15
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>${errorMessage}</p>
    <h2>Login page </h2>
    <form action="/auth/login" method="post">
        Username: <input type="text" name="username"><br>
        Password: <input type="password" name="password"><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>
