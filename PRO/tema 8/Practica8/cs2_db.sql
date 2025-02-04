-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-02-2025 a las 10:11:39
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
-- Base de datos: `cs2_db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gear`
--

CREATE TABLE `gear` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `type` enum('Armor','Defuse Kit') NOT NULL,
  `price` int(11) NOT NULL,
  `armor_value` int(11) DEFAULT NULL,
  `has_helmet` tinyint(1) DEFAULT NULL,
  `defuse_time` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `gear`
--

INSERT INTO `gear` (`id`, `name`, `type`, `price`, `armor_value`, `has_helmet`, `defuse_time`) VALUES
(1, 'Kevlar Vest', 'Armor', 650, 100, 0, NULL),
(2, 'Kevlar + Helmet', 'Armor', 1000, 100, 1, NULL),
(3, 'Defuse Kit', 'Defuse Kit', 400, NULL, NULL, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grenades`
--

CREATE TABLE `grenades` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `effect` enum('Flashbang','Smoke','HE','Molotov','Incendiary','Decoy') NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `grenades`
--

INSERT INTO `grenades` (`id`, `name`, `effect`, `price`) VALUES
(1, 'Flashbang', 'Flashbang', 200),
(2, 'Smoke Grenade', 'Smoke', 300),
(3, 'HE Grenade', 'HE', 300),
(4, 'Molotov', 'Molotov', 400),
(5, 'Incendiary Grenade', 'Incendiary', 600),
(6, 'Decoy Grenade', 'Decoy', 50);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `weapons`
--

CREATE TABLE `weapons` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `type` enum('Pistol','SMG','Rifle','Sniper','Shotgun','Heavy') NOT NULL,
  `price` int(11) NOT NULL,
  `damage` int(11) NOT NULL,
  `armor_penetration` float NOT NULL,
  `fire_rate` float NOT NULL,
  `magazine_size` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `weapons`
--

INSERT INTO `weapons` (`id`, `name`, `type`, `price`, `damage`, `armor_penetration`, `fire_rate`, `magazine_size`) VALUES
(1, 'Glock-18', 'Pistol', 200, 30, 47, 400, 20),
(2, 'P2000', 'Pistol', 200, 35, 50, 400, 13),
(3, 'USP-S', 'Pistol', 200, 35, 50, 400, 12),
(4, 'Dual Berettas', 'Pistol', 300, 38, 57, 500, 30),
(5, 'P250', 'Pistol', 300, 38, 64, 400, 13),
(6, 'CZ75-Auto', 'Pistol', 500, 31, 77, 600, 12),
(7, 'Five-SeveN', 'Pistol', 500, 32, 91, 400, 20),
(8, 'Tec-9', 'Pistol', 500, 33, 90, 500, 18),
(9, 'Desert Eagle', 'Pistol', 700, 63, 93.2, 266, 7),
(10, 'R8 Revolver', 'Pistol', 600, 86, 93, 150, 8),
(11, 'MAC-10', 'SMG', 1050, 29, 57.5, 800, 30),
(12, 'MP5-SD', 'SMG', 1500, 27, 62, 750, 30),
(13, 'MP7', 'SMG', 1700, 29, 62.5, 750, 30),
(14, 'MP9', 'SMG', 1250, 26, 60, 857, 30),
(15, 'PP-Bizon', 'SMG', 1400, 27, 60.5, 750, 64),
(16, 'P90', 'SMG', 2350, 26, 69, 857, 50),
(17, 'UMP-45', 'SMG', 1200, 35, 65, 666, 25),
(18, 'FAMAS', 'Rifle', 2050, 30, 70, 666, 25),
(19, 'Galil AR', 'Rifle', 1800, 30, 77.5, 666, 35),
(20, 'M4A4', 'Rifle', 3100, 33, 70, 666, 30),
(21, 'M4A1-S', 'Rifle', 2900, 38, 75, 600, 20),
(22, 'AK-47', 'Rifle', 2700, 36, 77.5, 600, 30),
(23, 'SG 553', 'Rifle', 3000, 30, 100, 545, 30),
(24, 'AUG', 'Rifle', 3300, 28, 90, 600, 30),
(25, 'Nova', 'Shotgun', 1050, 234, 50, 68, 8),
(26, 'XM1014', 'Shotgun', 2000, 120, 50, 171, 7),
(27, 'Sawed-Off', 'Shotgun', 1100, 256, 50, 75, 7),
(28, 'MAG-7', 'Shotgun', 1800, 240, 50, 71, 5),
(29, 'M249', 'Heavy', 5200, 32, 80, 750, 100),
(30, 'Negev', 'Heavy', 1700, 35, 81, 1000, 150),
(31, 'AWP', 'Sniper', 4750, 115, 97.5, 41, 5),
(32, 'SSG 08', 'Sniper', 1700, 88, 85, 48, 10),
(33, 'SCAR-20', 'Sniper', 5000, 80, 82.5, 240, 20),
(34, 'G3SG1', 'Sniper', 5000, 80, 82.5, 240, 20);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `gear`
--
ALTER TABLE `gear`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `grenades`
--
ALTER TABLE `grenades`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `weapons`
--
ALTER TABLE `weapons`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `gear`
--
ALTER TABLE `gear`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `grenades`
--
ALTER TABLE `grenades`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `weapons`
--
ALTER TABLE `weapons`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
