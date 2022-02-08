package org.N26.PetStoreApiAutomation.Tests;

import java.util.HashMap;
import java.util.Map;

import org.N26.PetStoreApiAutomation.PrepareRequest.APIhelper;
import org.N26.PetStoreApiAutomation.PrepareRequest.ApiUrlConstants;
import org.N26.PetStoreApiAutomation.StoreApiHelper.DeleteOrderHelper;
import org.N26.PetStoreApiAutomation.StoreApiHelper.FindOrderHelper;
import org.N26.PetStoreApiAutomation.StoreApiHelper.PlaceOrderHelper;
import org.N26.PetStoreApiAutomation.StoreApiHelper.StoreInventoryHelper;
import org.N26.PetStoreApiAutomation.requestModel.PlaceOrderRequestModel;
import org.N26.PetStoreApiAutomation.responseModel.FindOrderResponseModel;
import org.N26.PetStoreApiAutomation.responseModel.PlaceOrderResponseModel;
import org.N26.PetStoreApiAutomation.responseModel.StoreInventoryResponseModel;
import org.N26.PetStoreApiAutomation.utilities.DateUtil;
import org.apache.commons.lang3.RandomUtils;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import io.restassured.response.Response;

public class PlaceAndDeleteOderFromInventory {

	private APIhelper storeInventoryHelper;
	private APIhelper placeOrderHelper;
	private APIhelper findOrderHelper;
	private APIhelper deleteOrderHelper;

	private PlaceOrderRequestModel placeOrderRequestModel;
	
	
	private StoreInventoryResponseModel storeInventoryResponseModel;
	private PlaceOrderResponseModel placeOrderResponseModel;
	private FindOrderResponseModel findOrderResponseModel;

	private Response response;

	@BeforeClass
	public void executeBeforeClass() {
		storeInventoryHelper = new StoreInventoryHelper();
		placeOrderHelper = new PlaceOrderHelper();
		placeOrderRequestModel = new PlaceOrderRequestModel();
		findOrderHelper = new FindOrderHelper();
		deleteOrderHelper = new DeleteOrderHelper();
	}

	@Test
	public void checkStoreInventory_WhenUser_Placed_NewOrder_Then_Delete_TheOrder() {
		int quantity = 10;
		String status = "delivered";
		long id = RandomUtils.nextInt(100, 9000);
		long petId = id;
		
		response = storeInventoryHelper.sendRequest(ApiUrlConstants.storeInventory);
		Assert.assertEquals(response.getStatusCode(), 200, "Request was OK");

		storeInventoryResponseModel = storeInventoryHelper.getMappedResponseModel(response,
				StoreInventoryResponseModel.class);

		placeOrderRequestModel.setId(id);
		placeOrderRequestModel.setPetId(petId);
		placeOrderRequestModel.setQuantity(quantity);
		placeOrderRequestModel.setShipDate(DateUtil.getCurrentDateTime());
		placeOrderRequestModel.setStatus(status);
		placeOrderRequestModel.setComplete(true);

		response = placeOrderHelper.sendRequest(placeOrderRequestModel, ApiUrlConstants.placeOrder);
		Assert.assertEquals(response.getStatusCode(), 200, "Request was OK");
		placeOrderResponseModel = placeOrderHelper.getMappedResponseModel(response, PlaceOrderResponseModel.class);

		Assert.assertTrue(((PlaceOrderHelper) placeOrderHelper).matchRequestAndResponse(placeOrderRequestModel,
				placeOrderResponseModel), "Placed order request body and respose mody doesn't match");
		Reporter.log("Object matches with common properties", true);

		response = storeInventoryHelper.sendRequest(ApiUrlConstants.storeInventory);
		Assert.assertEquals(response.getStatusCode(), 200, "Request was OK");

		int newQuantity = storeInventoryHelper.getMappedResponseModel(response, StoreInventoryResponseModel.class)
				.getdelivered();

		Assert.assertEquals(storeInventoryResponseModel.getdelivered() + quantity, newQuantity,
				"Quantity doesn't match after placing the order");
		Reporter.log("Quantity matched after placing the order", true);

		Map<String, Long> findOrderReq = new HashMap<String, Long>();

		findOrderReq.put("orderId", placeOrderRequestModel.getId());

		response = findOrderHelper.sendRequest(ApiUrlConstants.findOrder, findOrderReq);
		Assert.assertEquals(response.getStatusCode(), 200, "Request was not OK");
		
		findOrderResponseModel = findOrderHelper.getMappedResponseModel(response, FindOrderResponseModel.class);
		Assert.assertTrue(((FindOrderHelper) findOrderHelper).matchRequestAndResponse(findOrderResponseModel,
				placeOrderResponseModel), "Find order  doesn't match");
		Reporter.log("Newly Placed order Found", true);
		
		
		response = deleteOrderHelper.delRequest(ApiUrlConstants.deleteOrder, findOrderReq);
		Assert.assertEquals(response.getStatusCode(), 200, "Request was not OK");
		
		response = findOrderHelper.sendRequest(ApiUrlConstants.findOrder, findOrderReq);
		Assert.assertEquals(response.getStatusCode(), 404, "Order Found: Order not deleted");
		Reporter.log("Order deleted Successfully", true);
		
		

	}

}
