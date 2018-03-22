<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
<form:form action="" modelAttribute="newAdmin" method="POST">
Login<form:input type="text" path="login"/><br>
Hasło<form:input type="text" path="password"/><br>


Imię<form:input type="text" path="name"/><br>
Nazwisko<form:input type="text" path="surname"/><br>
Telefon<form:input type="text" path="telephone"/><br>
E-Mail<form:input type="text" path="EMail"/><br>

<input type="submit" name="submit" value="Zarejestruj"/>
</form:form>
</body>
</html>
