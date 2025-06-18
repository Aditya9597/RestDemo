package com.spingboot.rest_demo1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cloud_vendor_info")
//@Table(name="CLOUD_VENDOR_INFO")
public class CloudVendor {
	@Id
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private long vendorPhoneNumber;

	public CloudVendor() {
		// empty constructor
	}

	public CloudVendor(String vendorId, String vendorName, String vendorAddress, long vendorPhoneNumber) // constructor
	{
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhoneNumber = vendorPhoneNumber;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
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
