-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: booking_app
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `property`
--

DROP TABLE IF EXISTS `property`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `property` (
  `PropertyId` int NOT NULL AUTO_INCREMENT,
  `AirportTransfer` bit(1) NOT NULL,
  `Availability` bit(1) NOT NULL,
  `Balcony` varchar(255) DEFAULT NULL,
  `Bar` bit(1) NOT NULL,
  `Bathroom` varchar(255) DEFAULT NULL,
  `Bedroom` varchar(255) DEFAULT NULL,
  `ChildFriendly` bit(1) NOT NULL,
  `City` varchar(255) DEFAULT NULL,
  `Country` varchar(255) DEFAULT NULL,
  `County` varchar(255) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `Dimension` double NOT NULL,
  `GuestNumber` int NOT NULL,
  `Kitchen` varchar(255) DEFAULT NULL,
  `LivingRoom` varchar(255) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Parking` bit(1) NOT NULL,
  `PetFriendly` bit(1) NOT NULL,
  `Picture` varchar(255) DEFAULT NULL,
  `Price` double NOT NULL,
  `Rating` int NOT NULL,
  `Sauna` bit(1) NOT NULL,
  `Smoking` bit(1) NOT NULL,
  `Spa` bit(1) NOT NULL,
  `Terrace` varchar(255) DEFAULT NULL,
  `Type` varchar(255) DEFAULT NULL,
  `Wifi` bit(1) NOT NULL,
  PRIMARY KEY (`PropertyId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `property`
--

LOCK TABLES `property` WRITE;
/*!40000 ALTER TABLE `property` DISABLE KEYS */;
INSERT INTO `property` VALUES (1,_binary '\0',_binary '','small balcony',_binary '\0','bathroom','bedroom',_binary '','Bucuresti','Hungary','BV','propertyDescription',120,8,NULL,'living room','Budapest-house',_binary '',_binary '','propertyPicture',231,3,_binary '',_binary '\0',_binary '','terrace','Apartman',_binary '');
/*!40000 ALTER TABLE `property` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `property_reviews`
--

DROP TABLE IF EXISTS `property_reviews`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `property_reviews` (
  `PropertyId` int NOT NULL,
  `ReviewId` int NOT NULL,
  PRIMARY KEY (`PropertyId`,`ReviewId`),
  KEY `ReviewId_idx` (`ReviewId`),
  CONSTRAINT `PropertyId` FOREIGN KEY (`PropertyId`) REFERENCES `property` (`PropertyId`),
  CONSTRAINT `ReviewId` FOREIGN KEY (`ReviewId`) REFERENCES `review` (`ReviewId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `property_reviews`
--

LOCK TABLES `property_reviews` WRITE;
/*!40000 ALTER TABLE `property_reviews` DISABLE KEYS */;
/*!40000 ALTER TABLE `property_reviews` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `review` (
  `ReviewId` int NOT NULL AUTO_INCREMENT,
  `Country` varchar(255) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `Icon` varchar(255) DEFAULT NULL,
  `Username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ReviewId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
INSERT INTO `review` VALUES (1,'Hungary','nice',':)','Ana'),(2,'Hungary','nice',':)','Ana');
/*!40000 ALTER TABLE `review` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-23 23:44:26
