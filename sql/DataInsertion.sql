use RegalBank;


# LOGIN TABLE INSERTION
insert into login (LG_Username, LG_Password, LG_Question, LG_Answer, LG_ProfilePic, LG_Type) values
("admin1", "password", "what is your dad's name?", "James", NULL, "admin"),
("christian", "password", "what is your dog's name?", "Luke", "NULL", "employee"),
("daniel", "password", "question about yourself", "idk", NULL, "employee"),
("lauren", "password", "question about yourself", "idk", NULL, "employee");

# CUSTOMER TABLE INSERTION
insert into customer (CU_Student, CU_CreditHistory, CU_FirstName, CU_MiddleName, CU_LastName, CU_DOB, CU_Number, CU_Street, CU_ZIP, CU_City, CU_State, CU_Email, CU_Gender, CU_Phone) values 
("Y", "G", "Christian", "James", "Nickolaou", "1992-02-23", "8284", "Peaceful Valley Dr", "48348", "Clarkston", "MI", "nickolaou@oakland.edu", "male", "2488822083");

# LOAN TABLE INSERTION
insert into loan (LA_AmountTaken, LA_AmountRepaid, LA_InterestRate, LA_Type, LA_Status, LA_Source, LA_Customer) values 
("500000.00", "10000.00", ".92", "Standard", "Accepted", "Work", "1");

# BRANCH TABLE INSERTION
insert into branch (B_BranchName, B_Number, B_Street, B_ZIP, B_City, B_State, B_Phone, B_Manager) values
("Oakland U", "318", "Meadow Brook Rd", "48309", "Rochester", "MI", "2481112223", NULL);

# EMPLOYEE TABLE INSERTION
insert into employee (E_FName, E_MName, E_LName, E_Number, E_Street, E_ZIP, E_City, E_State, E_Phone, E_Title, E_Salary, E_BranchID,
E_DOB, E_DateOfJoin, E_Performance, E_Username) values
("Luke", "Darth", "Skywalker", "111", "Jedi Drive", "48348", "Mos Eisley", "Tatooine", "1234567890", "Teller", "20000", "1", "1980-10-11",
"2018-04-04", NULL, "christian");

# TIMELOG TABLE INSERTION
insert into timelog (TL_Employee, TL_CheckOut, TL_CheckIn) values 
("1", NULL, curtime());

