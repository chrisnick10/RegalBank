drop database if exists regalbank;
create database regalbank;
use regalbank;

set foreign_key_checks = 0;
CREATE TABLE `login` (
  `LG_Username` varchar(50) NOT NULL,
  `LG_Password` varchar(50) NOT NULL,
  `LG_Question` varchar(100) NOT NULL,
  `LG_Answer` varchar(100) NOT NULL,
  `LG_ProfilePic` longblob,
  `LG_Type` enum('employee','admin') NOT NULL,
  PRIMARY KEY (`LG_Username`),
  UNIQUE KEY `LG_Username` (`LG_Username`)
);

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
  PRIMARY KEY (`CU_ID`),
  UNIQUE KEY `CU_ID` (`CU_ID`)
);

CREATE TABLE `loan` (
  `LA_LoanID` int(11) NOT NULL AUTO_INCREMENT,
  `LA_AmountTaken` double NOT NULL,
  `LA_AmountRepaid` double DEFAULT NULL,
  `LA_InterestRate` float(4,2) DEFAULT NULL,
  `LA_Type` varchar(50) DEFAULT NULL,
  `LA_Status` enum('Accepted','Rejected') DEFAULT NULL,
  `LA_Source` varchar(50) DEFAULT NULL,
  `LA_Customer` int(11) NOT NULL,
  PRIMARY KEY (`LA_LoanID`),
  UNIQUE KEY `LA_LoanID` (`LA_LoanID`),
  KEY `FK_LoanCustomer` (`LA_Customer`),
  CONSTRAINT `FK_LoanCustomer` FOREIGN KEY (`LA_Customer`) REFERENCES `customer` (`CU_ID`) ON DELETE CASCADE
);

CREATE TABLE `branch` (
  `B_ID` int(11) NOT NULL AUTO_INCREMENT,
  `B_BranchName` varchar(50) DEFAULT NULL,
  `B_Number` int(11) DEFAULT NULL,
  `B_Street` varchar(100) DEFAULT NULL,
  `B_ZIP` varchar(5) DEFAULT NULL,
  `B_City` varchar(100) DEFAULT NULL,
  `B_State` varchar(50) DEFAULT NULL,
  `B_Phone` varchar(12) DEFAULT NULL,
  `B_Manager` int(11) DEFAULT NULL,
  PRIMARY KEY (`B_ID`),
  UNIQUE KEY `B_ID` (`B_ID`),
  KEY `FK_BranchEmployee` (`B_Manager`),
  CONSTRAINT `FK_BranchEmployee` FOREIGN KEY (`B_Manager`) REFERENCES `employee` (`E_ID`) ON DELETE CASCADE
);

CREATE TABLE `belongs` (
  `BL_B_ID` int(11) NOT NULL,
  `BL_CU_ID` int(11) NOT NULL,
  PRIMARY KEY (`BL_B_ID`,`BL_CU_ID`),
  KEY `FK_BelongsCustomer` (`BL_CU_ID`),
  CONSTRAINT `FK_BelongsBranch` FOREIGN KEY (`BL_B_ID`) REFERENCES `branch` (`B_ID`) ON DELETE CASCADE,
  CONSTRAINT `FK_BelongsCustomer` FOREIGN KEY (`BL_CU_ID`) REFERENCES `customer` (`CU_ID`) ON DELETE CASCADE
);

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
  `E_ID` int(11) NOT NULL AUTO_INCREMENT,
  `E_Username` varchar(50) NOT NULL,
  `E_Number` int(11) DEFAULT NULL,
  PRIMARY KEY (`E_ID`),
  UNIQUE KEY `E_ID` (`E_ID`),
  UNIQUE KEY `E_Username` (`E_Username`),
  KEY `FK_EmployeeBranch` (`E_BranchID`),
  CONSTRAINT `FK_EmployeeBranch` FOREIGN KEY (`E_BranchID`) REFERENCES `branch` (`B_ID`) ON DELETE CASCADE,
  CONSTRAINT `FK_EmployeeLogin` FOREIGN KEY (`E_Username`) REFERENCES `login` (`LG_Username`) ON DELETE CASCADE
);

