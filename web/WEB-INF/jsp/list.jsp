<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>username</th>
        <th>password</th>
    </tr>
    <c:forEach items="${list}" var="login">
        <tr>
            <h1>XXXX</h1>
            <td>${login.username}</td>
            <td>${login.password}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
