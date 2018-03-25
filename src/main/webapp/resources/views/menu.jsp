<%--
  Created by IntelliJ IDEA.
  User: trutyna
  Date: 2018-02-25
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <link href="${pageContext.servletContext.contextPath}/resources/css/app.css" rel="stylesheet">
    <link href="${pageContext.servletContext.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="btn-group">
    <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        Admini
    </button>
    <div class="dropdown-menu">
        <a class="dropdown-item" href="${pageContext.servletContext.contextPath}/panelAdmin/adminList">Lista adminow</a>
        <a class="dropdown-item" href="${pageContext.servletContext.contextPath}/panelAdmin/addAdmin">Dodaj admina</a>
    </div>
</div>
<div class="btn-group">
    <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        Kursanci
    </button>
    <div class="dropdown-menu">
        <a class="dropdown-item" href="${pageContext.servletContext.contextPath}/panelAdmin/studentList">Lista kursantow</a>
        <a class="dropdown-item" href="${pageContext.servletContext.contextPath}/panelAdmin/addStudent">Dodaj kursanta</a>
    </div>
</div>
<div class="btn-group">
    <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        Instruktorzy
    </button>
    <div class="dropdown-menu">
        <a class="dropdown-item" href="${pageContext.servletContext.contextPath}/panelAdmin/instructorList">Lista instruktorow</a>
        <a class="dropdown-item" href="${pageContext.servletContext.contextPath}/panelAdmin/addInstructor">Dodaj instruktora</a>
    </div>
</div>
<div class="btn-group">
<button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Wpłaty
</button>
<div class="dropdown-menu">
    <a class="dropdown-item" href="${pageContext.servletContext.contextPath}/panelAdmin/paymentList">Lista wpłat</a>
    <a class="dropdown-item" href="${pageContext.servletContext.contextPath}/panelAdmin/addPayment">Dodaj wplate</a>
</div>
</div>
<div  class="btn-group">
    <a class="btn btn-danger" href="<c:url value="/logout" />" role="button">Logout</a>
</div>

<script src="${pageContext.servletContext.contextPath}/resources/js/jquery.slim.js"></script>
<script src="${pageContext.servletContext.contextPath}/resources/js/popper.js"></script>
<script src="${pageContext.servletContext.contextPath}/resources/js/js_bootstrap.js"></script>

</body>