CREATE TABLE `timelog` (
  `TL_CheckIn` datetime DEFAULT NULL,
  `TL_CheckOut` datetime DEFAULT NULL,
  `TL_Employee` int(11) NOT NULL,
  `TL_ID` int(11) NOT NULL AUTO_INCREMENT,
  UNIQUE KEY `TL_ID` (`TL_ID`),
  KEY `FK_TimeEmployee` (`TL_Employee`),
  CONSTRAINT `FK_TimeEmployee` FOREIGN KEY (`TL_Employee`) REFERENCES `employee` (`E_ID`) ON DELETE CASCADE
);

CREATE TABLE `accountinfo` (
  `A_AccountID` int(11) NOT NULL AUTO_INCREMENT,
  `A_Balance` double NOT NULL,
  `A_Interest` float(4,2) DEFAULT NULL,
  `A_Overdraft` double DEFAULT NULL,
  `A_LastAccess` datetime DEFAULT NULL,
  `A_AccountType` enum('checking','savings','interest','mma','cod','ira') NOT NULL,
  `A_Date` date DEFAULT NULL,
  PRIMARY KEY (`A_AccountID`),
  UNIQUE KEY `A_AccountID` (`A_AccountID`)
);

CREATE TABLE `maintains` (
  `M_CU_ID` int(11) NOT NULL,
  `M_A_AccountID` int(11) NOT NULL,
  PRIMARY KEY (`M_CU_ID`,`M_A_AccountID`),
  KEY `FK_MaintainsAccount` (`M_A_AccountID`),
  CONSTRAINT `FK_MaintainsAccount` FOREIGN KEY (`M_A_AccountID`) REFERENCES `accountinfo` (`A_AccountID`) ON DELETE CASCADE,
  CONSTRAINT `FK_MaintainsCustomer` FOREIGN KEY (`M_CU_ID`) REFERENCES `customer` (`CU_ID`) ON DELETE CASCADE
);

CREATE TABLE `card` (
  `CR_Number` char(15) NOT NULL,
  `CR_Type` enum('Alpha','Bravo','Charlie','Delta','Echo','Foxtrot') NOT NULL,
  `CR_Assigned` date NOT NULL,
  `CR_Expiration` date NOT NULL,
  `CR_RewardRate` float(4,2) DEFAULT NULL,
  `CR_RewardBonus` double DEFAULT NULL,
  `CR_LateFee` double DEFAULT NULL,
  `CR_AnnualFee` varchar(5) DEFAULT NULL,
  `CR_AccountID` int(11) NOT NULL,
  `CR_IntroAPR` varchar(40) DEFAULT NULL,
  `CR_RegAPR` float(4,4) DEFAULT NULL,
  `CR_Rating` enum('b','g','e') DEFAULT NULL,
  PRIMARY KEY (`CR_Number`),
  UNIQUE KEY `CR_Number` (`CR_Number`),
  KEY `FK_CardAccount` (`CR_AccountID`),
  CONSTRAINT `FK_CardAccount` FOREIGN KEY (`CR_AccountID`) REFERENCES `accountinfo` (`A_AccountID`) ON DELETE CASCADE
);

CREATE TABLE `complaint` (
  `CO_ComplaintFrom` int(11) NOT NULL,
  `CO_ComplaintTo` int(11) NOT NULL,
  `CO_Subject` varchar(40) NOT NULL,
  `CO_Message` varchar(255) DEFAULT NULL,
  `CO_Date` date DEFAULT NULL,
  `CO_ID` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`CO_ID`),
  UNIQUE KEY `CO_ID` (`CO_ID`),
  KEY `FK_ComplaintEmployeeFrom` (`CO_ComplaintFrom`),
  KEY `FK_ComplaintEmployeeTo` (`CO_ComplaintTo`),
  CONSTRAINT `FK_ComplaintEmployeeFrom` FOREIGN KEY (`CO_ComplaintFrom`) REFERENCES `employee` (`E_ID`) ON DELETE CASCADE,
  CONSTRAINT `FK_ComplaintEmployeeTo` FOREIGN KEY (`CO_ComplaintTo`) REFERENCES `employee` (`E_ID`) ON DELETE CASCADE
);

