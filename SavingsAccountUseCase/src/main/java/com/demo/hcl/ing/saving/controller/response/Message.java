package com.demo.hcl.ing.saving.controller.response;

/**
 * @author User1
 *
 *	holds the status code and message returned by controller 
 */
public class Message {

	private String statusCode;
	private String message;
	
	public Message() {
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
