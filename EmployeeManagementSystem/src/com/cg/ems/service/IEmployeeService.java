package com.cg.ems.service;

import com.cg.ems.exception.EMSException;
import com.cg.ems.model.Employee;
import com.cg.ems.model.LeaveHistory;

public interface IEmployeeService {
	
	Employee findEmployee(String EmployeeId) throws EMSException;

	boolean applyForLeave(LeaveHistory leaveHistory) throws EMSException;

	LeaveHistory modifyLeaveStatus(String mgrId);
	
	
}
