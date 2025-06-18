package com.spingboot.rest_demo1.service;

import java.util.List;

import com.spingboot.rest_demo1.model.CloudVendor;

public interface CloudVendorService {
	
	public String createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public String deleteCloudVendor(String cloudVendorId);
	public CloudVendor getCLoudVendor(String cloudVendorId);
	public List<CloudVendor> getAllCloudVendors();
}
