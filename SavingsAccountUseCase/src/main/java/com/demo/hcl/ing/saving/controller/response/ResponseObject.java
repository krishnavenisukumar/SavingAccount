package com.demo.hcl.ing.saving.controller.response;

/**
 * @author User1
 *
 *	represent the response return by the controller..
 */
public class ResponseObject {

	private Object object;
	private Message message;
	
	public ResponseObject() {}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
}
