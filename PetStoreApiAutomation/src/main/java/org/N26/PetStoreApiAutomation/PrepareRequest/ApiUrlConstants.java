package org.N26.PetStoreApiAutomation.PrepareRequest;

public class ApiUrlConstants {
	
	public static final String BASE_URL = "http://localhost:8080";
	
	public static final String storeInventory = "/api/v3/store/inventory";
	public static final String placeOrder = "/api/v3/store/order";
	public static final String findOrder = "/api/v3/store/order/{orderId}";
	public static final String deleteOrder = "/api/v3/store/order/{orderId}";
}
