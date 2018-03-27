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
    <title>Student List</title>
</head>
<body>
<ul>
    <c:forEach items="${students}" var="student">
        <li>
                ${student.name},
                ${student.surname},
                ${student.mainInstructor},
                ${student.regNum},
            <a href="${pageContext.servletContext.contextPath}/panelAdmin/studentList/student/${student.userId}">
                Szczegóły</a>
        </li>
    </c:forEach>
</ul>
<br>
<jsp:include page="../bottomMenu.jsp"/>
</body>
</html>

