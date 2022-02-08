package org.N26.PetStoreApiAutomation.PrepareRequest;

import static io.restassured.RestAssured.given;

import io.restassured.specification.RequestSpecification;

public class placeOrderHeader implements ApiHeader {
	
	public RequestSpecification setHeader() {
		return given().header("accept", "application/json").header("Content-Type", "application/json");
		 
	}
	
	

}
