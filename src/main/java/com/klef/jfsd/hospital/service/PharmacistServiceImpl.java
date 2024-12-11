package com.klef.jfsd.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.hospital.model.MedicineOrders;
import com.klef.jfsd.hospital.model.Pharmacist;
import com.klef.jfsd.hospital.repository.OrderRepository;
import com.klef.jfsd.hospital.repository.PharmacistRepository;

@Service
public class PharmacistServiceImpl implements PharmacistService {

    @Autowired
    private PharmacistRepository pharmacistrepo;

    @Autowired
    private OrderRepository medicinerepo;

    @Override
    public Pharmacist checkpharmacistlogin(String email, String pwd) {
        return pharmacistrepo.checkpharmacistlogin(email, pwd);
    }

    @Override
    public List<MedicineOrders> viewallorders() {
        return medicinerepo.findAll();  // Returns a list of all MedicineOrders
    }

    @Override
    public int updateorderstatus(int id, String status) {
        return medicinerepo.updatestatus(id, status);  // Updates the status of the order
    }

  @Override
  public List<MedicineOrders> viewallApprovedorders() {
    return medicinerepo.viewallapprovedorders();
  }
}