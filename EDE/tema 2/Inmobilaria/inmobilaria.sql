-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-10-2024 a las 13:20:12
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
-- Base de datos: `inmobilaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `codigoCliente` varchar(10) NOT NULL,
  `nombre` varchar(10) DEFAULT NULL,
  `apellidos` varchar(15) DEFAULT NULL,
  `dni` varchar(10) DEFAULT NULL,
  `direccion` varchar(15) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `poblacion` varchar(15) DEFAULT NULL,
  `codigoPostal` varchar(5) DEFAULT NULL,
  `fechaNacim` date DEFAULT NULL,
  `profesion` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contratos`
--

CREATE TABLE `contratos` (
  `codigoContrato` int(10) NOT NULL,
  `fechaAltaContrato` date DEFAULT NULL,
  `comision` decimal(15,2) DEFAULT NULL,
  `fechaVenta` date DEFAULT NULL,
  `codigoVivienda` int(10) NOT NULL,
  `codigoCliente` varchar(10) NOT NULL,
  `codigoTitular` int(10) NOT NULL,
  `codigoEmpleado` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `codigoEmpleado` int(10) NOT NULL,
  `nombre` varchar(10) DEFAULT NULL,
  `precio` decimal(20,2) DEFAULT NULL,
  `dni` varchar(10) DEFAULT NULL,
  `direccion` varchar(15) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `poblacion` varchar(15) DEFAULT NULL,
  `fechaNacim` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `titulares`
--

CREATE TABLE `titulares` (
  `codigoTitular` int(10) NOT NULL,
  `nombre` varchar(10) DEFAULT NULL,
  `precio` decimal(20,2) DEFAULT NULL,
  `dni` varchar(10) DEFAULT NULL,
  `direcion` varchar(15) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `poblacion` varchar(15) DEFAULT NULL,
  `codigoPostal` varchar(5) DEFAULT NULL,
  `fechaNacim` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `viviendas`
--

CREATE TABLE `viviendas` (
  `codigoVivienda` int(10) NOT NULL,
  `tipo` varchar(15) DEFAULT NULL,
  `direccion` varchar(15) DEFAULT NULL,
  `poblacion` varchar(15) DEFAULT NULL,
  `habitaciones` int(10) DEFAULT NULL,
  `banos` int(5) DEFAULT NULL,
  `altura` decimal(3,2) DEFAULT NULL,
  `exterior` tinyint(1) DEFAULT NULL,
  `balcon` tinyint(1) DEFAULT NULL,
  `garaje` tinyint(1) DEFAULT NULL,
  `precio` decimal(20,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`codigoCliente`);

--
-- Indices de la tabla `contratos`
--
ALTER TABLE `contratos`
  ADD PRIMARY KEY (`codigoContrato`),
  ADD KEY `codigoCliente` (`codigoCliente`),
  ADD KEY `codigoEmpleado` (`codigoEmpleado`),
  ADD KEY `codigoTitular` (`codigoTitular`),
  ADD KEY `codigoVivienda` (`codigoVivienda`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`codigoEmpleado`);

--
-- Indices de la tabla `titulares`
--
ALTER TABLE `titulares`
  ADD PRIMARY KEY (`codigoTitular`);

--
-- Indices de la tabla `viviendas`
--
ALTER TABLE `viviendas`
  ADD PRIMARY KEY (`codigoVivienda`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `contratos`
--
ALTER TABLE `contratos`
  ADD CONSTRAINT `contratos_ibfk_1` FOREIGN KEY (`codigoCliente`) REFERENCES `clientes` (`codigoCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `contratos_ibfk_2` FOREIGN KEY (`codigoEmpleado`) REFERENCES `empleados` (`codigoEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `contratos_ibfk_3` FOREIGN KEY (`codigoTitular`) REFERENCES `titulares` (`codigoTitular`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `contratos_ibfk_4` FOREIGN KEY (`codigoVivienda`) REFERENCES `viviendas` (`codigoVivienda`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
