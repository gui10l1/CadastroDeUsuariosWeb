<%-- 
    Document   : perfil
    Created on : 27/11/2019, 21:25:11
    Author     : Aluno07
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfil</title>
    </head>
    <body>
    <center>

        <h1>Perfil</h1>

        <table border="1" align="center" width="300">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Email</th>
                    <th>Senha</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${usuario.id}</td>
                    <td>${usuario.email}</td>
                    <td>${usuario.senha}</td>
                </tr>
            </tbody>
        </table>
        <p><a href="ProcurarServlet">Voltar</a></p>
    </center>
</body>
</html>