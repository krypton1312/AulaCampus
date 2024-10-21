-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-10-2024 a las 12:43:54
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.2.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `musica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cancantesgrupos`
--

CREATE TABLE `cancantesgrupos` (
  `codCantanteGrupo` int(10) NOT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  `apellidos` varchar(20) DEFAULT NULL,
  `poblcacion` varchar(15) DEFAULT NULL,
  `premiosRecibidos` varchar(20) DEFAULT NULL,
  `discoVendidos` int(10) DEFAULT NULL,
  `internacional` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `canciones`
--

CREATE TABLE `canciones` (
  `codCancion` int(10) NOT NULL,
  `titulo` varchar(15) DEFAULT NULL,
  `estilo` varchar(15) DEFAULT NULL,
  `duracion` varchar(5) DEFAULT NULL,
  `codCantanteGrupo` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cancantesgrupos`
--
ALTER TABLE `cancantesgrupos`
  ADD PRIMARY KEY (`codCantanteGrupo`);

--
-- Indices de la tabla `canciones`
--
ALTER TABLE `canciones`
  ADD PRIMARY KEY (`codCancion`),
  ADD KEY `codCantanteGrupo` (`codCantanteGrupo`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `canciones`
--
ALTER TABLE `canciones`
  ADD CONSTRAINT `canciones_ibfk_1` FOREIGN KEY (`codCantanteGrupo`) REFERENCES `cancantesgrupos` (`codCantanteGrupo`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
