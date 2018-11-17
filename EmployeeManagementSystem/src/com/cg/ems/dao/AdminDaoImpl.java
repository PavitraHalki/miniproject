package com.cg.ems.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;



import java.sql.SQLException;

import com.cg.ems.exception.EMSException;
import com.cg.ems.model.Employee;
import com.cg.ems.util.ConnectionProvider;

public class AdminDaoImpl implements IAdminDao{

	
	Connection connection=null;
	PreparedStatement statement=null;
	@Override
	public boolean addEmployee(Employee employee) throws EMSException {
		connection = ConnectionProvider.getConnection();
		
		boolean flag=false;
		try
		{
			statement=connection.prepareStatement(IQueryMapper.insertEmployee);
	
			statement.setString(1,employee.getEmployeeId());
	
			statement.setString(2,employee.getEmpFName());
			statement.setString(3,employee.getEmpLName());
			Date empDob=new Date(employee.getEmpDOB().getTime());
			statement.setDate(4,empDob);
			Date empDoj=new Date(employee.getEmpDOJ().getTime());
			statement.setDate(5,empDoj);
			statement.setInt(6,employee.getDeptId());
			statement.setString(7,employee.getEmpGrade());
			statement.setString(8,employee.getEmpDesignation());
			statement.setInt(9,employee.getEmpBasic());
			statement.setString(10,employee.getEmpGender());
			statement.setString(11,employee.getEmpMStatus());
			statement.setString(12,employee.getHomeAddr());
			statement.setString(13,employee.getEmpCNumber());
			statement.setString(14,employee.getMrgId());
		System.out.println("88888");
           int result = statement.executeUpdate();
        System.out.println("hijshds");
			if(result>0){
				//logger.debug("account created");
				flag=true;
			}
			
			
		} catch (SQLException e) {
/*//			logger.error("statemnt object not created");
*/			throw new EMSException("statement not created with som problem");
		}
		
		return flag;
	}

}
