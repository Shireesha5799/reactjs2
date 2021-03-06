package com.cg.bmd.exception;

public class PatientException extends Exception {

	private static final long serialVersionUID = 1L;

	private String message;

	public PatientException(String msg) {
		super(msg);
		this.message=msg;
	}

	public String getMessage() {
		return message;
	}

}
