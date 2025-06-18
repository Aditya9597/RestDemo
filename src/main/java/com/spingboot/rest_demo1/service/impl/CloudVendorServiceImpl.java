package com.spingboot.rest_demo1.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spingboot.rest_demo1.exception.CloudVendorNotFoundException;
import com.spingboot.rest_demo1.model.CloudVendor;
import com.spingboot.rest_demo1.repository.CloudVendorRepositary;
import com.spingboot.rest_demo1.service.CloudVendorService;

@Service //mandatory annotation to know its service layer
public class CloudVendorServiceImpl implements CloudVendorService {

	CloudVendorRepositary cloudVendorRepository;
	
	public CloudVendorServiceImpl(CloudVendorRepositary cloudVendorRepository) {
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Successfully Created";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		
		cloudVendorRepository.save(cloudVendor);
		
		return "Successfully Updated";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Successfully deleted";
	}

	@Override
	public CloudVendor getCLoudVendor(String cloudVendorId) {
		if(cloudVendorRepository.findById(cloudVendorId).isEmpty())
			throw new CloudVendorNotFoundException("Requested cloud vendor does not exist");
		
			return cloudVendorRepository.findById(cloudVendorId).get();
		
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {

		return cloudVendorRepository.findAll();
	}
	

}
