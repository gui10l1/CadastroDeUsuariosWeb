<%-- 
    Document   : procurar
    Created on : 22/11/2019, 21:40:46
    Author     : Aluno07
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procurar...</title>
    </head>
    <body>
        <h1>Procurar usuario</h1>
        <form action="ProcurarServlet" method="POST">
            <p>
                <label>Email do usuario:</label>
                <input type="text" name="email">
            </p>
            <p>
                <input type="submit" value="Procurar">
            </p>
            <p>${erro}</p>
        </form>
        <p><a href="index.html">Voltar para a home</a></p>
    </body>
</html>