CREATE TABLE `interest` (
  `I_Date` date NOT NULL,
  `I_OldBalance` double NOT NULL,
  `I_NewBalance` double NOT NULL,
  `I_Rate` float(4,2) NOT NULL,
  `I_AccountID` int(11) NOT NULL,
  PRIMARY KEY (`I_Date`,`I_AccountID`),
  KEY `FK_InterestAccount` (`I_AccountID`),
  CONSTRAINT `FK_InterestAccount` FOREIGN KEY (`I_AccountID`) REFERENCES `accountinfo` (`A_AccountID`) ON DELETE CASCADE
);

CREATE TABLE `performance` (
  `P_Date` date DEFAULT NULL,
  `P_Record` varchar(255) NOT NULL,
  `P_Employee` int(11) NOT NULL,
  `P_ID` int(11) NOT NULL AUTO_INCREMENT,
  UNIQUE KEY `P_ID` (`P_ID`),
  KEY `FK_PerformanceEmployee` (`P_Employee`),
  CONSTRAINT `FK_PerformanceEmployee` FOREIGN KEY (`P_Employee`) REFERENCES `employee` (`E_ID`) ON DELETE CASCADE
);

CREATE TABLE `transactioninfo` (
  `T_Date` date NOT NULL,
  `T_Balance` double NOT NULL,
  `T_Mode` enum('cash','check','card','other') NOT NULL,
  `T_Remarks` varchar(100) DEFAULT NULL,
  `T_TransactionID` int(11) NOT NULL AUTO_INCREMENT,
  `T_AccountID` int(11) NOT NULL,
  `T_Type` enum('credit','debit') DEFAULT NULL,
  PRIMARY KEY (`T_TransactionID`),
  UNIQUE KEY `T_TransactionID` (`T_TransactionID`),
  KEY `FK_TransactionAccount` (`T_AccountID`),
  CONSTRAINT `FK_TransactionAccount` FOREIGN KEY (`T_AccountID`) REFERENCES `accountinfo` (`A_AccountID`) ON DELETE CASCADE
);
set foreign_key_checks = 1;

insert into login (LG_Username, LG_Password, LG_Question, LG_Answer, LG_ProfilePic, LG_Type) values ("admin", "password", "what is your dad's name?", "James", NULL, "admin");
insert into login (LG_Username, LG_Password, LG_Question, LG_Answer, LG_ProfilePic, LG_Type) values ("christian", "password", "what is your dog's name?", "Luke", "NULL", "employee");
insert into login (LG_Username, LG_Password, LG_Question, LG_Answer, LG_ProfilePic, LG_Type) values ("daniel", "password", "question about yourself", "idk", NULL, "employee");
insert into login (LG_Username, LG_Password, LG_Question, LG_Answer, LG_ProfilePic, LG_Type) values ("lauren", "password", "question about yourself", "idk", NULL, "employee");



insert into customer (CU_ID, CU_Student, CU_CreditHistory, CU_FirstName, CU_MiddleName, CU_LastName, CU_DOB, CU_Number, CU_Street, CU_ZIP, CU_City, CU_State, CU_Email, CU_Gender, CU_Phone) values (1, "Y", "G", "Christian", "James", "Nickolaou", "1992-02-23", "8284", "Peaceful Valley Dr", "48348", "Clarkston", "MI", "nickolaou@oakland.edu", "male", "2488822083");
insert into customer (CU_ID, CU_Student, CU_CreditHistory, CU_FirstName, CU_MiddleName, CU_LastName, CU_DOB, CU_Number, CU_Street, CU_ZIP, CU_City, CU_State, CU_Email, CU_Gender, CU_Phone) values (2, "N", "B", "Bob", "Joe", "Sally", "1990-04-09", "1234", "Roosevelt Rd", "48044", "Macomb", "MI", "bobjoe@gmail.com", "male", "5863330987");
insert into customer (CU_ID, CU_Student, CU_CreditHistory, CU_FirstName, CU_MiddleName, CU_LastName, CU_DOB, CU_Number, CU_Street, CU_ZIP, CU_City, CU_State, CU_Email, CU_Gender, CU_Phone) values (3, "Y", "E", "Lucy", null, "Jones", "1980-03-12", "9564", "Main St", "56784", "Miami", "FL", "lucy123@gmail.com", "female", "2104569999");


