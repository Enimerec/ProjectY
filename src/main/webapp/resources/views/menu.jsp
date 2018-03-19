<%--
  Created by IntelliJ IDEA.
  User: trutyna
  Date: 2018-02-25
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<ul>
    <li><a href="${pageContext.servletContext.contextPath}/main">Home</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/costs"></a></li>
    <li><a href="<c:url value="/logout" />">Logout</a></li>
</ul>