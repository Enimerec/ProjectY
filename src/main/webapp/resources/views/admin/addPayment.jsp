<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-19
  Time: 18:4
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>

<form:form action="" modelAttribute="newPayment" method="POST">

    Kwota: <form:input type="number" path="amount"/><br>
    Data: <form:input type="date" path="date"/><br>
  <%-- Id studenta: <form:input type="number" path="student"/><br>--%>

    Id studenta: <form:select path="student">
                    <form:options label="Wybierz" items="${stuOpt}" itemValue="userId" itemLabel="fullName"/>
                 </form:select><br>


    Typ płatności: <form:select path="type">
                        <form:options label="Wybierz" items="${aveOpt}" itemValue="type" itemLabel="type"/>
                    </form:select>

    <input type="submit" name="submit" value="Zatwierdź"/>

</form:form>
<br>
<jsp:include page="../bottomMenu.jsp"/>
</body>
</html>