package org.N26.PetStoreApiAutomation.PrepareRequest;

import java.util.Map;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.specification.RequestSpecification;

public interface ApiHeader {
	
	RequestSpecification setHeader();

}
