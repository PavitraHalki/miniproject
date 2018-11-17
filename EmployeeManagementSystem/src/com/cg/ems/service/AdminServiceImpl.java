package com.cg.ems.service;

import com.cg.ems.dao.AdminDaoImpl;
import com.cg.ems.dao.IAdminDao;
import com.cg.ems.exception.EMSException;
import com.cg.ems.model.Employee;

public class AdminServiceImpl implements IAdminService{
	
	IAdminDao dao=new AdminDaoImpl();

	@Override
	public boolean addEmployee(Employee employee) throws EMSException {
		
		return dao.addEmployee(employee);
	}

}
