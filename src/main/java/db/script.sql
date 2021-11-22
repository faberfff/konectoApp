CREATE DATABASE IF NOT EXISTS `employes`;
USE `employes`;

CREATE TABLE IF NOT EXISTS `empleado` (
  `ID_empleado` INT(20) NOT NULL AUTO_INCREMENT,
  `fecha_Ingreso` datetime NOT NULL,
  `nombre` VARCHAR(50) COLLATE latin1_spanish_ci NOT NULL,
  `salario` INT NOT NULL,
  PRIMARY KEY (`ID_empleado`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1 COLLATE=LATIN1_SPANISH_CI;


CREATE TABLE IF NOT EXISTS `solicitud` (
  `ID_solicitud` INT(20) NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(50)  COLLATE latin1_spanish_ci NOT NULL,
  `descripcion` VARCHAR(50)  COLLATE latin1_spanish_ci NOT NULL,
  `resumen` VARCHAR(50)  COLLATE latin1_spanish_ci NOT NULL,
  `ID_empleado` int NOT NULL,
  PRIMARY KEY (`ID_solicitud`),
  KEY `fk_id_empleado` (`ID_empleado`),
  CONSTRAINT `fk_id_empleado` FOREIGN KEY (`ID_empleado`) REFERENCES `empleado` (`ID_empleado`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
