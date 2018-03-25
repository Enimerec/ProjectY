<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-22
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Details Page</title>
</head>
<body>
    Login: ${admin.login}<br>
    Imię: ${admin.name}<br>
    Nazwisko: ${admin.surname}<br>
    Telefon: ${admin.telephone}<br>
    E-Mail: ${admin.EMail}<br>

    <a href="${pageContext.servletContext.contextPath}/panelAdmin/adminList/changePassword/${admin.userId}">Zmień hasło</a><br>
    <a href="${pageContext.servletContext.contextPath}/panelAdmin/adminList/adminE/${admin.userId}">Edytuj</a><br>
    <a href="${pageContext.servletContext.contextPath}/panelAdmin/adminList/adminD/${admin.userId}">Usuń</a><br>
</body>
</html>
