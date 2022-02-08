package org.N26.PetStoreApiAutomation.responseModel;


public class ErrorResponseModel extends BaseResponseModel {
	
	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	private int code;
	
	
	private String message;

}
