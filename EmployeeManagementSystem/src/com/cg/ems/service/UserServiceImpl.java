package com.cg.ems.service;

import com.cg.ems.dao.IUserDao;
import com.cg.ems.dao.UserDaoImpl;
import com.cg.ems.exception.EMSException;
import com.cg.ems.model.UserMaster;



public class UserServiceImpl implements IUserService{

	private IUserDao dao = new UserDaoImpl();
	
	@Override
	public String getRole(String unm, String pwd) throws EMSException {
		String role=null;
		UserMaster user = dao.getUserByName(unm);
		if(user==null)
			throw new EMSException("No Such UserName");
		else if(!pwd.equals(user.getUserPassword()))
			throw new EMSException("Password Mismatch");
		else
			role=user.getUserType();
		return role;
	}

}
