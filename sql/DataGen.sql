USE RegalBank;

Insert into AccountInfo(A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (1000, 0.1, 9000, curdate(), 'checking', '2011-01-28');
Insert into AccountInfo(A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (12000, 0.4, 30000, curdate(), 'checking', '2000-01-28');
Insert into AccountInfo(A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (90000, 0.6, 9000, curdate(), 'checking', '2011-01-28');
Insert into AccountInfo(A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (2000, 0.9, 3000, curdate(), 'savings', '2013-01-28');
Insert into AccountInfo(A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (9000, 0.6, 10000, curdate(), 'savings', '2017-01-28');
Insert into AccountInfo(A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (3000, 0.5, 2000, curdate(), 'interest', '2016-01-28');
Insert into AccountInfo(A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (4000, 0.4, 9000, curdate(), 'mma', '2014-01-28');
Insert into AccountInfo(A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (4500, 0.4, 10000, curdate(), 'cod', '2013-01-28');
Insert into AccountInfo(A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (5500, 0.8, 11000, curdate(), 'cod', '2011-01-28');
Insert into AccountInfo(A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (4400, 0.4, 9000, curdate(), 'mma', '2012-01-28');
Insert into AccountInfo(A_Balance, A_Interest, A_Overdraft, A_LastAccess, A_AccountType, A_Date) values (3500, 0.1, 8000, curdate(), 'ira', '2012-01-28');

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
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("87607", 'Foxtrot', curdate(), DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 15 months", 0.16,1.5, 30, 150, null, 13, 'e');
Insert into Card ( CR_Number, CR_Type, CR_Assigned, CR_Expiration, CR_IntroAPR, CR_RegAPR, CR_RewardRate,CR_RewardBonus, CR_LateFee, CR_AnnualFee, CR_AccountID, CR_Rating) values ("87707", 'Foxtrot', curdate(),  DATE_ADD(curdate(), INTERVAL 4 YEAR), "0% for 15 months", 0.16,1.5, 30, 150, null, 12, 'e');














