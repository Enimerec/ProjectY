<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-21
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Student</title>
</head>
<body>
<form:form action="/panelAdmin/studentList/studentE/" modelAttribute="student" method="POST">

    <form:input type="hidden" path="userId"/><br>
    Login<form:input type="text" path="login"/><br>
    Hasło: <form:input type="password" path="password"/>Podać tylko jeśli chcesz zmienić <br>
    Imię<form:input type="text" path="name"/><br>
    Nazwisko<form:input type="text" path="surname"/><br>
    Telefon<form:input type="text" path="telephone"/><br>
    Pesel<form:input type="text" path="pesel"/><br>

    Numer ewidencyjny<form:input type="text" path="regNum"/><br>
    Numer PK<form:input type="text" path="pkNum"/><br>
    Numer dowodu<form:input type="text" path="idNumber"/><br>

    Data rozpoczęcia kursu<form:input type="text" path="startDate"/><br>
    Data zakończenia kursu<form:input type="text" path="endDate"/> <br>

    Ulica<form:input type="text" path="street"/><br>
    Kod pocztowy<form:input type="text" path="postCode"/><br>
    Miasto<form:input type="text" path="city"/><br>

    <input type="submit" name="submit" value="Zatwierdź"/>

</form:form>
<br>
<jsp:include page="../bottomMenu.jsp"/>
</body>
</html>
