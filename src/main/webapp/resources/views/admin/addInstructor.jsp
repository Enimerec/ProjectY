<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-19
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Instructor Registration Form</title>
</head>
<body>
<form:form action="" modelAttribute="newInstructor" method="POST">
Login<form:input type="text" path="login"/><br>
Hasło<form:input type="text" path="password"/><br>

Imię<form:input type="text" path="name"/><br>
Nazwisko<form:input type="text" path="surname"/><br>
Telefon<form:input type="text" path="telephone"/><br>
Email<form:input type="text" path="EMail"/><br>
Pesel<form:input type="text" path="pesel"/><br>
Numer ewidencyjny<form:input type="text" path="instNumber"/><br>

Ulica<form:input type="text" path="street"/><br>
Kod pocztowy<form:input type="text" path="postCode"/><br>
Miasto<form:input type="text" path="city"/><br>

<input type="submit" name="submit" value="Zarejestruj"/>

</form:form>
</body>
</html>
