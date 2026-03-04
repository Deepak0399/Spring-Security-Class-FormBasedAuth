<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Admin</title>
</head>
<body>
<h2>This is admin page</h2>
<a href="/doLogout">LOGOUT</a>

<form action="/doLogout" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    <button>LOGOUT</button>
</form>
</body>
</html>