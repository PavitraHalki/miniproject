package com.cg.ems.dao;

public interface IQueryMapper {

	final String GET_USER = "select ";
	final String insertEmployee = "insert into Employee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,12)";
	final String applyLeave = "insert into Leave_History values(leave_idseq.nextval,?,?,?,?,'applied',?)";
	final String getLeaveBalance = "select leave_balance from employee where emp_id=?";

}
