package com.abc.springrest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloudvendor_info")
public class CloudVendor {

    @Id
    private String CloudVendorId;

    private String CloudVendorName;
    private String CloudVendorAddress;


    public CloudVendor(String cloudVendorName, String cloudVendorAddress, String cloudVendorId) {
        CloudVendorName = cloudVendorName;
        CloudVendorAddress = cloudVendorAddress;
        CloudVendorId = cloudVendorId;
    }

    public CloudVendor() {
    }


    public String getCloudVendorName() {
        return CloudVendorName;
    }

    public void setCloudVendorName(String cloudVendorName) {
        CloudVendorName = cloudVendorName;
    }

    public String getCloudVendorAddress() {
        return CloudVendorAddress;
    }

    public void setCloudVendorAddress(String cloudVendorAddress) {
        CloudVendorAddress = cloudVendorAddress;
    }

    public String getCloudVendorId() {
        return CloudVendorId;
    }

    public void setCloudVendorId(String cloudVendorId) {
        CloudVendorId = cloudVendorId;
    }
}
