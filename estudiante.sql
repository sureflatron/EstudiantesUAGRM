-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-07-2019 a las 20:13:58
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `uagrm`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE IF NOT EXISTS `estudiante` (
`id` int(100) NOT NULL COMMENT 'KEY ',
  `Carrera` varchar(100) DEFAULT NULL,
  `Registro` int(50) DEFAULT NULL UNIQUE,
  `Nombres` varchar(100) DEFAULT NULL,
  `Ci` varchar(100) DEFAULT NULL,
  `nacimiento` varchar(100) DEFAULT NULL,
  `Sexo` varchar(11) DEFAULT NULL,
  `Estado_civil` varchar(11) DEFAULT NULL,
  `PaísN` varchar(150) DEFAULT NULL,
  `DptoN` varchar(150) DEFAULT NULL,
  `ProvinciaN` varchar(150) DEFAULT NULL,
  `País` varchar(150) DEFAULT NULL,
  `sangre` varchar(100) DEFAULT NULL,
  `seguro` varchar(100) DEFAULT NULL,
  `Dirección` varchar(200) DEFAULT NULL,
  `Teléfono` varchar(100) DEFAULT NULL,
  `celular` int(50) DEFAULT NULL,
  `Casilla` varchar(100) DEFAULT NULL,
  `mail` varchar(150) DEFAULT NULL,
  `NroTitulo` int(100) DEFAULT NULL,
  `YearTitulo` int(100) DEFAULT NULL,
  `emisionTitulo` varchar(150) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=18102 DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estudiante`
--
ALTER TABLE `estudiante`
MODIFY `id` int(100) NOT NULL AUTO_INCREMENT COMMENT 'KEY ',AUTO_INCREMENT=1;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
