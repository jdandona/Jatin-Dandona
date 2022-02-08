package org.N26.PetStoreApiAutomation.PrepareRequest;

import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

import java.util.Map;

public class CommonHeader implements ApiHeader {
	
	
	public RequestSpecification setHeader() {
		return given().header("accept", "application/json");
		 
	}

}
