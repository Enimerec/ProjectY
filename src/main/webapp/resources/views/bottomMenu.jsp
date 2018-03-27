<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Bogusz
  Date: 27.03.2018
  Time: 00:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
        <link href="${pageContext.servletContext.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div  class="btn-group">
    <a class="btn btn-dark btn-sm" href="javascript:history.back()" role="button">Powrót</a>
</div>
<div  class="btn-group">
    <sec:authorize access="hasRole('ADMIN')" >
    <a class="btn btn-dark btn-sm" href="${pageContext.servletContext.contextPath}/panelAdmin" role="button">Panel główny</a>
    </sec:authorize>
    <sec:authorize access="hasRole('STUDENT')" >
        <a class="btn btn-dark btn-sm" href="${pageContext.servletContext.contextPath}/panelStudent" role="button">Panel główny</a>
    </sec:authorize>
    <sec:authorize access="hasRole('INSTRUCTOR')" >
        <a class="btn btn-dark btn-sm" href="${pageContext.servletContext.contextPath}/panelInstructor" role="button">Panel główny</a>
    </sec:authorize>
</div>
</body>
</html>
