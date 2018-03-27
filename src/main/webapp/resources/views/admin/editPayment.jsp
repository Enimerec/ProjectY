<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-22
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Payment Edit Page</title>
</head>
<body>
<form:form action="panelAdmin/paymentList/paymentE/" modelAttribute="payment" method="POST">

    <form:input type="hidden" path="paymentId"/><br>
    Kwota: <form:input type="number" path="amount"/><br>
    Data: <form:input type="date" path="date"/><br>
    Id studenta: <form:select path="student">
                      <form:options label="Wybierz" items="${stuOpt}" itemValue="userId" itemLabel="fullName"/>
                 </form:select><br>
    Typ płatności: <form:select path="type">
                        <form:options items="${aveOpt}" itemValue="type" itemLabel="type"/>
                   </form:select><br>

    <input type="submit" name="submit" value="Zatwierdz"/>

</form:form>

<br>
<jsp:include page="../bottomMenu.jsp"/>
</body>
</html>