insert into loan (LA_LoanID, LA_AmountTaken, LA_AmountRepaid, LA_InterestRate, LA_Type, LA_Status, LA_Source, LA_Customer) values (1, "500000.00", "10000.00", ".92", "Standard", "Accepted", "Work", "1");
insert into loan (LA_LoanID, LA_AmountTaken, LA_AmountRepaid, LA_InterestRate, LA_Type, LA_Status, LA_Source, LA_Customer) values (2, "20000.00", "1000.00", ".12", "Home", "Accepted", "Realtor", "3");




insert into branch (B_ID, B_BranchName, B_Number, B_Street, B_ZIP, B_City, B_State, B_Phone, B_Manager) values (1, "Oakland U", "318", "Meadow Brook Rd", "48309", "Rochester", "MI", "2481112223", NULL);
insert into branch (B_ID, B_BranchName, B_Number, B_Street, B_ZIP, B_City, B_State, B_Phone, B_Manager) values (2, "Florida Branch", "111", "Palm Tree Av", "59999", "Miami", "FL", "1123890000", NULL);



insert into belongs (BL_B_ID, BL_CU_ID) values (1, 1);
insert into belongs (BL_B_ID, BL_CU_ID) values (1, 2);
insert into belongs (BL_B_ID, BL_CU_ID) values (2, 3);
insert into belongs (BL_B_ID, BL_CU_ID) values (2, 1);



insert into employee (E_ID, E_FName, E_MName, E_LName, E_Number, E_Street, E_ZIP, E_City, E_State, E_Phone, E_Title, E_Salary, E_BranchID, E_DOB, E_DateOfJoin, E_Username) values (1, "Luke", "Darth", "Skywalker", "111", "Jedi Drive", "48348", "Mos Eisley", "Tatooine", "1234567890", "Teller", "20000", "1", "1980-10-11", "2018-04-04", "christian");
INSERT INTO employee (E_ID,E_FName,E_MName,E_LName,E_Number,E_Street,E_ZIP,E_City,E_State,E_Phone,E_Title,E_Salary,E_BranchID,E_DOB,E_DateOfJoin,E_Username) VALUES (2,"Patrick","Mason","Sacha","133","Erat Street","24979","Auburn","ME","7814242701","Janitor","323705.85",1,"2018-04-11","1995-05-06","daniel");
INSERT INTO employee (E_ID,E_FName,E_MName,E_LName,E_Number,E_Street,E_ZIP,E_City,E_State,E_Phone,E_Title,E_Salary,E_BranchID,E_DOB,E_DateOfJoin,E_Username) VALUES (3,"Vance","Steel","Wang","268","Vitae Ave","65239","New Orleans","LA","3047432932","Teller","419379.17",2,"2002-07-06","1985-07-11","lauren");


insert into timelog (TL_ID, TL_Employee, TL_CheckOut, TL_CheckIn) values (1, "1", NULL, "2018-04-01 9:00:00");
insert into timelog (TL_ID, TL_Employee, TL_CheckOut, TL_CheckIn) values (2, "1", "2018-04-01 3:00:00", NULL);
insert into timelog (TL_ID, TL_Employee, TL_CheckOut, TL_CheckIn) values (3, "2", NULL, "2018-04-09 8:00:00");

