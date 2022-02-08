package org.N26.PetStoreApiAutomation.petRequestModel;



public class UpdatePetRequestModel extends BaseRequestModel {
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String[] getPhotoUrls() {
		return photoUrls;
	}


	public void setPhotoUrls(String[] photoUrls) {
		this.photoUrls = photoUrls;
	}


	public tags[] getTags() {
		return tags;
	}


	public void setTags(tags[] tags) {
		this.tags = tags;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public category getCategory() {
		return category;
	}


	public void setCategory(category category) {
		this.category = category;
	}


	private long id;
	
	
	private String name;
	
	
	private String photoUrls[];
	
	
	
	private tags[] tags;
	
	
	private String status;
	
	
	private category category;

}
