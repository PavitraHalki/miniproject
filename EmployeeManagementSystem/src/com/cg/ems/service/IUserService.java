package com.cg.ems.service;

import com.cg.ems.exception.EMSException;



public interface IUserService {
	String getRole(String unm,String pwd) throws EMSException;
}
