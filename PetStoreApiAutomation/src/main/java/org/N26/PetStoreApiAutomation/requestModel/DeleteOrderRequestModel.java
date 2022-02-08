package org.N26.PetStoreApiAutomation.requestModel;

import org.N26.PetStoreApiAutomation.petRequestModel.BaseRequestModel;

public class DeleteOrderRequestModel extends BaseRequestModel {
	
	
	private long orderId;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	} 

}
