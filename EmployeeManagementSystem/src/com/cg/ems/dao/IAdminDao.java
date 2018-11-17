package com.cg.ems.dao;

import com.cg.ems.exception.EMSException;
import com.cg.ems.model.Employee;

public interface IAdminDao {

	boolean addEmployee(Employee employee) throws EMSException;

}
