<%@ page import="pl.sda.projectY.bo.StudentFinder" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student List</title>
</head>
<body>
<ul>
    <c:forEach items="${payments}" var="payment">
        <li>

                ${payment.amount},
                ${payment.date},
                ${payment.type},

        <sec:authorize access="hasRole('ADMIN')" >
                 <a href="${pageContext.servletContext.contextPath}/panelAdmin/
                 paymentList/paymentE/${payment.paymentId}">Edytuj</a><br>
                 <a href="${pageContext.servletContext.contextPath}/panelAdmin/
                 paymentList/paymentD/${payment.paymentId}">Usuń</a><br>
        </sec:authorize>
        </li>
    </c:forEach>
</ul>
</body>
</html>