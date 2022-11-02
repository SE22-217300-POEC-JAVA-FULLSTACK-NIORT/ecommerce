<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Store</title>
        <style>
         
        </style>
    </head>
    <body>
        <a href="basket">Afficher votre panier</a>
        
        <h1>Store</h1>
        
        <ul>
        <c:forEach items="${ articles }" var="article">
            <li>
                <c:out value="${ article.title }">-</c:out>
                <form action="basket" method="POST">
                    <input type="hidden" name="articleId" value="${ article.id }"/>
                    <input type="submit" value="Ajouter au panier"/>
                </form>
        </c:forEach>
        </ul>
     
    </body>
</html>
