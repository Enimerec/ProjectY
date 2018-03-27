<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-27
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Change Password Page</title>
</head>
<body>
<form:form action="" modelAttribute="user" method="POST">
    Hasło: <form:input type="password" path="password"/><br>
    <%--Powtórz hasło: <form:input type="password" path=""/><br> TODO sprawdzanie hasla--%>

    <input type="submit" name="submit" value="Zatwierdź"/>
</form:form>
</body>
</html>
