<%@ page import="netcracker.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Info</title>
</head>
<body>
<table>
    <tr>
        <td>FIO</td>
        <td>E-mail</td>
        <td>Age</td>
        <td>Number</td>
    </tr>
    <c:forEach var="user" items="${users}">
    <tr>
        <td>
            ${user.getFio()}
        </td>
        <td>
            ${user.getEmail()}
        </td>
        <td>
            ${user.getAge()}
        </td>
        <td>
            ${user.getNumber()}
        </td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
