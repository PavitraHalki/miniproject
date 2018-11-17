package com.cg.ems.model;

import java.util.Date;

public class LeaveHistory {

	private int LeaveId;
	private int LeaveBalance;
	private long noofdays;
	private Date dateFrom;
	private Date dateTo;
	private String status;
	private String EmpId;

	public LeaveHistory() {

	}

	public LeaveHistory(int leaveBalance, long noofdays, Date dateFrom,
			Date dateTo, String status, String empId) {
		super();
		LeaveBalance = leaveBalance;
		this.noofdays = noofdays;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.status = status;
		EmpId = empId;
	}


	public LeaveHistory(long noofdays, Date dateFrom, Date dateTo, String empId) {
		super();
		this.noofdays = noofdays;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		EmpId = empId;
	}

	public LeaveHistory(int leaveId, int leaveBalance, int noofdays,
			Date dateFrom, Date dateTo, String status, String empId) {
		super();
		LeaveId = leaveId;
		LeaveBalance = leaveBalance;
		this.noofdays = noofdays;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.status = status;
		EmpId = empId;
	}

	public int getLeaveId() {
		return LeaveId;
	}

	public void setLeaveId(int leaveId) {
		LeaveId = leaveId;
	}

	public int getLeaveBalance() {
		return LeaveBalance;
	}

	public void setLeaveBalance(int leaveBalance) {
		LeaveBalance = leaveBalance;
	}

	public long getNoofdays() {
		return noofdays;
	}

	public void setNoofdays(long noofdays) {
		this.noofdays = noofdays;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	@Override
	public String toString() {
		return "LeaveHistory [LeaveId=" + LeaveId + ", LeaveBalance="
				+ LeaveBalance + ", noofdays=" + noofdays + ", dateFrom="
				+ dateFrom + ", dateTo=" + dateTo + ", status=" + status
				+ ", EmpId=" + EmpId + "]";
	}
	
}
