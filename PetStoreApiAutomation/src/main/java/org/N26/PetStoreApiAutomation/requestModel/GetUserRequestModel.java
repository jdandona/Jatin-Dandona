package org.N26.PetStoreApiAutomation.requestModel;

import org.N26.PetStoreApiAutomation.petRequestModel.BaseRequestModel;

public class GetUserRequestModel extends BaseRequestModel {

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String username;
}
