<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-26
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lesson List Page</title>
</head>
<body>
<ul>
    <c:forEach items="${lessons}" var="lesson">
        <li>
                Data: ${lesson.date},
                Student: ${lesson.student.fullName},
                Instruktor: ${lesson.instructor.fullName},
            <a href="${pageContext.servletContext.contextPath}/panelAdmin/lessonList/lesson/${lesson.lessonId}">Szczegóły</a>
        </li>
    </c:forEach>
</ul>

<br>
<jsp:include page="../bottomMenu.jsp"/>
</body>
</html>
