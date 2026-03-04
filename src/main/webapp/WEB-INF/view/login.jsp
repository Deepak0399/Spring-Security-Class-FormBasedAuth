<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Login</title>
</head>
<body>
    <%
        String s = (String) request.getParameter("error");
        if (s != null) {
    %>
        <p style="color: red" align="center">INCORRECT USERNAME OR PASSWORD</p>
    <%   }%>
    <form method="post" action="/doLogin">
        <input type="text" name="username" placeholder="enter username"><br>
        <input type="password" name="password"><br>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
        <button>login</button>
    </form>
</body>
</html>