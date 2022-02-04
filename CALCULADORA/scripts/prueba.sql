-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-02-2022 a las 22:17:47
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `prueba`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aplicaciones`
--

CREATE TABLE `aplicaciones` (
  `aplcodigo` varchar(5) NOT NULL,
  `aplnombre` varchar(60) NOT NULL,
  `aplestado` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bitacora`
--

CREATE TABLE `bitacora` (
  `bitcodigo` int(11) NOT NULL,
  `bitfecha` datetime DEFAULT NULL,
  `bitaccion` varchar(10) NOT NULL,
  `usucodigo` varchar(15) NOT NULL,
  `aplcodigo` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfil`
--

CREATE TABLE `perfil` (
  `IDperfil` varchar(15) NOT NULL,
  `Nombre_Perfil` varchar(30) NOT NULL,
  `Estatus_Perfil` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfilusuario`
--

CREATE TABLE `perfilusuario` (
  `IDperfil` varchar(15) NOT NULL,
  `CodigoUsuario` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `usucodigo` varchar(15) NOT NULL,
  `usunombre` varchar(60) NOT NULL,
  `usudireccion` varchar(60) NOT NULL,
  `usutelefono` varchar(30) NOT NULL,
  `usucorreo` varchar(60) NOT NULL,
  `usucontra` varchar(100) NOT NULL,
  `usuestado` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aplicaciones`
--
ALTER TABLE `aplicaciones`
  ADD PRIMARY KEY (`aplcodigo`);

--
-- Indices de la tabla `bitacora`
--
ALTER TABLE `bitacora`
  ADD PRIMARY KEY (`bitcodigo`),
  ADD KEY `usucodigo` (`usucodigo`),
  ADD KEY `aplcodigo` (`aplcodigo`);

--
-- Indices de la tabla `perfil`
--
ALTER TABLE `perfil`
  ADD KEY `IDperfil` (`IDperfil`);

--
-- Indices de la tabla `perfilusuario`
--
ALTER TABLE `perfilusuario`
  ADD PRIMARY KEY (`IDperfil`),
  ADD KEY `CodigoUsuario` (`CodigoUsuario`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`usucodigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bitacora`
--
ALTER TABLE `bitacora`
  MODIFY `bitcodigo` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bitacora`
--
ALTER TABLE `bitacora`
  ADD CONSTRAINT `bitacora_ibfk_1` FOREIGN KEY (`usucodigo`) REFERENCES `usuario` (`usucodigo`),
  ADD CONSTRAINT `bitacora_ibfk_2` FOREIGN KEY (`aplcodigo`) REFERENCES `aplicaciones` (`aplcodigo`);

--
-- Filtros para la tabla `perfil`
--
ALTER TABLE `perfil`
  ADD CONSTRAINT `perfil_ibfk_1` FOREIGN KEY (`IDperfil`) REFERENCES `perfilusuario` (`IDperfil`);

--
-- Filtros para la tabla `perfilusuario`
--
ALTER TABLE `perfilusuario`
  ADD CONSTRAINT `perfilusuario_ibfk_1` FOREIGN KEY (`CodigoUsuario`) REFERENCES `usuario` (`usucodigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
