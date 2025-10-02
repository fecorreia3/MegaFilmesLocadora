<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Filmes - Locadora</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        body {
            background-color: white;
            font-family: 'Arial', sans-serif;
        }
        .form-container {
            max-width: 600px;
            margin: 50px auto;
            padding: 30px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            background-color: #f9f9f9;
        }
        .form-group {
            margin-bottom: 20px;
        }
        .form-group label {
            display: block;
            font-weight: bold;
            margin-bottom: 8px;
            color: #333;
        }
        .form-group input {
            width: 100%;
            padding: 12px;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 16px;
            transition: border-color 0.3s;
        }
        .form-group input:focus {
            border-color: #4CAF50;
            outline: none;
        }
        .submit-btn {
            width: 100%;
            padding: 12px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        .submit-btn:hover {
            background-color: #45a049;
        }
        .title {
            text-align: center;
            color: #333;
            margin-bottom: 30px;
            font-size: 28px;
            font-weight: bold;
        }
    </style>
</head>
<body class="bg-white">
    <div class="form-container">
        <h1 class="title">Cadastro de Filmes</h1>
        <form id="filmeForm">
            <div class="form-group">
                <label for="id_filme">ID do Filme:</label>
                <input type="text" id="id_filme" name="id_filme" required placeholder="Digite o ID único do filme">
            </div>
            <div class="form-group">
                <label for="titulo_filme">Título do Filme:</label>
                <input type="text" id="titulo_filme" name="titulo_filme" required placeholder="Digite o título do filme">
            </div>
            <div class="form-group">
                <label for="genero_filme">Gênero do Filme:</label>
                <input type="text" id="genero_filme" name="genero_filme" required placeholder="Ex: Ação, Comédia, Drama">
            </div>
            <div class="form-group">
                <label for="dt_compra_filme">Data de Compra:</label>
                <input type="date" id="dt_compra_filme" name="dt_compra_filme" required>
            </div>
            <div class="form-group">
                <label for="tipo_filme">Tipo do Filme:</label>
                <input type="text" id="tipo_filme" name="tipo_filme" required placeholder="Ex: DVD, Blu-ray, Streaming">
            </div>
            <button type="submit" class="submit-btn">Cadastrar Filme</button>
        </form>
    </div>

    <script>
        document.getElementById('filmeForm').addEventListener('submit', function(event) {
            event.preventDefault();

            const formData = new FormData(this);
            let isValid = true;

            // Simple validation
            formData.forEach((value, key) => {
                if (!value.trim()) {
                    isValid = false;
                    alert(`Por favor, preencha o campo ${key}.`);
                    return;
                }
            });

            if (isValid) {
                // Here you would typically send data to server, but for demo, just alert
                alert('Filme cadastrado com sucesso!');
                // Reset form
                this.reset();
            }
        });
    </script>
</body>
</html>
</content>
</create_file>
