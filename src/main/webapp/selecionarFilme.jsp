<%@ page import="java.util.List" %>
<%@ page import="br.com.megafilme.objeto.Filmes" %>
<%@ page import="br.com.megafilme.dao.FilmeDAO" %>
<%
    FilmeDAO dao = new FilmeDAO();
    List<Filmes> filmes = dao.ListaFilmes();
%>

<html>
<head>
    <title>Selecionar Filme</title>
</head>
<body>
    <h2>Selecione um Filme</h2>
    <ul>
        <% for (Filmes f : filmes) { %>
            <li>
                <a href="aluga.jsp?filmeId=<%= f.getId_filme() %>"><%= f.getTitulo_filme() %></a>
            </li>
        <% } %>
    </ul>
    <a href="aluga.jsp">Voltar</a>
</body>
</html>