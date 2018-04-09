use RegalBank;


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
















