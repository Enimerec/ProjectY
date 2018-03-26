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
Id studenta: ${lesson.student}<br>
Id instruktora: ${lesson.instructor}

</body>
</html>
