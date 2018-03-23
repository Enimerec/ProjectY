<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-03-19
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Registration Form</title>
</head>
<body>
<form:form id="valid" action="" modelAttribute="newAdmin" method="POST" onsubmit="">
Login<form:input type="text" path="login" /><br>
Hasło<form:input type="text" path="password"/><br>


Imię<form:input type="text" path="name"/><br>
Nazwisko<form:input type="text" path="surname"/><br>
Telefon<form:input type="text" path="telephone"/><br>
E-Mail<form:input type="text" path="EMail"/><br>

<input type="submit" name="submit" value="Zarejestruj"/>
</form:form>

<script>
    $("#valid").validate({
        invalidHandler: function(event, validator) {
            // 'this' refers to the form
            var errors = validator.numberOfInvalids();
            if (errors) {
                var message = errors == 1
                    ? 'You missed 1 field. It has been highlighted'
                    : 'You missed ' + errors + ' fields. They have been highlighted';
                $("div.error span").html(message);
                $("div.error").show();
            } else {
                $("div.error").hide();
            }
        }
    });

</script>
<script src="${pageContext.servletContext.contextPath}/resources/js/jquery-1.10.2.js"></script>
</body>
</html>
