<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>OSK App</title>
    <link href="${pageContext.servletContext.contextPath}/resources/css/app.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form:form action="login" method="POST">
<jsp:include page="menu.jsp" /><br>
    Aplikacja do obslugi osk.
    Login<form:input type="text" path="login"/><br>
    Hasło<form:input type="password" path="password"/><br>

    <input type="submit" name="submit" value="Zaloguj"/>
</form:form>
<script src="${pageContext.servletContext.contextPath}/resources/js/jquery.slim.js"></script>
<script src="${pageContext.servletContext.contextPath}/resources/js/popper.js"></script>
<script src="${pageContext.servletContext.contextPath}/resources/js/js_bootstrap.js"></script>
</body>
</html>

