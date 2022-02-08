package org.N26.PetStoreApiAutomation.requestModel;

import org.N26.PetStoreApiAutomation.petRequestModel.BaseRequestModel;



public class CreateWithListRequestModel extends BaseRequestModel {
	
	
	CreateUserRequestModel[] createUserReq;

	public CreateUserRequestModel[] getCreateUserReq() {
		return createUserReq;
	}

	public void setCreateUserReq(CreateUserRequestModel[] createUserReq) {
		this.createUserReq = createUserReq;
	}
	

}
