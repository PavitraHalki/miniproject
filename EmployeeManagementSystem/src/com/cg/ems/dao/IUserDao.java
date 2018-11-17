package com.cg.ems.dao;

import com.cg.ems.exception.EMSException;
import com.cg.ems.model.UserMaster;

public interface IUserDao {

	UserMaster getUserByName(String userName) throws EMSException;
}
