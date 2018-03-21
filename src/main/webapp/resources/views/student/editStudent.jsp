<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-21
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit My Profile</title>
</head>
<body>
<form:form action="addNewStudent" modelAttribute="student" method="POST">

    Login<form:input type="text" path="login"/><br>

    Imię: ${student.name}<br>
    Nazwisko: ${student.surname} <br>
    Telefon<form:input type="text" path="telephone"/><br>
    Pesel${student.pesel}<br>

    Numer ewidencyjny${student.regNum}<br>
    Numer PK${student.pkNum}<br>
    Numer dowodu${student.idNumber}<br>

    Data rozpoczęcia kursu${student.startDate}<br>
    Data zakończenia kursu${student.endDate}<br>

    Ulica<form:input type="text" path="street"/><br>
    Kod pocztowy<form:input type="text" path="postCode"/><br>
    Miasto<form:input type="text" path="city"/><br>

    <input type="submit" name="submit" value="Zatwierdź"/>

</form:form>
</body>
</html>
