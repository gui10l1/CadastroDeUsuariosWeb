<%-- 
    Document   : remover
    Created on : 22/11/2019, 21:40:59
    Author     : Aluno07
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remover...</title>
    </head>
    <body>
        <h1>Remover um usuário</h1>
        <form action="RemoverServlet" method="POST">
            <p>
                <label>Email para remover</label>
                <input type="text" name="email">
            </p>
            <p>
                <input type="submit" value="Remover">
            </p>
            <p>${erro}</p>
        </form>
        <p><a href="index.html">Voltar para a home</a></p>
    </body>
</html>