<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="sql"  uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
    <title>Lista Filmes</title>
</head>
<body>

    <h2>Lista de Filmes</h2>

    <table border="1">
        <tr>
            <th>ID</th>
            <th>Titulo</th>
            <th>Genero</th>
            <th>Data da Compra</th>
            <th>Tipo</th>
        </tr>

        <c:forEach var="filme" items="${Filmes}">
            <tr>
            <td><c:out value="${filme.id_filme}"/></td>
            <td><c:out value="${filme.titulo_filme}" /></td>
            <td><c:out value="${filme.genero_filme}" /></td>
            <td><c:out value="${filme.dt_compra_filme}" /></td>
            <td><c:out value="${filme.tipo_filme}" /></td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>