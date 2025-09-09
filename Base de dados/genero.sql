-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 09/08/2024 às 21:47
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `megafilmes`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `genero`
--

CREATE TABLE `genero` (
  `id_genero` int(11) NOT NULL,
  `genero_nome` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `genero`
--

INSERT INTO `genero` (`id_genero`, `genero_nome`) VALUES
(1, 'Ação'),
(2, 'Animação'),
(3, 'Aventura'),
(4, 'Biografia'),
(5, 'Chanchada'),
(6, 'Cinema de arte'),
(7, 'Comédia'),
(8, 'Comédia de ação'),
(9, 'Comédia de terror'),
(10, 'Comédia dramática'),
(11, 'Comédia romântica'),
(12, 'Dança'),
(13, 'Docuficção'),
(14, 'Documentário'),
(15, 'Drama'),
(16, 'Erôtico'),
(17, 'Espionagem'),
(18, 'Fantasia'),
(19, 'Fantasia científica'),
(20, 'Faroeste'),
(21, 'Ficção científica'),
(22, 'Filme policial'),
(23, 'Filmes com truques'),
(24, 'Filmes de guerra'),
(25, 'Guerra'),
(26, 'Infantil'),
(27, 'Mistério'),
(28, 'Musical'),
(29, 'Porno'),
(30, 'Religioso'),
(31, 'Romance'),
(32, 'Suspense'),
(33, 'Terror'),
(34, 'Thriller');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `genero`
--
ALTER TABLE `genero`
  ADD PRIMARY KEY (`id_genero`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `genero`
--
ALTER TABLE `genero`
  MODIFY `id_genero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
