<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-21
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Instructor Detils Page</title>
</head>
<body>

Login: ${mainInstructor.login}<br>
Imię: ${mainInstructor.name}<br>
Nazwisko: ${mainInstructor.surname}<br>
Telefon: ${mainInstructor.telephone}<br>
E-Mail: ${mainInstructor.EMail}<br>

Pesel: ${mainInstructor.pesel}<br>
Numer ewidencyjny: ${mainInstructor.instNumber}<br>

Miasto: ${mainInstructor.city}<br>
Kod pocztowy: ${mainInstructor.postCode}<br>
Ulica: ${mainInstructor.street}<br>
<br>
Lista kursantów;
<ul>
    <c:forEach items="${mainInstructor.studentList}" var="student">
        <li>
                ${student.fullName}

        </li>
    </c:forEach>
</ul>
<br>
Lista jazd:
<ul>
    <c:forEach items="${lesson}" var="lesson">
    <li>
            ${lesson.date},
            ${lesson.startHour},
            ${lesson.finishHour},
            ${lesson.student.fullName}
    </li>
    </c:forEach>
</ul>

<sec:authorize access="hasRole('INSTRUCTOR')" ><br>
    <a href="${pageContext.servletContext.contextPath}panelInstructor/MyProfile/edit">Edytuj</a>
</sec:authorize>

<sec:authorize access="hasRole('ADMIN')" >
    <a href="${pageContext.servletContext.contextPath}/panelAdmin/instructorList/instructorE/${mainInstructor.userId}">Edytuj</a><br>
    <a href="${pageContext.servletContext.contextPath}/panelAdmin/instructorList/instructorD/${mainInstructor.userId}">Usuń</a><br>
</sec:authorize>

<br>
<jsp:include page="../bottomMenu.jsp"/>
</body>
</html>
