package com.klef.jfsd.hospital.service;

import java.util.List;

import com.klef.jfsd.hospital.model.BookAppointment;
import com.klef.jfsd.hospital.model.MedicineOrders;
import com.klef.jfsd.hospital.model.Pharmacist;

public interface PharmacistService {

    // Check pharmacist login credentials
    public Pharmacist checkpharmacistlogin(String email, String pwd);

    // View all orders (Pending orders)
    public List<MedicineOrders> viewallorders();
    
    // Update the status of a particular order
    public int updateorderstatus(int id, String status);
    
    public List<MedicineOrders> viewallApprovedorders();
}