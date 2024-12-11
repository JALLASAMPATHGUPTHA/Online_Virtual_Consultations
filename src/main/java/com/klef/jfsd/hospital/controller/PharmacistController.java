package com.klef.jfsd.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.hospital.model.BookAppointment;
import com.klef.jfsd.hospital.model.MedicineOrders;
import com.klef.jfsd.hospital.model.Pharmacist;
import com.klef.jfsd.hospital.service.PharmacistService;

@RestController

public class PharmacistController {

    @Autowired
    private PharmacistService pharmacistservice;

    
    // Endpoint for pharmacist login
    @PostMapping("checkpharmacistlogin")
    public Pharmacist checkPharmacistLogin(@RequestBody Pharmacist request) {
        String pemail = request.getEmail();
        String ppwd = request.getPassword();

        // Check login credentials
        Pharmacist pharmacist = pharmacistservice.checkpharmacistlogin(pemail, ppwd);
   
        return pharmacist;

    }

    // Endpoint for fetching all pending orders
    @GetMapping("viewallpendingorders")
    public List<MedicineOrders> viewAllPendingOrders() {
        return pharmacistservice.viewallorders();  // Returns list of MedicineOrders
    }

    // Endpoint for updating the status of an order
    @PostMapping("changeorderstatus")
    public String changeOrderStatus(@RequestParam int id, @RequestParam String status) {
        int result = pharmacistservice.updateorderstatus(id, status);
        if (result == 0) {
            return "failed to updatestatus";
        }
        return "success";
    }
    
    
     @GetMapping("viewallapprovedorders")
     public List<MedicineOrders> viewallapprovedappoint()
     {
     return pharmacistservice.viewallApprovedorders();
     }
}