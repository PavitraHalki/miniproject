package com.cg.ems.exception;

public class EMSException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2744133682239333703L;
	private String message;

	public String getMessage() {
		return message;
	}

	public EMSException(String message) {
		super();
		this.message = message;
	}
	

}
