package com.abc.springrest.controller;

import com.abc.springrest.model.CloudVendor;
import com.abc.springrest.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

//    CloudVendor cloudVendor;  // cloudVendor object for temporary API calls

    CloudVendorService cloudVendorService; // this service class will save the API resources into database

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

   @GetMapping("/{vendorId}")
   public CloudVendor getCloudVendorList(@PathVariable("vendorID") String vendorId){
       return cloudVendorService.getCloudVendor(vendorId);
   }

    @GetMapping()
    public List<CloudVendor> getAllCloudVendorList(String vendorId){
        return cloudVendorService.getAllCloudVendors();
    }

   @PostMapping()
   public String postCloudVendor(@RequestBody CloudVendor cloudVendor){
       System.out.println("Received CloudVendor: " + cloudVendor.getCloudVendorId());
       cloudVendorService.createCloudVendor(cloudVendor);
       return "Vendor added successfully";
   }


   @PutMapping
   public String putCloudVendor(@RequestBody CloudVendor cloudVendor){
       cloudVendorService.updateCloudVendor(cloudVendor);
        return "Vendor updated successfully";
   }

   @DeleteMapping()
    public String deleteCloudVendor(@PathVariable("vendorID") String vendorId){
       cloudVendorService.deleteCloudVendor(vendorId);
       return "Vendor deleted successfully";
   }


}
