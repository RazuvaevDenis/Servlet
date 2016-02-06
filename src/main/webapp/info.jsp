<%@ page import="netcracker.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <%
        User user = (User) request.getAttribute("user");
    %>
    <tr>
        <td>
            <%=user.getFio()%>
        </td>
        <td>
            <%=user.getEmail()%>
        </td>
        <td>
            <%=user.getAge()%>
        </td>
        <td>
            <%=user.getNumber()%>
        </td>
    </tr>
</table>

</body>
</html>
