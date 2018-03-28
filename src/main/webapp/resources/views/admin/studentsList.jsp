<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-20
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="${pageContext.servletContext.contextPath}/resources/css/app.css" rel="stylesheet">
    <title>Student List</title>
</head>
<body>

<div class="odstep">
<h1>Lista kursantów:</h1>
<br>
<table>
    <tr>
        <td>Nr Rej.</td><td>Nazwa</td><td>Instruktor główny</td><td></td>
    </tr>
    <c:forEach items="${students}" var="student">
        <tr>
            <td>${student.regNum}</td><td>${student.fullName}</td><td>${student.mainInstructor.fullName}</td>
            <td><a href="${pageContext.servletContext.contextPath}/panelAdmin/studentList/student/${student.userId}">
                Szczegóły</a></td>
        </tr>
    </c:forEach>
</table>
<br>
<jsp:include page="../bottomMenu.jsp"/>
    </div>
</body>
</html>

