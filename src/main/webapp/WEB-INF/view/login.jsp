<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Login</title>
</head>
<body>
    <form method="post" action="/doLogin">
        <input type="text" name="username" placeholder="enter username"><br>
        <input type="password" name="password"><br>
        <button>login</button>
    </form>
</body>
</html>