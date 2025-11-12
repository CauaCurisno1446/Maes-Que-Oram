-- MySQL dump 10.13  Distrib 8.0.43, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: maesqueoram
-- ------------------------------------------------------
-- Server version	8.0.43

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `encontro`
--

DROP TABLE IF EXISTS `encontro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `encontro` (
  `id_encontro` int NOT NULL AUTO_INCREMENT,
  `status_encontro` enum('Realizado','Não_realizado','Cancelado') NOT NULL DEFAULT (_utf8mb4'Não_realizado'),
  `data_encontro` date NOT NULL,
  PRIMARY KEY (`id_encontro`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `encontro`
--

LOCK TABLES `encontro` WRITE;
/*!40000 ALTER TABLE `encontro` DISABLE KEYS */;
/*!40000 ALTER TABLE `encontro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `encontro_mae_servico`
--

DROP TABLE IF EXISTS `encontro_mae_servico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `encontro_mae_servico` (
  `id_atividade` int NOT NULL AUTO_INCREMENT,
  `id_encontro` int DEFAULT NULL,
  `id_mae` int DEFAULT NULL,
  `id_servico` int DEFAULT NULL,
  PRIMARY KEY (`id_atividade`),
  KEY `id_encontro` (`id_encontro`),
  KEY `id_mae` (`id_mae`),
  KEY `id_servico` (`id_servico`),
  CONSTRAINT `encontro_mae_servico_ibfk_1` FOREIGN KEY (`id_encontro`) REFERENCES `encontro` (`id_encontro`),
  CONSTRAINT `encontro_mae_servico_ibfk_2` FOREIGN KEY (`id_mae`) REFERENCES `mae` (`id_mae`),
  CONSTRAINT `encontro_mae_servico_ibfk_3` FOREIGN KEY (`id_servico`) REFERENCES `servico` (`id_servico`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `encontro_mae_servico`
--

LOCK TABLES `encontro_mae_servico` WRITE;
/*!40000 ALTER TABLE `encontro_mae_servico` DISABLE KEYS */;
/*!40000 ALTER TABLE `encontro_mae_servico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mae`
--

DROP TABLE IF EXISTS `mae`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mae` (
  `id_mae` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(250) NOT NULL,
  `telefone` varchar(11) NOT NULL,
  `endereco` varchar(500) NOT NULL,
  `dataNascimento` date NOT NULL,
  PRIMARY KEY (`id_mae`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mae`
--

LOCK TABLES `mae` WRITE;
/*!40000 ALTER TABLE `mae` DISABLE KEYS */;
/*!40000 ALTER TABLE `mae` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servico`
--

DROP TABLE IF EXISTS `servico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servico` (
  `id_servico` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(250) NOT NULL,
  PRIMARY KEY (`id_servico`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servico`
--

LOCK TABLES `servico` WRITE;
/*!40000 ALTER TABLE `servico` DISABLE KEYS */;
INSERT INTO `servico` VALUES (1,'Musica'),(2,'Recepcao_de_maes'),(3,'Acolhida'),(4,'Terco'),(5,'Formacao'),(6,'Momento_oracional'),(7,'Proclamacao_da_vitoria'),(8,'Sorteio_das_flores'),(9,'Encerramento'),(10,'Arrumacao_da_capela'),(11,'Queima_dos_pedidos'),(12,'Comprar_flores');
/*!40000 ALTER TABLE `servico` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-11-10 10:51:27
