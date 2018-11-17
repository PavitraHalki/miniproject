package com.cg.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.cg.ems.exception.EMSException;
import com.cg.ems.model.UserMaster;
import com.cg.ems.util.ConnectionProvider;


public class UserDaoImpl implements IUserDao{

	private Logger log = Logger.getLogger("UserDAO");
	Connection connection=null;
	PreparedStatement statement=null;
	@Override
	public UserMaster getUserByName(String userName) throws EMSException {
		UserMaster user = null;
		try{
				connection = ConnectionProvider.getConnection();
				PreparedStatement st = connection.prepareStatement(IQueryMapper.GET_USER);
			{
			
			st.setString(1, userName);
			
			ResultSet rs = st.executeQuery();
			if(rs.next()){
				user = new UserMaster();
				user.setUserName(rs.getString(1));
				user.setUserPassword(rs.getString(2));
				user.setUserType(rs.getString(3));
			}
		}
		}catch (SQLException e) {
			log.error(e);
			throw new EMSException("Unable To FEtch Records");
		}
		return user;
	}

	
}
