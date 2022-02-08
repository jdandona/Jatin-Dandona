package org.N26.PetStoreApiAutomation.StoreApiHelper;

import org.N26.PetStoreApiAutomation.PrepareRequest.APIhelper;

import org.N26.PetStoreApiAutomation.PrepareRequest.placeOrderHeader;

import org.N26.PetStoreApiAutomation.requestModel.PlaceOrderRequestModel;

import org.N26.PetStoreApiAutomation.responseModel.PlaceOrderResponseModel;

public class PlaceOrderHelper extends APIhelper {

	public PlaceOrderHelper() {
		apiheader = new placeOrderHeader();
	}

	/*
	 * public <T extends BaseResponseModel> T sendRequest(Class<T>
	 * responseModelclass, BaseRequestModel requestModel) { if (requestModel
	 * instanceof PlaceOrderRequestModel) { placeOrderResponseModel =
	 * postRequest(request, requestModel).getBody().as(responseModelclass); return
	 * placeOrderResponseModel; } else return null; }
	 */

	/*
	 * @Override public PlaceOrderResponseModel getResponseModel() { return
	 * placeOrderResponseModel; }
	 */

	public boolean matchRequestAndResponse(PlaceOrderRequestModel placeOrderRequestModel,
			PlaceOrderResponseModel placeOrderResponseModel) {
		if (placeOrderRequestModel.getId() == placeOrderResponseModel.getId()
				&& placeOrderRequestModel.getPetId() == placeOrderResponseModel.getPetId()
				&& placeOrderRequestModel.getQuantity() == placeOrderResponseModel.getQuantity()
				&& placeOrderRequestModel.getStatus().equals(placeOrderResponseModel.getStatus())) {
			return true;
		}

		else
			return false;
	}

	

}
