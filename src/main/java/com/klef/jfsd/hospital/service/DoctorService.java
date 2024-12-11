package com.klef.jfsd.hospital.service;

import java.util.List;

import com.klef.jfsd.hospital.model.BookAppointment;
import com.klef.jfsd.hospital.model.Doctor;
import com.klef.jfsd.hospital.model.Prescription;

public interface DoctorService {

public Doctor checkdoctorlogin(String email,String password);
public String updatedoctorprofile(Doctor o);

public List<BookAppointment> viewallBookedAppointments(String doctorname);
public int updateconsultantstatus(int id,String status);
public List<BookAppointment> viewallApprovedAppointments(String doctorname);
public String addprescription(Prescription p);
public Long getPendingAppointments(String doctorname);
public Long getAcceptedAppointments(String doctorname);

}