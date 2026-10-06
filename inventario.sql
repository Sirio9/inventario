-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-11-2022 a las 15:24:48
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `control`
--

CREATE TABLE `control` (
  `id` int(11) NOT NULL,
  `codigo` int(100) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `serial` varchar(45) NOT NULL,
  `ubicacion` varchar(45) NOT NULL,
  `movilizacion` varchar(45) NOT NULL,
  `referencia` varchar(45) NOT NULL,
  `condiciones` varchar(45) NOT NULL,
  `dep_responsable` varchar(45) NOT NULL,
  `acta` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `control`
--

INSERT INTO `control` (`id`, `codigo`, `descripcion`, `serial`, `ubicacion`, `movilizacion`, `referencia`, `condiciones`, `dep_responsable`, `acta`) VALUES
(1, 44444, 'dsd', 'sdsd', 'sdsd', 'sds', 'Desincorporado', 'sds', 'sds', 'sds'),
(2, 444440, 'mouseGTS', '55tyr', 'hardware', 'sss', 'ss', 'Optimo', 'dfdf', 'ooo'),
(3, 58855, 'wewsd', 'sdsds', 'direccion', 'sdsd', 'sdsd', 'Evaluación', 'direccion', 'qqq'),
(4, 3434, 'yyyy', 'yy45', 'direccion', 'yyy', 'yyy', 'Optimo', 'yyy', 'yyy'),
(5, 33, 'ss', 'ss23', 'deposito', 'ss', 'ss', 'Desincorporado', 'ss', 'ss'),
(6, 66, 'df', 'dd', 'dd', 'dd', 'dd', 'Desincorporado', 'dd', 'dd'),
(7, 444, 'cornetas', 'gt56d', 'deposito', 'hardware', 'ppp', 'Optimo', 'hardware', 'jjj'),
(8, 8888, 'computador siragon', 'tjh65l', 'hardware', 'servidores', 'wwww', 'Evaluación', 'servidores', 'supervicion'),
(9, 777, 'teclado', 'wwqa323', 'despacho', 'deposito', 'despacho', 'Optimo', 'deposito', 'ooo'),
(10, 222, 'monitor', 'qw32sx', 'hardware', 'deposito', 'eee', 'Dañado', 'deposito', 'qqq'),
(11, 2222, 'disco duro k', 'opi42ds', 'deposito', 'despacho', 'ttttt', 'Dañado', 'despacho', 'bbb'),
(12, 66454, 'teclado', 'wwqa323', 'servidores', 'deposito', 'telematica', 'Dañado', 'deposito', 'ooo'),
(13, 222, 'SDS', 'SDS', 'SDS', 'SD', 'SDS', 'Optimo', 'SD', 'SD'),
(14, 33, 'ss', 'ss23', 'deposito', 'ss', 'ss', 'Evaluación', 'ss', 'ss'),
(15, 1111, 'rrr', 'a', 'a', 'a', 'Evaluación', 'Dañado', 'a', 'a');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `control`
--
ALTER TABLE `control`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `control`
--
ALTER TABLE `control`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
