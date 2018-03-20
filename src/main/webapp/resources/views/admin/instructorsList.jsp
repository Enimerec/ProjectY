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
    <title>Instructors List</title>
</head>
<body>
<ul>
    <c:forEach items="${instructors}" var="instructor">
        <li>
                ${instructor.name},
                ${instructor.surname},
                ${instructor.instNumber},
            <a href="${pageContext.servletContext.contextPath}/panelAdmin/student/${instructor.userId}">Szczegóły</a>
        </li>
    </c:forEach>
</ul>
</body>
</html>
