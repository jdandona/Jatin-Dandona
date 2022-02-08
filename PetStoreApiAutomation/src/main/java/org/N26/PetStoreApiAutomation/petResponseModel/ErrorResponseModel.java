package org.N26.PetStoreApiAutomation.petResponseModel;

import org.N26.PetStoreApiAutomation.responseModel.BaseResponseModel;


public class ErrorResponseModel extends BaseResponseModel {
	
	
	private int code;
	
	
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


	private String message;

}
