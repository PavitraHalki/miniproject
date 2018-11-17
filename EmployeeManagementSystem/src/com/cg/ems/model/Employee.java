package com.cg.ems.model;

import java.util.Date;

public class Employee {

	private String EmployeeId;
	private String EmpFName;
	private String EmpLName;
	private Date EmpDOB;
	private Date EmpDOJ;
	private int DeptId;
	private String EmpGrade;
	private String EmpDesignation;
	private int EmpBasic;
	private String EmpGender;
	private String EmpMStatus;
	private String HomeAddr;
	private String EmpCNumber;
	private String MrgId;
	private int leaveBalance;

	public Employee() {

	}

	public Employee(String employeeId, String empFName, String empLName,
			Date empDOB, Date empDOJ, int deptId, String empGrade,
			String empDesignation, int empBasic, String empGender,
			String empMStatus, String homeAddr, String empCNumber, String mrgId) {
		super();
		EmployeeId = employeeId;
		EmpFName = empFName;
		EmpLName = empLName;
		EmpDOB = empDOB;
		EmpDOJ = empDOJ;
		DeptId = deptId;
		EmpGrade = empGrade;
		EmpDesignation = empDesignation;
		EmpBasic = empBasic;
		EmpGender = empGender;
		EmpMStatus = empMStatus;
		HomeAddr = homeAddr;
		EmpCNumber = empCNumber;
		MrgId = mrgId;
	}

	public String getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmpFName() {
		return EmpFName;
	}

	public void setEmpFName(String empFName) {
		EmpFName = empFName;
	}

	public String getEmpLName() {
		return EmpLName;
	}

	public void setEmpLName(String empLName) {
		EmpLName = empLName;
	}

	public Date getEmpDOB() {
		return EmpDOB;
	}

	public void setEmpDOB(Date empDOB) {
		EmpDOB = empDOB;
	}

	public Date getEmpDOJ() {
		return EmpDOJ;
	}

	public void setEmpDOJ(Date empDOJ) {
		EmpDOJ = empDOJ;
	}

	public int getDeptId() {
		return DeptId;
	}

	public void setDeptId(int deptId) {
		DeptId = deptId;
	}

	public String getEmpGrade() {
		return EmpGrade;
	}

	public void setEmpGrade(String empGrade) {
		EmpGrade = empGrade;
	}

	public String getEmpDesignation() {
		return EmpDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		EmpDesignation = empDesignation;
	}

	public int getEmpBasic() {
		return EmpBasic;
	}

	public void setEmpBasic(int empBasic) {
		EmpBasic = empBasic;
	}

	public String getEmpGender() {
		return EmpGender;
	}

	public void setEmpGender(String empGender) {
		EmpGender = empGender;
	}

	public String getEmpMStatus() {
		return EmpMStatus;
	}

	public void setEmpMStatus(String empMStatus) {
		EmpMStatus = empMStatus;
	}

	public String getHomeAddr() {
		return HomeAddr;
	}

	public void setHomeAddr(String homeAddr) {
		HomeAddr = homeAddr;
	}

	public String getEmpCNumber() {
		return EmpCNumber;
	}

	public void setEmpCNumber(String empCNumber) {
		EmpCNumber = empCNumber;
	}

	public String getMrgId() {
		return MrgId;
	}

	public void setMrgId(String mrgId) {
		MrgId = mrgId;
	}

	public int getLeaveBalance() {
		return leaveBalance;
	}

	public void setLeaveBalance(int leaveBalance) {
		this.leaveBalance = leaveBalance;
	}

}
