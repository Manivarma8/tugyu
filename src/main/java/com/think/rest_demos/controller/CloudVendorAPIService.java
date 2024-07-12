package com.think.rest_demos.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.think.rest_demos.model.CloudVendor;


@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorAPIService{
	CloudVendor cloudVendor;
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) {
//		return new CloudVendor("M1", "Manivarman Surendran", "318/6 West main street Thanjavur", 638051271);
		return cloudVendor;
	}
	
	@PostMapping
	public String createcloudVendorDetails(@RequestBody CloudVendor cloudVendor){
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor Created Successfully";
	}
	
	@PutMapping 
	public String updatecloudVendorDetails(@RequestBody CloudVendor cloudVendor){
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor Update Successfully";
	}
	
	@DeleteMapping("{vendorid}")
	
	public String deleteCloudVendorDetails(String vendorId){
		this.cloudVendor = null;
		return "Cloud Vendor Deleted :) Successfully";
	}
	
	

}
