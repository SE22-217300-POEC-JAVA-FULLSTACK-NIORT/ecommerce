<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panier</title>
        <style>
         
        </style>
    </head>
    <body>
        <a href="store">Retour au magasin</a>
        
        <h1>Votre Panier</h1>
        
        <ul>
        <c:forEach items="${ articles }" var="article">
            <li>
                <c:out value="${ article.title }"></c:out>
        </c:forEach>
        </ul>
     
    </body>
</html>
