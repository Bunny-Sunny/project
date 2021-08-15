package com.app.exception;

public class BusinessException extends Exception{
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BusinessException() {
		super();
	}
    
	public void BussinessException(String message) {
		super(message);
		
	}
}
