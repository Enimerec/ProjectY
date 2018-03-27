<%@ page import="pl.sda.projectY.bo.StudentFinder" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student List</title>
</head>
<body>
<h1>Lista wpłat</h1><br>
<h2>--------------------------</h2>
<ul>
    <c:forEach items="${payments}" var="payment">
        <li>
                ${payment.student},
                ${payment.amount},
                ${payment.date},
                ${payment.type},

        <sec:authorize access="hasRole('ADMIN')" >
                 <a href="${pageContext.servletContext.contextPath}/panelAdmin/paymentList/paymentE/${payment.paymentId}">Edytuj</a>,
                 <a href="${pageContext.servletContext.contextPath}/panelAdmin/paymentList/paymentD/${payment.paymentId}">Usuń</a><br>
        </sec:authorize>
        </li>
    </c:forEach>
</ul>
<h2>--------------------------</h2>

<br>
<jsp:include page="../bottomMenu.jsp"/>
</body>
</html>