<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-20
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admins List</title>
</head>
<body>
<ul>
    <c:forEach items="${admins}" var="admin">
        <li>
                  ${admin.name},
                  ${admin.surname},
         <a href="${pageContext.servletContext.contextPath}/panelAdmin/adminList/admin/${admin.userId}">Szczegóły</a>
        </li>
    </c:forEach>
</ul>

<br>
<jsp:include page="../bottomMenu.jsp"/>
</body>
</html>
