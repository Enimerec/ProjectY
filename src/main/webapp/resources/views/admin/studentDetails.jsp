
<%@ taglib prefix="a" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-20
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Details</title>
</head>
<body>

    Login: ${student.login}<br>
    Imię: ${student.name}<br>
    Nazwisko: ${student.surname}<br>
    Telefon: ${student.telephone}<br>


    Numer ewidencyjny: ${student.regNum}<br>
    Numer dowodu: ${student.idNumber}<br>
    Numer PK${student.pkNum}<br>

    Data rozpoczęcia: ${student.startDate}<br>
    Data zakończenia: ${student.endDate}<br>

    Miasto: ${student.city}<br>
    Kod pocztowy: ${student.postCode}<br>
    Ulica: ${student.street}<br>

    Główny instruktor: ${student.mainInstructor}<br>
    <br>
    Lista platności:
    <ul>
        <c:forEach items="${student.paymentList}" var="payment">
            <li>
                    ${payment.amount},
                    ${payment.date},
                    ${payment.type},
            </li>
        </c:forEach>
    </ul>
    <%--${student.lessonList}<br>--%>

<sec:authorize access="hasRole('STUDENT')" ><br>
<a href="${pageContext.servletContext.contextPath}panelStudent/MyProfile/edit">Edytuj</a>
</sec:authorize>

<sec:authorize access="hasRole('ADMIN')" >
<a href="${pageContext.servletContext.contextPath}/panelAdmin/studentList/changePassword/${student.userId}">Zmień hasło</a><br>
<a href="${pageContext.servletContext.contextPath}/panelAdmin/studentList/addMainInstructor/${student.userId}">Dodaj głównego instruktora</a><br>
<a href="${pageContext.servletContext.contextPath}/panelAdmin/studentList/studentE/${student.userId}">Edytuj</a><br>
<a href="${pageContext.servletContext.contextPath}/panelAdmin/studentList/studentD/${student.userId}">Usuń</a><br>
</sec:authorize>

</body>
</html>
