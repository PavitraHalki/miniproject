package com.cg.ems.dao;

import java.util.List;

import com.cg.ems.exception.EMSException;
import com.cg.ems.model.LeaveHistory;


public interface IEmployeeDao {

	boolean applyForLeave(LeaveHistory leaveHistory) throws EMSException;

	LeaveHistory modifyLeaveStatus(String mgrId);

	
}
