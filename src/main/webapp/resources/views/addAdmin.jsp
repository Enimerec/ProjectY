<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-19
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Registration Form</title>
</head>
<body>
Login<form:input type="text" path="login"/><br>
Hasło<form:input type="text" path="pass"/><br>

Imię<form:input type="text" path="name"/><br>
Nazwisko<form:input type="text" path="surname"/><br>
Telefon<form:input type="text" path="phone"/><br>
Pesel<form:input type="text" path="pesel"/><br>

<input type="submit" name="submit" value="Zarejestruj"/>
</body>
</html>
