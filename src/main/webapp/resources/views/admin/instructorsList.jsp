<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-20
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="${pageContext.servletContext.contextPath}/resources/css/app.css" rel="stylesheet">
    <title>Instructors List</title>
</head>
<body>
<div class="odstep">
    <h1>Lista instruktorów:</h1>
    <br>
    <table>
        <tr>
            <td>Nr instruktora</td><td>Nazwa</td><td></td>
        </tr>
        <c:forEach items="${instructors}" var="instructor">
            <tr>
                <td>${instructor.instNumber}</td><td>${instructor.name} ${instructor.surname}</td>
                <td><a href="${pageContext.servletContext.contextPath}/panelAdmin/instructorList/instructor/${instructor.userId}">Szczegóły</a>
                </td>
            </tr>
        </c:forEach>
    </table>

<br>
<jsp:include page="../bottomMenu.jsp"/>
</body>
</html>
