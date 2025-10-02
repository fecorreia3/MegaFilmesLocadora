<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Cliente - Locadora de Vídeo</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
    <style>
        @keyframes filmStrip {
            0% { background-position: 0 0; }
            100% { background-position: 200px 0; }
        }
        .film-strip-bg {
            background-image: repeating-linear-gradient(90deg, #000 0px, #000 10px, transparent 10px, transparent 50px);
            animation: filmStrip 5s linear infinite;
        }

        .form-card {
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
            background: rgba(255, 255, 255, 0.9);
            border-radius: 15px;
        }
        .input-focus:focus {
            border-color: #f5576c;
            box-shadow: 0 0 10px rgba(245, 87, 108, 0.5);
        }
        .hero-img {
            border-radius: 10px 10px 0 0;
            height: 200px;
            object-fit: cover;
        }
    </style>
</head>

<body class="min-h-screen flex items-center justify-center p-4">
<div class="max-w-2xl w-full">

    <div class="hero-image mb-8">
        <img src="https://storage.googleapis.com/workspace-0f70711f-8b4e-4d94-86f1-2a93ccde5887/image/a57eaa2a-2342-40c9-9f06-2afb75f7db31.png" alt="Vintage video rental store facade with neon sign saying 'Locadora de Vídeo Clássica', shelves filled with VHS tapes and posters of classic movies like Casablanca and The Godfather, softly lit with warm incandescent bulbs, photorealistic style with film grain texture" class="hero-img w-full" />
    </div>

    <div class="form-card p-8">


            <h1 class="text-3xl font-bold text-center text-gray-800 mb-6 flex items-center justify-center gap-2">
                <i class="fas fa-film text-purple-500"></i>
                Cadastro de Cliente - Locadora de Vídeo
            </h1>

    <form id="registration-form" class="grid grid-cols-1 md:grid-cols-2 gap-4" action="salvarCliente" method="post">


            <div class="md:col-span-2">
                <label for="nome" class="block text-sm font-medium text-gray-700 mb-1">Nome</label>
                <input type="text" id="nome" name="nome" class="input-focus w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-300" required placeholder="Nome completo">
            </div>

        <div class="md:col-span-2">
                        <label for="endereco" class="block text-sm font-medium text-gray-700 mb-1">Endereço</label>
                        <input type="text" id="endereco" name="endereco" class="input-focus w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-300" required placeholder="Rua, Número">
                    </div>
                    <div>
                        <label for="cep" class="block text-sm font-medium text-gray-700 mb-1">CEP</label>
                        <input type="text" id="cep" name="cep" class="input-focus w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-300" required placeholder="XXXXX-XXX">
                    </div>
                    <div>
                        <label for="bairro" class="block text-sm font-medium text-gray-700 mb-1">Bairro</label>
                        <input type="text" id="bairro" name="bairro" class="input-focus w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-300" required placeholder="Nome do bairro">
                    </div>
                    <div>
                        <label for="cidade" class="block text-sm font-medium text-gray-700 mb-1">Cidade</label>
                        <input type="text" id="cidade" name="cidade" class="input-focus w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-300" required placeholder="Nome da cidade">
                    </div>
                    <div>
                        <label for="estado" class="block text-sm font-medium text-gray-700 mb-1">Estado</label>
                        <input type="text" id="estado" name="estado" class="input-focus w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-300" required placeholder="Nome do estado">
                    </div>

        <div>
                        <label for="uf" class="block text-sm font-medium text-gray-700 mb-1">UF</label>
                        <select id="uf" name="uf" class="input-focus w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-300" required>
                            <option value="">Selecione</option>
                            <option value="AC">AC</option>
                            <option value="AL">AL</option>
                            <option value="AP">AP</option>
                            <option value="AM">AM</option>
                            <option value="BA">BA</option>
                            <option value="CE">CE</option>
                            <option value="DF">DF</option>
                            <option value="ES">ES</option>
                            <option value="GO">GO</option>
                            <option value="MA">MA</option>
                            <option value="MS">MS</option>
                            <option value="MT">MT</option>
                            <option value="MG">MG</option>
                            <option value="PA">PA</option>
                            <option value="PB">PB</option>
                            <option value="PR">PR</option>
                            <option value="PE">PE</option>
                            <option value="PI">PI</option>
                            <option value="RJ">RJ</option>
                            <option value="RN">RN</option>
                            <option value="RS">RS</option>
                            <option value="RO">RO</option>
                            <option value="RR">RR</option>
                            <option value="SC">SC</option>
                            <option value="SP">SP</option>
                            <option value="SE">SE</option>
                            <option value="TO">TO</option>
                        </select>
                    </div>

            <div>
                <label for="telefone" class="block text-sm font-medium text-gray-700 mb-1">Telefone</label>
                <input type="tel" id="telefone" name="telefone" class="input-focus w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-300" required placeholder="(XX) XXXXX-XXXX">
            </div>
            <div>
                <label for="data_nascimento" class="block text-sm font-medium text-gray-700 mb-1">Data de Nascimento</label>
                <input type="date" id="data_nascimento" name="data_nascimento" class="input-focus w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-300" required>
            </div>
            <div>
                <label for="cpf" class="block text-sm font-medium text-gray-700 mb-1">CPF</label>
                <input type="text" id="cpf" name="cpf" class="input-focus w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-300" required placeholder="XXX.XXX.XXX-XX">
            </div>
            <div class="md:col-span-2">
                <label for="email" class="block text-sm font-medium text-gray-700 mb-1">Email</label>
                <input type="email" id="email" name="email" class="input-focus w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-300" required placeholder="exemplo@email.com">
            </div>

        <div class="md:col-span-2 text-center mt-6">
            <input type="submit" value="Cadastrar" class="bg-gradient-to-r from-purple-500 to-pink-500 text-white px-8 py-3 rounded-full font-semibold hover:from-purple-600 hover:to-pink-600 transition duration-300 shadow-lg"/>
        </div>
    </form>

    </div>
<p class="text-center text-gray-600 mt-4 text-sm">Locadora de Vídeo Clássica - Todos os direitos reservados.</p>
</div>

    <script>
            // Formata telefone no padrão (xx)xxxxx-xxxx enquanto digita
            const telefoneInput = document.getElementById('telefone');
            telefoneInput.addEventListener('input', function(e) {
                let value = e.target.value;

                // Remove tudo que não for número
                value = value.replace(/\D/g, '');

                // Limita a 11 dígitos (2 para DDD + 9 para número)
                if (value.length > 11) {
                    value = value.slice(0, 11);
                }

                // Formata conforme o tamanho
                if (value.length > 6) {
                    // (xx)xxxxx-xxxx
                    value = value.replace(/^(\d{2})(\d{5})(\d{0,4}).*/, '($1)$2-$3');
                } else if (value.length > 2) {
                    // (xx)xxxxx
                    value = value.replace(/^(\d{2})(\d{0,5})/, '($1)$2');
                } else if (value.length > 0) {
                    // (xx
                    value = value.replace(/^(\d{0,2})/, '($1');
                }

                e.target.value = value;
            });

                    // Formata CPF no padrão xxx.xxx.xxx-xx enquanto digita
                            const cpfInput = document.getElementById('cpf');
                            cpfInput.addEventListener('input', function(e) {
                                let value = e.target.value;

                                // Remove tudo que não for número
                                value = value.replace(/\D/g, '');

                                // Limita a 11 dígitos
                                if (value.length > 11) {
                                    value = value.slice(0, 11);
                                }

                                // Formata CPF: xxx.xxx.xxx-xx
                                if (value.length > 9) {
                                    value = value.replace(/^(\d{3})(\d{3})(\d{3})(\d{0,2}).*/, '$1.$2.$3-$4');
                                } else if (value.length > 6) {
                                    value = value.replace(/^(\d{3})(\d{3})(\d{0,3}).*/, '$1.$2.$3');
                                } else if (value.length > 3) {
                                    value = value.replace(/^(\d{3})(\d{0,3}).*/, '$1.$2');
                                }
                                e.target.value = value;
                            });

        //Formata o CEP no padrão xxxxx-xxx
            const cepInput = document.getElementById('cep');
            cepInput.addEventListener('input', function(e){
                let value = e.target.value;

                // Remove tudo que não for número
                value = value.replace(/\D/g, '');

                // Limita a 9 dígitos
                if (value.length > 9) {
                value = value.slice(0, 9);
                }

                // Formata Cep: xxxxx-xxx
                if(value.length >5){
                    //xxxxx-
                    value = value.replace(/^(\d{5})(\d{1,3})/, '$1-$2');
                }

                e.target.value = value;

            });

    </script>

</body>
</html>