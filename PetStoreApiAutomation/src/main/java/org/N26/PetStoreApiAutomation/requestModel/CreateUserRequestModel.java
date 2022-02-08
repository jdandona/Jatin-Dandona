package org.N26.PetStoreApiAutomation.requestModel;

import org.N26.PetStoreApiAutomation.petRequestModel.BaseRequestModel;
import org.N26.PetStoreApiAutomation.responseModel.ErrorResponseModel;



public class CreateUserRequestModel extends BaseRequestModel {

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	public ErrorResponseModel getErrorResponse() {
		return errorResponse;
	}

	public void setErrorResponse(ErrorResponseModel errorResponse) {
		this.errorResponse = errorResponse;
	}

	private long id;

	private String username;

	private String firstName;

	private String lastName;

	private String email;

	private String password;

	private String phone;

	private int userStatus;

	private ErrorResponseModel errorResponse;

}
