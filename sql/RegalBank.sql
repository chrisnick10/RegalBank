-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: regalbank
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accountinfo`
--

DROP TABLE IF EXISTS `accountinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `accountinfo` (
  `A_AccountID` int(11) NOT NULL AUTO_INCREMENT,
  `A_Balance` double NOT NULL,
  `A_Interest` decimal(2,2) DEFAULT NULL,
  `A_Overdraft` double DEFAULT NULL,
  `A_LastAccess` datetime DEFAULT NULL,
  `A_AccountType` enum('checking','savings','interest','mma','cod','ira') NOT NULL,
  `A_Date` date DEFAULT NULL,
  PRIMARY KEY (`A_AccountID`),
  UNIQUE KEY `A_AccountID` (`A_AccountID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accountinfo`
--

LOCK TABLES `accountinfo` WRITE;
/*!40000 ALTER TABLE `accountinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `accountinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `belongs`
--

DROP TABLE IF EXISTS `belongs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `belongs` (
  `BL_B_ID` int(11) NOT NULL,
  `BL_CU_ID` int(11) NOT NULL,
  PRIMARY KEY (`BL_B_ID`,`BL_CU_ID`),
  KEY `FK_BelongsCustomer` (`BL_CU_ID`),
  CONSTRAINT `FK_BelongsBranch` FOREIGN KEY (`BL_B_ID`) REFERENCES `branch` (`B_ID`),
  CONSTRAINT `FK_BelongsCustomer` FOREIGN KEY (`BL_CU_ID`) REFERENCES `customer` (`CU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `belongs`
--

LOCK TABLES `belongs` WRITE;
/*!40000 ALTER TABLE `belongs` DISABLE KEYS */;
/*!40000 ALTER TABLE `belongs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `branch`
--

DROP TABLE IF EXISTS `branch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `branch` (
  `B_ID` int(11) NOT NULL AUTO_INCREMENT,
  `B_BranchName` varchar(50) DEFAULT NULL,
  `B_Number` int(11) DEFAULT NULL,
  `B_Street` varchar(100) DEFAULT NULL,
  `B_ZIP` varchar(5) DEFAULT NULL,
  `B_City` varchar(100) DEFAULT NULL,
  `B_State` varchar(50) DEFAULT NULL,
  `B_Phone` varchar(12) DEFAULT NULL,
  `B_Manager` int(11) NOT NULL,
  PRIMARY KEY (`B_ID`),
  UNIQUE KEY `B_ID` (`B_ID`),
  KEY `FK_BranchEmployee` (`B_Manager`),
  CONSTRAINT `FK_BranchEmployee` FOREIGN KEY (`B_Manager`) REFERENCES `employee` (`E_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branch`
--

LOCK TABLES `branch` WRITE;
/*!40000 ALTER TABLE `branch` DISABLE KEYS */;
/*!40000 ALTER TABLE `branch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `card`
--

DROP TABLE IF EXISTS `card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `card` (
  `CR_Number` char(15) NOT NULL,
  `CR_Type` enum('Alpha','Bravo','Charlie','Delta','Echo','Foxtrot') NOT NULL,
  `CR_Assigned` date NOT NULL,
  `CR_Expiration` date NOT NULL,
  `CR_APR` decimal(4,4) DEFAULT NULL,
  `CR_RewardRate` decimal(2,2) DEFAULT NULL,
  `CR_RewardBonus` double DEFAULT NULL,
  `CR_LateFee` double DEFAULT NULL,
  `CR_AnnualFee` double DEFAULT NULL,
  `CR_Max` double DEFAULT NULL,
  `CR_AccountID` int(11) NOT NULL,
  PRIMARY KEY (`CR_Number`),
  UNIQUE KEY `CR_Number` (`CR_Number`),
  KEY `FK_CardAccount` (`CR_AccountID`),
  CONSTRAINT `FK_CardAccount` FOREIGN KEY (`CR_AccountID`) REFERENCES `accountinfo` (`A_AccountID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `card`
--

LOCK TABLES `card` WRITE;
/*!40000 ALTER TABLE `card` DISABLE KEYS */;
/*!40000 ALTER TABLE `card` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `complaint`
--

DROP TABLE IF EXISTS `complaint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `complaint` (
  `CO_ComplaintFrom` int(11) NOT NULL,
  `CO_ComplaintTo` int(11) NOT NULL,
  `CO_Subject` int(11) NOT NULL,
  `CO_Date` date DEFAULT NULL,
  `CO_ID` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`CO_ID`),
  UNIQUE KEY `CO_ID` (`CO_ID`),
  KEY `FK_ComplaintEmployeeTo` (`CO_ComplaintTo`),
  KEY `FK_ComplaintEmployeeFrom` (`CO_ComplaintFrom`),
  CONSTRAINT `FK_ComplaintEmployeeFrom` FOREIGN KEY (`CO_ComplaintFrom`) REFERENCES `employee` (`E_ID`),
  CONSTRAINT `FK_ComplaintEmployeeTo` FOREIGN KEY (`CO_ComplaintTo`) REFERENCES `employee` (`E_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complaint`
--

LOCK TABLES `complaint` WRITE;
/*!40000 ALTER TABLE `complaint` DISABLE KEYS */;
/*!40000 ALTER TABLE `complaint` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `LG_Username` varchar(50) NOT NULL,
  `LG_Password` varchar(50) NOT NULL,
  `LG_Question` varchar(100) NOT NULL,
  `LG_Answer` varchar(100) NOT NULL,
  `LG_ProfilePic` longblob,
  `LG_Type` enum('customer','employee','admin') NOT NULL,
  UNIQUE KEY `LG_Username` (`LG_Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `CU_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CU_Student` enum('y','n') DEFAULT NULL,
  `CU_CreditHistory` enum('b','g','e') DEFAULT NULL,
  `CU_FirstName` varchar(50) NOT NULL,
  `CU_MiddleName` varchar(50) DEFAULT NULL,
  `CU_LastName` varchar(50) NOT NULL,
  `CU_DOB` date NOT NULL,
  `CU_Number` int(11) DEFAULT NULL,
  `CU_Street` varchar(100) DEFAULT NULL,
  `CU_ZIP` varchar(5) DEFAULT NULL,
  `CU_City` varchar(100) DEFAULT NULL,
  `CU_State` varchar(50) DEFAULT NULL,
  `CU_Email` varchar(50) DEFAULT NULL,
  `CU_Gender` enum('male','female','other') DEFAULT NULL,
  `CU_Phone` varchar(12) DEFAULT NULL,
  `CU_Username` varchar(50) NOT NULL,
  PRIMARY KEY (`CU_ID`),
  UNIQUE KEY `CU_ID` (`CU_ID`),
  UNIQUE KEY `CU_Username` (`CU_Username`),
  CONSTRAINT `FK_CustomerLogin` FOREIGN KEY (`CU_Username`) REFERENCES `login` (`LG_Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `E_FName` varchar(50) NOT NULL,
  `E_MName` varchar(50) DEFAULT NULL,
  `E_LName` varchar(50) NOT NULL,
  `E_Street` varchar(100) DEFAULT NULL,
  `E_ZIP` varchar(5) DEFAULT NULL,
  `E_City` varchar(100) DEFAULT NULL,
  `E_State` varchar(50) DEFAULT NULL,
  `E_Phone` varchar(12) DEFAULT NULL,
  `E_Title` varchar(30) DEFAULT NULL,
  `E_Salary` double DEFAULT NULL,
  `E_BranchID` int(11) NOT NULL,
  `E_DOB` date NOT NULL,
  `E_DateOfJoin` date NOT NULL,
  `E_Performance` int(11) DEFAULT NULL,
  `E_ID` int(11) NOT NULL AUTO_INCREMENT,
  `E_Username` varchar(50) NOT NULL,
  `E_Number` int(11) DEFAULT NULL,
  PRIMARY KEY (`E_ID`),
  UNIQUE KEY `E_ID` (`E_ID`),
  UNIQUE KEY `E_Username` (`E_Username`),
  KEY `FK_EmployeeBranch` (`E_BranchID`),
  CONSTRAINT `FK_EmployeeBranch` FOREIGN KEY (`E_BranchID`) REFERENCES `branch` (`B_ID`),
  CONSTRAINT `FK_EmployeeLogin` FOREIGN KEY (`E_Username`) REFERENCES `login` (`LG_Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `interest`
--

DROP TABLE IF EXISTS `interest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `interest` (
  `I_Date` date NOT NULL,
  `I_OldBalance` double NOT NULL,
  `I_NewBalance` double NOT NULL,
  `I_Rate` decimal(2,2) NOT NULL,
  `I_AccountID` int(11) NOT NULL,
  PRIMARY KEY (`I_Date`,`I_AccountID`),
  KEY `FK_InterestAccount` (`I_AccountID`),
  CONSTRAINT `FK_InterestAccount` FOREIGN KEY (`I_AccountID`) REFERENCES `accountinfo` (`A_AccountID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `interest`
--

LOCK TABLES `interest` WRITE;
/*!40000 ALTER TABLE `interest` DISABLE KEYS */;
/*!40000 ALTER TABLE `interest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loan`
--

DROP TABLE IF EXISTS `loan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `loan` (
  `LA_LoanID` int(11) NOT NULL AUTO_INCREMENT,
  `LA_AmountTaken` double NOT NULL,
  `LA_AmountRepaid` double DEFAULT NULL,
  `LA_InterestRate` decimal(2,2) DEFAULT NULL,
  `LA_Type` varchar(50) DEFAULT NULL,
  `LA_Status` enum('Accepted','Rejected') DEFAULT NULL,
  `LA_Source` varchar(50) DEFAULT NULL,
  `LA_Customer` int(11) NOT NULL,
  PRIMARY KEY (`LA_LoanID`),
  UNIQUE KEY `LA_LoanID` (`LA_LoanID`),
  KEY `FK_LoanCustomer` (`LA_Customer`),
  CONSTRAINT `FK_LoanCustomer` FOREIGN KEY (`LA_Customer`) REFERENCES `customer` (`CU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loan`
--

LOCK TABLES `loan` WRITE;
/*!40000 ALTER TABLE `loan` DISABLE KEYS */;
/*!40000 ALTER TABLE `loan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maintains`
--

DROP TABLE IF EXISTS `maintains`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `maintains` (
  `M_CU_ID` int(11) NOT NULL,
  `M_A_AccountID` int(11) NOT NULL,
  PRIMARY KEY (`M_CU_ID`,`M_A_AccountID`),
  KEY `FK_MaintainsAccount` (`M_A_AccountID`),
  CONSTRAINT `FK_MaintainsAccount` FOREIGN KEY (`M_A_AccountID`) REFERENCES `accountinfo` (`A_AccountID`),
  CONSTRAINT `FK_MaintainsCustomer` FOREIGN KEY (`M_CU_ID`) REFERENCES `customer` (`CU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maintains`
--

LOCK TABLES `maintains` WRITE;
/*!40000 ALTER TABLE `maintains` DISABLE KEYS */;
/*!40000 ALTER TABLE `maintains` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `performance`
--

DROP TABLE IF EXISTS `performance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `performance` (
  `P_Date` date DEFAULT NULL,
  `P_Record` varchar(255) NOT NULL,
  `P_Employee` int(11) NOT NULL,
  `P_ID` int(11) NOT NULL AUTO_INCREMENT,
  UNIQUE KEY `P_ID` (`P_ID`),
  KEY `FK_PerformanceEmployee` (`P_Employee`),
  CONSTRAINT `FK_PerformanceEmployee` FOREIGN KEY (`P_Employee`) REFERENCES `employee` (`E_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `performance`
--

LOCK TABLES `performance` WRITE;
/*!40000 ALTER TABLE `performance` DISABLE KEYS */;
/*!40000 ALTER TABLE `performance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `timelog`
--

DROP TABLE IF EXISTS `timelog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `timelog` (
  `TL_CheckIn` datetime DEFAULT NULL,
  `TL_CheckOut` datetime DEFAULT NULL,
  `TL_Employee` int(11) NOT NULL,
  `TL_ID` int(11) NOT NULL AUTO_INCREMENT,
  UNIQUE KEY `TL_ID` (`TL_ID`),
  KEY `FK_TimeEmployee` (`TL_Employee`),
  CONSTRAINT `FK_TimeEmployee` FOREIGN KEY (`TL_Employee`) REFERENCES `employee` (`E_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timelog`
--

LOCK TABLES `timelog` WRITE;
/*!40000 ALTER TABLE `timelog` DISABLE KEYS */;
/*!40000 ALTER TABLE `timelog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transactioninfo`
--

DROP TABLE IF EXISTS `transactioninfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transactioninfo` (
  `T_Date` date NOT NULL,
  `T_Balance` double NOT NULL,
  `T_Mode` enum('cash','check','credit','debit','other') NOT NULL,
  `T_Remarks` varchar(100) DEFAULT NULL,
  `T_TransactionID` int(11) NOT NULL AUTO_INCREMENT,
  `T_AccountID` int(11) NOT NULL,
  `T_Type` enum('credit','debit') NOT NULL,
  PRIMARY KEY (`T_TransactionID`),
  UNIQUE KEY `T_TransactionID` (`T_TransactionID`),
  KEY `FK_TransactionAccount` (`T_AccountID`),
  CONSTRAINT `FK_TransactionAccount` FOREIGN KEY (`T_AccountID`) REFERENCES `accountinfo` (`A_AccountID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactioninfo`
--

LOCK TABLES `transactioninfo` WRITE;
/*!40000 ALTER TABLE `transactioninfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `transactioninfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-17 17:16:14
