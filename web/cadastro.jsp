<%-- 
    Document   : cadastro
    Created on : 22/11/2019, 21:40:19
    Author     : Aluno07
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h1>Cadastro de usuários</h1>
        <form action="CadastrarServlet" method="POST">           
            <p>
                <label>Email</label>
                <input type="text" name="email">
            </p>

            <p>
                <label>Senha</label>
                <input type="password" name="senha">
            </p>

            <p>
                <input type="submit" value="Enviar"> 
            </p>
            <p>${erro}</p>
        </form>
        <a href="index.html">Voltar para a home</a>
    </body>
</html>