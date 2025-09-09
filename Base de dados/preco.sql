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
-- Estrutura para tabela `preco`
--

CREATE TABLE `preco` (
  `id_preco` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `valor` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `preco`
--

INSERT INTO `preco` (`id_preco`, `nome`, `valor`) VALUES
(1, 'ouro', 2.36),
(2, 'prata', 2.36),
(3, 'purpura', 2.36),
(4, 'platina', 2.36),
(5, 'lançamento', 2.36),
(6, 'adulto', 2.36),
(7, 'especial', 2.36);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `preco`
--
ALTER TABLE `preco`
  ADD PRIMARY KEY (`id_preco`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
