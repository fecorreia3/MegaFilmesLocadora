<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="br.com.megafilme.objeto.Filmes" %>
<%
    Filmes filme = (Filmes) request.getAttribute("strFilme");
    String erro = (String) request.getAttribute("erro");
%>


<html>
<head>
    <title>Pesquisa de Filme</title>

    <script>
        const form = document.getElementById('buscafilmeform');
        form.addEventListener('submit', function(event) {
            const id = document.getElementById('id').value.trim();
            if (id) {
                form.action = '/buscarFilme?id=' + encodeURIComponent(id);
            } else {
                event.preventDefault();
                alert('Informe o ID');
            }
        });
    </script>

</head>

<body>
<h2>Pesquisa de Filme</h2>

<form method="post" id="buscafilmeform">

    <label for="id">ID:</label>

    <input type="text" id="id" name="id" value="<%= (filme != null && filme.getId_filme() != null) ? filme.getId_filme() : "" %>" />
    <button type="submit">Buscar</button>
    <br/><br/>

    <label for="nome">Nome:</label>
    <input type="text" id="nome" name="nome" readonly value="<%= (filme != null) ? filme.getTitulo_filme() : "" %>" />
    <br/><br/>

    <label for="tipo">Tipo:</label>
    <input type="text" id="tipo" name="tipo" readonly value="<%= (filme != null) ? filme.getTipo_filme() : "" %>" />
    <br/><br/>

    <label for="valor">Genero:</label>
    <input type="text" id="valor" name="valor" readonly value="<%= (filme != null) ? filme.getGenero_filme() : "" %>" />
</form>

<% if (erro != null) { %>
    <p style="color:red;"><%= erro %></p>
<% } %>

</body>
</html>