Insert into AccountInfo(A_AccountID, A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (1, 1000, 0.1, 9000, curdate(), 'checking', '2011-01-28');
Insert into AccountInfo(A_AccountID, A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (2, 12000, 0.4, 30000, curdate(), 'checking', '2000-01-28');
Insert into AccountInfo(A_AccountID, A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (3, 90000, 0.6, 9000, curdate(), 'checking', '2011-01-28');
Insert into AccountInfo(A_AccountID, A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (4, 2000, 0.9, 3000, curdate(), 'savings', '2013-01-28');
Insert into AccountInfo(A_AccountID, A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (5, 9000, 0.6, 10000, curdate(), 'savings', '2017-01-28');
Insert into AccountInfo(A_AccountID, A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (6, 3000, 0.5, 2000, curdate(), 'interest', '2016-01-28');
Insert into AccountInfo(A_AccountID, A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (7, 4000, 0.4, 9000, curdate(), 'mma', '2014-01-28');
Insert into AccountInfo(A_AccountID, A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (8, 4500, 0.4, 10000, curdate(), 'cod', '2013-01-28');
Insert into AccountInfo(A_AccountID, A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (9, 5500, 0.8, 11000, curdate(), 'cod', '2011-01-28');
Insert into AccountInfo(A_AccountID, A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (10, 4400, 0.4, 9000, curdate(), 'mma', '2012-01-28');
Insert into AccountInfo(A_AccountID, A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (11, 3500, 0.1, 8000, curdate(), 'ira', '2012-01-28');



insert into maintains (M_CU_ID, M_A_AccountID) values (1, 1);
insert into maintains (M_CU_ID, M_A_AccountID) values (2, 2);
insert into maintains (M_CU_ID, M_A_AccountID) values (3, 3);
insert into maintains (M_CU_ID, M_A_AccountID) values (1, 4);



Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("22345", 'Alpha', curdate(), DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 12 months", 0.15,null, 30, 0, 0, 1, 'b');
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("54321", 'Alpha', curdate(),  DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 12 months", 0.15,null, 30, 0, 0, 2, 'g');
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("11111", 'Alpha', curdate(),  DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 12 months", 0.15,1, 30, 30, 95, 3, 'e');
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("99999", 'Alpha', curdate(),  DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 12 months", 0.15,1, 30, 30, 95, 4, 'e');
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("22222", 'Bravo', curdate(),  DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 12 months", 0.15,2, 40, null, null, 5, 'e');
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("33333", 'Bravo', curdate(),  DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 12 months", 0.15,2, 40, null, null, 6, 'e');
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("33344", 'Bravo', curdate(),  DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 12 months", 0.15,2, 40, null, null, 6, 'g');
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("44444", 'Charlie', curdate(),  DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 15 months", 0.15,3, 35, 150, null, 6, 'e');
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("89009", 'Charlie', curdate(),  DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 15 months", 0.15,3, 35, 150, null, 6, 'g');
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("55555", 'Delta', curdate(),  DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 12 months", 0.13,2, 30, 150, null, 7, 'e');
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("58855", 'Delta', curdate(),  DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 12 months", 0.14,2, 30, 150, null, 10, 'e');
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("66666", 'Echo', curdate(),  DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 12 months", 0.2499,1.5, 10, 150, 39, 8, 'e');
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("68216", 'Echo', curdate(),  DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 12 months", 0.2499,1.5, 10, 150, 39, 11, 'g');
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("77777", 'Foxtrot', curdate(),  DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 15 months", 0.16,1.5, 30, 150, null, 9, 'e');
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("87607", 'Foxtrot', curdate(), DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 15 months", 0.16,1.5, 30, 150, null, 11, 'e');
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("87707", 'Foxtrot', curdate(),  DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 15 months", 0.16,1.5, 30, 150, null, 11, 'e');

Insert into Complaint ( CO_ComplaintFrom, CO_ComplaintTo, CO_Subject, CO_Message, CO_Date ) values (1,2, "Behavior Complaint", "This employee has insulted many times", curdate());
Insert into Complaint ( CO_ComplaintFrom, CO_ComplaintTo, CO_Subject, CO_Message, CO_Date ) values (1,2, "More Behavior Complaints", "This employee keeps insulting me.", curdate());
Insert into Complaint ( CO_ComplaintFrom, CO_ComplaintTo, CO_Subject, CO_Message, CO_Date ) values (1,2, "Time Requested Off", "I need longer breaks", curdate());
Insert into Complaint ( CO_ComplaintFrom, CO_ComplaintTo, CO_Subject, CO_Message, CO_Date ) values (3,2, "Noise Complaint", "My coworker keeps blasting his music.", curdate());
Insert into Complaint ( CO_ComplaintFrom, CO_ComplaintTo, CO_Subject, CO_Message, CO_Date ) values (3,2, "Noise Complaint", "My coworker is always talking.", curdate());
Insert into Complaint ( CO_ComplaintFrom, CO_ComplaintTo, CO_Subject, CO_Message, CO_Date ) values (2,1, "Time Requested Off Response", "I will see what I can do.", curdate());
Insert into Complaint ( CO_ComplaintFrom, CO_ComplaintTo, CO_Subject, CO_Message, CO_Date ) values (2,3, "Noise Complaint Response", "I'll deal with it.", curdate());
















