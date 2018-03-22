<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>OSK App</title>
    <link href="${pageContext.servletContext.contextPath}/resources/css/app.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<%--<jsp:include page="menu.jsp" /><br>--%>
Aplikacja do obslugi osk. <br>
<form action="${pageContext.servletContext.contextPath}/login" method="post">
    Login<input type="text" name="login"/><br>
    Hasło<input type="password" name="password"/><br>

    <input type="submit" name="submit" value="Zaloguj"/>
</form>
</body>
</html>

