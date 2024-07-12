package com.think.rest_demos.model;

public class CloudVendor {
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private long vendorPhoneNumber;
	
	
	public CloudVendor() {
		
	}
	
	public CloudVendor(String vendorId, String vendorName,String vendorAddress,long vendorPhoneNumber){
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhoneNumber = vendorPhoneNumber ;
		
	}
	
	
	public String getVendorName() {
		return vendorName;
	}
	

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}


	public String getVendorId() {
		return vendorId;
	}


	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}


	public String getVendorAddress() {
		return vendorAddress;
	}


	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}


	public long getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}


	public void setVendorPhoneNumber(long vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	

}
