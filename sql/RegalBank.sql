CREATE DATABASE RegalBank;
USE RegalBank;

CREATE Table Customer (
	CU_ID int not null PRIMARY KEY,
    CU_Student enum('y','n'),
    CU_CreditHistory enum ('b','g','e'),
	CU_FirstName varchar(50),
	CU_MiddleName varchar(50),
    CU_LastName varchar(50),
    CU_DOB date,
    CU_Number int,
    CU_Street varchar(100),
    CU_ZIP varchar(5),
    CU_City varchar(100),
    CU_State varchar(50),
    CU_Country varchar(100),
    CU_Email varchar(50),
    CU_Gender enum('male','female','other'),
    CU_Phone varchar(13)
);

CREATE Table Branch (
	B_BranchName varchar(50),
    B_Number int,
    B_Street varchar(100),
    B_ZIP varchar(5),
    B_City varchar(100),
    B_State varchar(50),
    B_Phone varchar(12),
    B_ID int not null PRIMARY KEY,
    B_Manager int
);

CREATE Table Employee (
	E_FName varchar(50),
    E_MName varchar(50),
    E_LName varchar(40),
    E_Street varchar(100),
    E_ZIP varchar(5),
    E_City varchar(100),
    E_State varchar(50),
    E_Phone varchar(12),
    E_Title varchar(30),
    E_Salary double,
    E_BranchID int,
    E_DOB date,
    E_DateOfJoin date,
    E_ArrivalTime time,
    E_DepartTime time,
    E_Performance int,
    E_ID int not null PRIMARY KEY
);

CREATE Table Performance (
	P_Date date,
    P_Record varchar(255),
    P_Employee int
);

CREATE Table Complaint (
	CO_ComplaintFrom int,
    CO_ComplaintTo int,
    CO_Subject varchar(255),
    CO_Date date,
    CO_ID int not null PRIMARY KEY
);

CREATE Table TransactionInfo (
	T_Debit bool,
    T_Credit bool,
    T_Date date,
    T_Balance double,
    T_Mode enum ('cash', 'credit', 'debit', 'other'),
    T_Remarks varchar(100),
    T_TransactionID int PRIMARY KEY,
    T_AccountID int
);

CREATE Table AccountInfo (
	A_AccountID int not null PRIMARY KEY,
    A_Balance double,
    A_Interest decimal,
    A_Overdraft decimal,
    A_LastAccess DateTime,
    A_AccountType enum ('admin', 'customer', 'employee'),
    A_Date date
);

CREATE Table Card (
	CR_Number double,
    CR_Type enum('Alpha','Bravo','Charlie','Delta','Echo','Foxtrot'),
    CR_Assigned date,
    CR_Expiration date,
    CR_APR Decimal,
    CR_RewardRate double,
    CR_RewardBonus double,
    CR_LateFee double,
    CR_AnnualFee double,
    CR_Max double
);

CREATE Table Loan (
	LA_LoanID int not null PRIMARY KEY,
    LA_AmountTaken double,
    LA_AmountRepaid double,
    LA_InterestRate decimal,
    LA_Type varchar(50),
    LA_Status enum ('Accepted','Rejected'),
    LA_Source varchar (50)
);

CREATE Table Login (
		LG_ID int,
        LG_Username varchar(50),
        LG_Password varchar(50),
        LG_Question varchar(100),
        LG_Answer varchar(100),
        LG_ProfilePic varchar(100)
);

CREATE Table Interest (
	I_Date date,
    I_OldBalance Double,
    I_NewBalance Double,
    I_Rate decimal,
    I_AccountID int
);


FLUSH privileges;


SET PASSWORD FOR 'root'@'localhost' = PASSWORD('');