package com.klef.jfsd.hospital.service;

import java.util.List;

import com.klef.jfsd.hospital.model.Admin;
import com.klef.jfsd.hospital.model.Doctor;
import com.klef.jfsd.hospital.model.Patient;
import com.klef.jfsd.hospital.model.Pharmacist;

public interface AdminService 
{
 
   public Admin checkadminlogin(String uname,String pwd);
   
  public String adddoctor(Doctor dr);
  public String addpharmacist(Pharmacist pr);
  
  public List<Doctor> displayallDoctors();
  public List<Patient> viewAllPatients();
  public List<Pharmacist>displayallPharmacist();
   
   
   public Doctor displayDoctorByID(int eid);
   public Patient displayPatientByID(int eid);
   public Pharmacist displayPharmacistByID(int eid);
   
   
   
   public String deletedr(int eid);
   public String deletepat(int eid);
   public String deletept(int eid);
   
   
   //public String updatedoctorstatus(String status,int eid);
   
   
   
   public Long drcount();
   public Long prcount();
   public Long ptcount();
   public List<Object[]> bookedAppointcount();
   
   
   
   
}