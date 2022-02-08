package org.N26.PetStoreApiAutomation.responseModel;

public class StoreInventoryResponseModel extends BaseResponseModel {

	private int approved;

	private int placed;

	private int delivered;

	public int getapproved() {
		return approved;
	}

	public int getplaced() {
		return placed;
	}

	public int getdelivered() {
		return delivered;
	}

	public void setapproved(int approved) {
		this.approved = approved;
	}

	public void setplaced(int placed) {
		this.placed = placed;
	}

	public void setdelivered(int delivered) {
		this.delivered = delivered;
	}

}
