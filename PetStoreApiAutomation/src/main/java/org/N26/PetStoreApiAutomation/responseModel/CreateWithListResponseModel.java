package org.N26.PetStoreApiAutomation.responseModel;


public class CreateWithListResponseModel extends BaseResponseModel {
	

	 public CreateUserResponseModel[] getCreateWithListRespose() {
		return createWithListRespose;
	}

	public void setCreateWithListRespose(CreateUserResponseModel[] createWithListRespose) {
		this.createWithListRespose = createWithListRespose;
	}

	CreateUserResponseModel[] createWithListRespose;

}
