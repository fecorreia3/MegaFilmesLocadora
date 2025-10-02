<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="br.com.megafilme.objeto.Filmes" %>
<%@ page import="br.com.megafilme.dao.FilmeDAO" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="sql"  uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<%
    // Recupera lista de filmes da sessão
    List<Filmes> filmesSelecionados = (List<Filmes>) session.getAttribute("filmesSelecionados");

        if (filmesSelecionados == null) {
            filmesSelecionados = new ArrayList<>();
            session.setAttribute("filmesSelecionados", filmesSelecionados);
        }

         // Se veio um parâmetro de filmeId, adiciona o filme à lista

            String filmeIdParam = request.getParameter("filmeId");

                if (filmeIdParam != null) {
                Integer filmeId = Integer.parseInt(filmeIdParam);

                FilmeDAO dao = new FilmeDAO();
                Filmes filme = dao.ListaFilmeID(filmeId);

                if (filme != null && !filmesSelecionados.contains(filme)) {
                       filmesSelecionados.add(filme);
                 }

                }
%>


<html>
<head>
    <title>Lista de Filmes Selecionados</title>
</head>
<body>
    <h2>Filmes Selecionados</h2>

    <ul>
        <% for (Filmes f : filmesSelecionados) { %>
            <li><%= f.getTitulo_filme() %></li>
        <% } %>
    </ul>


    <form action="selecionarFilme.jsp" method="get">
        <button type="submit">Adicionar Filme</button>
    </form>
</body>
</html>