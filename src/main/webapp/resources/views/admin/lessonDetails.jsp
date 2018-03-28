<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-26
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lesson Details Page</title>
</head>
<body>

Data: ${lesson.date}<br>
Godzina rozpoczęcia: ${lesson.startHour}<br>
Godzina zakończenie: ${lesson.finishHour}<br>
Student: ${student.fullName}<br>
Instruktor: ${instructor.fullName}<br>

<a href="${pageContext.servletContext.contextPath}/panelAdmin/lessonList/lessonE/${lesson.lessonId}">Edytuj</a><br>
<a href="${pageContext.servletContext.contextPath}/panelAdmin/lessonList/lessonD/${lesson.lessonId}">Usuń</a><br>

<br>
<jsp:include page="../bottomMenu.jsp"/>
</body>
</html>
