<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.sql.*" %> <!-- Include if using database, but for simplicity, using static list -->
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Locadora de Vídeos</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        body {
            background-color: white;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
        }
        .header-section {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
            margin-bottom: 30px;
        }
        .movie-table {
            width: 100%;
            border-collapse: collapse;
            background: #f9f9f9;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }
        .movie-table th, .movie-table td {
            padding: 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        .movie-table th {
            background: #333;
            color: white;
            font-weight: bold;
        }
        .total-row {
            background: #e5e5e5;
            font-weight: bold;
        }
        input[type="text"], input[type="date"] {
            border: 2px solid #ddd;
            padding: 10px;
            border-radius: 5px;
            margin-top: 5px;
            width: 100%;
            box-sizing: border-box;
        }
    </style>
</head>
<body class="bg-white">
    <div class="container">
        <h1 class="text-4xl font-bold text-center mb-8 text-gray-800">Locadora de Vídeos</h1>

        <div class="header-section">
            <h2 class="text-2xl mb-6">Informações do Cliente e Aluguel</h2>
            <form action="#" method="post">
                <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
                    <div>
                        <label for="nome" class="block text-sm font-medium">Nome do Cliente</label>
                        <input type="text" id="nome" name="nome" value="<%= request.getParameter("nome") != null ? request.getParameter("nome") : "" %>" placeholder="Digite o nome do cliente" required>
                    </div>
                    <div>
                        <label for="id" class="block text-sm font-medium">ID do Cliente</label>
                        <input type="text" id="id" name="id" value="<%= request.getParameter("id") != null ? request.getParameter("id") : "" %>" placeholder="Digite o ID do cliente" required>
                    </div>
                    <div>
                        <label for="retirada" class="block text-sm font-medium">Data de Retirada</label>
                        <input type="date" id="retirada" name="retirada" value="<%= request.getParameter("retirada") != null ? request.getParameter("retirada") : "" %>" required>
                    </div>
                    <div>
                        <label for="devolucao" class="block text-sm font-medium">Data de Devolução</label>
                        <input type="date" id="devolucao" name="devolucao" value="<%= request.getParameter("devolucao") != null ? request.getParameter("devolucao") : "" %>" required>
                    </div>
                </div>
                <button type="submit" class="mt-6 bg-white text-blue-600 py-2 px-4 rounded hover:bg-gray-100">Salvar Informações</button>
            </form>
        </div>

        <h2 class="text-3xl font-semibold mb-6 text-gray-700">Lista de Filmes Alugados</h2>
        <table class="movie-table">
            <thead>
                <tr>
                    <th>Nome do Filme</th>
                    <th>Quantidade</th>
                    <th>Tipo</th>
                    <th>Valor Unitário (R$)</th>
                    <th>Total (R$)</th>
                </tr>
            </thead>
            <tbody id="movie-table-body">
                <%
                    // Simular lista de filmes (em produção, buscar do banco)
                    class Filme {
                        String nome, tipo;
                        int quantidade;
                        double valor;
                        Filme(String nome, int quantidade, String tipo, double valor) {
                            this.nome = nome;
                            this.quantidade = quantidade;
                            this.tipo = tipo;
                            this.valor = valor;
                        }
                        double getTotal() {
                            return quantidade * valor;
                        }
                    }
                    List<Filme> filmes = new ArrayList<>();
                    filmes.add(new Filme("A Origem", 1, "Ficção Científica", 5.00));
                    filmes.add(new Filme("O Senhor dos Anéis", 2, "Fantasia", 4.50));
                    filmes.add(new Filme("Pulp Fiction", 1, "Policial", 6.00));
                    double grandTotal = 0;
                    for (Filme f : filmes) {
                        grandTotal += f.getTotal();
                %>
                <tr>
                    <td><%= f.nome %></td>
                    <td><%= f.quantidade %></td>
                    <td><%= f.tipo %></td>
                    <td><%= String.format("%.2f", f.valor) %></td>
                    <td><%= String.format("%.2f", f.getTotal()) %></td>
                </tr>
                <%
                    }
                %>
            </tbody>
            <tfoot>
                <tr class="total-row">
                    <td colspan="4">Total Geral</td>
                    <td><%= String.format("%.2f", grandTotal) %></td>
                </tr>
            </tfoot>
        </table>
    </div>

    <script>
        // JavaScript para validação ou interativas básicas
        function validateForm() {
            // Exemplo: validar datas
            const retirada = new Date(document.getElementById('retirada').value);
            const devolucao = new Date(document.getElementById('devolucao').value);
            if (retirada > devolucao) {
                alert("Data de retirada deve ser antes da data de devolução.");
                return false;
            }
            return true;
        }
        // Anexar ao form se quiser
    </script>
</body>
</html>
</content>
</create_file>