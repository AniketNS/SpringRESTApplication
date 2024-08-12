package com.abc.springrest.service.impl;

import com.abc.springrest.model.CloudVendor;
import com.abc.springrest.repositoy.CloudVendorRepository;
import com.abc.springrest.service.CloudVendorService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Transactional
    public void addCloudVendor() {
        CloudVendor cloudVendor = new CloudVendor("123", "Vendor Name", "Vendor Address");
        cloudVendorRepository.save(cloudVendor); // Save to database
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Cloud vendor added successfully";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Cloud Vendor updated successfully";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Successfully deleted";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return  cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
