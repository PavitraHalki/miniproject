package com.cg.ems.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





import com.cg.ems.exception.EMSException;
import com.cg.ems.model.LeaveHistory;
import com.cg.ems.util.ConnectionProvider;


public class EmployeeDaoImpl implements IEmployeeDao {

	Connection connection=null;
	PreparedStatement statement=null;
	@Override
	public boolean applyForLeave(LeaveHistory leaveHistory) throws EMSException {
		System.out.println("dao"+leaveHistory.getEmpId());
		
		int balance=getLeaveBalance(leaveHistory.getEmpId());
	
   connection = ConnectionProvider.getConnection();
		
		boolean flag=false;
		try
		{
			
			statement=connection.prepareStatement(IQueryMapper.applyLeave);
	
			statement.setString(1,leaveHistory.getEmpId());
			statement.setInt(1,balance);
			statement.setLong(2,leaveHistory.getNoofdays());
			Date dateFrom=new Date(leaveHistory.getDateFrom().getTime());
			statement.setDate(3,dateFrom);
			Date dateTo=new Date(leaveHistory.getDateTo().getTime());
			statement.setDate(4,dateTo);
			statement.setString(5,leaveHistory.getEmpId());
		
			 int result = statement.executeUpdate();
		        
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
	private int getLeaveBalance(String empId) throws EMSException {
		 connection = ConnectionProvider.getConnection();
		 ResultSet resultSet=null;
		 int balance=0;
		 try {
			 
			statement=connection.prepareStatement(IQueryMapper.getLeaveBalance);
			//statement.setString(1,empId);
		
			
		
		 resultSet=statement.executeQuery();
			 
			 resultSet.next();
			 
			balance=resultSet.getInt(1);
		
		} catch (SQLException e) {
			throw new EMSException("statement not created with som problem!!!!!!");
		}
		 finally{
				try {
					resultSet.close();
				} catch (SQLException e) {
					throw new EMSException("problem while closing resulSet");
				}
				try {
					statement.close();
				} catch (SQLException e) {
					throw new EMSException("problem while closing statement");
				}
				ConnectionProvider.closeConnection();
			}
			
		return balance;
	}
	@Override
	public LeaveHistory modifyLeaveStatus(String mgrId) {
		
		return null;
	}
}