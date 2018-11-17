package com.cg.ems.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.ems.dao.EmployeeDaoImpl;
import com.cg.ems.dao.IEmployeeDao;
import com.cg.ems.exception.EMSException;
import com.cg.ems.model.Employee;
import com.cg.ems.model.LeaveHistory;


public class EmployeeServiceImpl implements IEmployeeService {

	private IEmployeeDao empDao=new EmployeeDaoImpl();

	@Override
	public Employee findEmployee(String EmployeeId) throws EMSException {
		
		return null;
	}

	@Override
	public boolean applyForLeave(LeaveHistory leaveHistory) throws EMSException {
		System.out.println("service");
		return empDao.applyForLeave(leaveHistory);
	}

	@Override
	public LeaveHistory modifyLeaveStatus(String mgrId) {
		
		return empDao.modifyLeaveStatus(mgrId);
	}
	
	

}
