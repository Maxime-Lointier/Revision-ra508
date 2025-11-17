<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head><title>Login</title></head>
<body>
    <h1>Authentification</h1>
    <form action="${pageContext.request.contextPath}/controler" method="post">
        <label for="login"> Identifiant </label>
        <input type="text" name="login" id="login" required>

        <label for="password"> Password </label>
        <input type="password" name="password" id="password" required>

        <input type="submit" value="valider">
    </form>
</body>
</html>