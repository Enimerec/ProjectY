<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-19
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>

<form:form action="addNewStudent" modelAttribute="StudentDto" method="POST">

    Login<form:input type="text" path="login"/><br>
    Hasło<form:input type="text" path="pass"/><br>

    Imię<form:input type="text" path="name"/><br>
    Nazwisko<form:input type="text" path="surname"/><br>
    Telefon<form:input type="text" path="phone"/><br>
    Pesel<form:input type="text" path="pesel"/><br>

    Numer ewidencyjny<form:input type="text" path="regNum"/><br>
    Numer PK<form:input type="text" path="pkNum"/><br>
    Numer dowodu<form:input type="text" path="idNum"/><br>

    Data rozpoczęcia kursu<form:input type="text" path="startDate"/><br>
    Data zakończenia kursu<form:input type="text" path="endDate"/> <br>

    Ulica<form:input type="text" path="street"/><br>
    Kod pocztowy<form:input type="text" path="postCode"/><br>
    Miasto<form:input type="text" path="city"/><br>

    <input type="submit" name="submit" value="Zarejestruj"/>

</form:form>
</body>
</html>