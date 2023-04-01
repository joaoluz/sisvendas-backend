package com.sisvenda.exception;

import java.util.List;

public class ErrorResponse {

	private final String message;
    private final int code;
    private final String status;
    private final String objectName;
    private final List<ObjectError> errors;
    
    public ErrorResponse(String message, int code, String status, String objectName2, List<ObjectError> errors2) {
    	this.message = message;
    	this.code = code;
    	this.status = status;
    	this.objectName = objectName2;
    	this.errors = errors2;
	}
    
	public String getMessage() {
		return message;
	}
	public int getCode() {
		return code;
	}
	public String getStatus() {
		return status;
	}
	public String getObjectName() {
		return objectName;
	}
	public List<ObjectError> getErrors() {
		return errors;
	}
}