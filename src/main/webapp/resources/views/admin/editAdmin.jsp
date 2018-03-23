<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-22
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Admin Page</title>
</head>
<body>
    <form:form action="" modelAttribute="admin" method="POST">
    Login<form:input type="text" path="login"/><br>
    Imię<form:input type="text" path="name"/><br>
    Nazwisko<form:input type="text" path="surname"/><br>
    Telefon<form:input type="text" path="telephone"/><br>
    E-Mail<form:input type="text" path="EMail"/><br>
</body>
</html>
