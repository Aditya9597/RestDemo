package com.spingboot.rest_demo1.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spingboot.rest_demo1.model.CloudVendor;
import com.spingboot.rest_demo1.response.ResponseHandler;
import com.spingboot.rest_demo1.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	
	CloudVendorService cloudVendorService;
	
public CloudVendorController(CloudVendorService cloudVendorService) {
		
		this.cloudVendorService = cloudVendorService;
	}
	
	//read specific cloud vendor details by provided id
	@GetMapping("{vendorId}")
	public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
	{
		return ResponseHandler.responseBuilder("Requested Vendor details are provided", HttpStatus.OK,
				cloudVendorService.getCLoudVendor(vendorId));	 
	}
	
	// get all cloud vendor details
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails(){		
		return cloudVendorService.getAllCloudVendors();
		 
	}
		
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.createCloudVendor(cloudVendor);
		return "Cloud Vendor Created";
	}
	
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.updateCloudVendor(cloudVendor);
		return "Cloud Vendor Updated";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable("vendorId")String vendorId) {
		cloudVendorService.deleteCloudVendor(vendorId);
		return "Cloud Vendor Deleted";
	}
}