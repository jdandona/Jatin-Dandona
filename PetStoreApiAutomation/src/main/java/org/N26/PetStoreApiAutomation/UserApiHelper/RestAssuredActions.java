package org.N26.PetStoreApiAutomation.UserApiHelper;

import java.util.Map;

import org.N26.PetStoreApiAutomation.petRequestModel.BaseRequestModel;
import org.N26.PetStoreApiAutomation.responseModel.BaseResponseModel;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredActions {

	protected <T extends BaseRequestModel> Response postRequest(RequestSpecification request, T requestModel) {
		return request.body(requestModel).log().all().when().post();

	}

	protected <T extends BaseResponseModel> T getMappedResponseModel(Response response, Class<T> responseModel) {
		return response.getBody().as(responseModel);
	}

	protected  Response getRequest(RequestSpecification request, Map<String,?> parametersMap,String uri){
		return request.queryParams(parametersMap).log().all().get(uri);			
	}
	
	protected  Response getRequest(RequestSpecification request,String uri){
		return request.log().all().get(uri);			
	}
	

}
