package com.spingboot.rest_demo1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spingboot.rest_demo1.model.CloudVendor;

public interface CloudVendorRepositary extends JpaRepository<CloudVendor, String> {
	List<CloudVendor> findByVendorName(String vendorName);
	

}
