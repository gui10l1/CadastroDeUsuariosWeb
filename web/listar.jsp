<%-- 
    Document   : listar
    Created on : 22/11/2019, 21:40:32
    Author     : Aluno07
--%>

<%@page import="classes.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    ArrayList<Usuario> usuarios = (ArrayList<Usuario>) request.getAttribute("usuarios");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listagem de Usuarios</title>
    </head>
    <body>
    <center>
        <h1>Usuarios cadastrados</h1>

        <table border="1" align="center" width="300">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Email</th>
                    <th>Senha</th>
                </tr>
            </thead>
            <tbody>
                <% for (Usuario u : usuarios) {%>
                <tr>
                    <td><%= u.getId()%></td>
                    <td><%= u.getEmail()%></td>
                    <td><%= u.getSenha()%></td>
                </tr>
                <% }%>
            </tbody>
        </table>
        <p>
            <a href="index.html">Voltar para a home</a>
        </p>
    </center>
</body>
</html>