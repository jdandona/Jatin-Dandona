package org.N26.PetStoreApiAutomation.StoreApiHelper;

import org.N26.PetStoreApiAutomation.PrepareRequest.APIhelper;
import org.N26.PetStoreApiAutomation.PrepareRequest.CommonHeader;
import org.N26.PetStoreApiAutomation.responseModel.FindOrderResponseModel;
import org.N26.PetStoreApiAutomation.responseModel.PlaceOrderResponseModel;

public class FindOrderHelper extends APIhelper {
	
	public FindOrderHelper() {
		apiheader = new CommonHeader();
		
	}
	
	
	public boolean matchRequestAndResponse(FindOrderResponseModel findOrderResponseModel,
			PlaceOrderResponseModel placeOrderResponseModel) {
		if (findOrderResponseModel.getId() == placeOrderResponseModel.getId()
				&& findOrderResponseModel.getPetId() == placeOrderResponseModel.getPetId()
				&& findOrderResponseModel.getQuantity() == placeOrderResponseModel.getQuantity()
				&& findOrderResponseModel.getStatus().equals(placeOrderResponseModel.getStatus())) {
			return true;
		}

		else
			return false;

	}

}
