-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-10-2024 a las 11:01:53
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
-- Base de datos: `academia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `codAlumno` int(8) NOT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  `apellido` varchar(15) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `poblacion` varchar(15) DEFAULT NULL,
  `codPostal` varchar(5) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `curso` varchar(10) DEFAULT NULL,
  `nota1Cuatrim` decimal(4,2) DEFAULT NULL,
  `nota1Cuatrin` decimal(4,2) DEFAULT NULL,
  `notaFinal` decimal(4,2) DEFAULT NULL,
  `codProfesor` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesores`
--

CREATE TABLE `profesores` (
  `codProfesor` int(5) NOT NULL,
  `nomber` varchar(15) DEFAULT NULL,
  `apellido` varchar(15) DEFAULT NULL,
  `dni` varchar(10) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `poblacion` varchar(10) DEFAULT NULL,
  `codPostal` varchar(5) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL COMMENT '\r\n',
  `asignatura` varchar(10) DEFAULT NULL,
  `departamiento` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`codAlumno`),
  ADD KEY `codProfesor` (`codProfesor`);

--
-- Indices de la tabla `profesores`
--
ALTER TABLE `profesores`
  ADD PRIMARY KEY (`codProfesor`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD CONSTRAINT `alumnos_ibfk_1` FOREIGN KEY (`codProfesor`) REFERENCES `profesores` (`codProfesor`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
