<%-- 
    Document   : menu
    Created on : 17 nov. 2025, 16:17:13
    Author     : kauth_14
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>menu</title>
    </head>
    <body>
        <h3>Menu</h3>
        
        <a href="${pageContext.request.contextPath}/controler/panier"> voir panier</a>
        <a href="${pageContext.request.contextPath}/controler/ajouter"> ajouter un article</a>
        <a href="${pageContext.request.contextPath}/controler/logoff"> déconnexion</a>
    </body>
</html>
