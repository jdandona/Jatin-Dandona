package org.N26.PetStoreApiAutomation.PrepareRequest;

import java.util.Map;


import org.N26.PetStoreApiAutomation.petRequestModel.BaseRequestModel;
import org.N26.PetStoreApiAutomation.responseModel.BaseResponseModel;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public abstract class APIhelper {

	protected ApiHeader apiheader;
	

	public APIhelper() {
		RestAssured.baseURI = ApiUrlConstants.BASE_URL;
	}

	// This method dedicated to all those GET request which do not have any path or
	// query param
	public <T extends BaseResponseModel> Response sendRequest(String basePath) {
		RequestSpecification request = apiheader.setHeader();
		request.basePath(basePath);
		return getRequest(request);
	}

	public <T extends BaseResponseModel> Response delRequest( String basePath,
			Map<String, ?> parametersMap) {
		RequestSpecification request = apiheader.setHeader();
		return delRequest(request, parametersMap,basePath);
	}
	
	public <T extends BaseResponseModel> Response sendRequest( String basePath,
			Map<String, ?> parametersMap) {
		RequestSpecification request = apiheader.setHeader();
		return getRequestByPathParam(request, parametersMap,basePath);
	}

	public <K extends BaseRequestModel> Response sendRequest(K requestModel, String basePath) {
		RequestSpecification request = apiheader.setHeader();
		request.basePath(basePath);
		return postRequest(request, requestModel);
	}

	// void setURI();

	// public abstract <T extends BaseRequestModel> T getRequestModel();
	//public abstract <T extends BaseResponseModel> T getResponseModel();

	protected <T extends BaseRequestModel> Response postRequest(RequestSpecification request, T requestModel) {
		return request.body(requestModel).log().all().when().post();

	}

	public <T extends BaseResponseModel> T getMappedResponseModel(Response response, Class<T> responseModel) {
		return response.getBody().as(responseModel);
	}

	protected Response getRequest(RequestSpecification request, Map<String, ?> parametersMap, String uri) {
		return request.queryParams(parametersMap).log().all().get(uri);
	}

	protected Response getRequest(RequestSpecification request) {
		return request.log().all().when().get();
	}

	protected Response getRequestByPathParam(RequestSpecification request, Map<String, ?> parametersMap,String path) {
		return request.log().all().when().get(path, parametersMap);
	}
	
	protected Response delRequest(RequestSpecification request,Map<String, ?> parametersMap,String path) {
		return request.log().all().when().delete(path, parametersMap);
	}
	

}
