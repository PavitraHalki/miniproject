CREATE TABLE User_Master ( 
UserId VARCHAR2(6),
UserName VARCHAR2(15),
UserPassword VARCHAR2(50),
UserType VARCHAR2(10)
);


CREATE TABLE Department(Dept_ID int,dept_Name varchar2(50));

CREATE TABLE Employee(
  Emp_ID varchar2(6) PRIMARY KEY,
  Emp_First_Name VARCHAR2(25),
  Emp_Last_Name VARCHAR2(25),
  Emp_Date_of_Birth DATE,
  Emp_Date_of_Joining DATE,
  Emp_Dept_ID int,
  Emp_Grade VARCHAR2(2),
  Emp_designation VARCHAR2(50),
  Emp_Basic int,
  Emp_Gender VARCHAR2(1),
  Emp_Martital_Status VARCHAR2(1),
  Emp_Home_Address VARCHAR2(100),
  Emp_Contact_Num VARCHAR2(15),
  Mgr_Id VARCHAR2(6)
 );
 
  
 
 CREATE TABLE Grade_Master ( 
 Grade_Code VARCHAR2(2),
 Description VARCHAR2(10),
 Min_Salary int,
 Max_Salary int
 );
 
 
 CREATE TABLE Leave_History ( 
 Leave_Id number,
 leave_balance NUMBER CHECK(leave_balance>=0),
 noofdays_applied NUMBER,
 date_from DATE,
 date_to DATE,
 status VARCHAR2(20) CHECK (status in('applied','approved','rejected')),
 Emp_ID VARCHAR2(6),
 FOREIGN KEY(Emp_ID) REFERENCES Employee(Emp_ID)
 );
 
 
 
 CREATE sequence leave_idseq
 START WITH 100000
 minvalue 100000
 maxvalue 110000
 increment BY 1
 nocache;
  
  
 COMMIT;