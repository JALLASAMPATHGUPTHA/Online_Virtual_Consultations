package com.klef.jfsd.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.hospital.model.Admin;
import com.klef.jfsd.hospital.model.Doctor;
import com.klef.jfsd.hospital.model.Patient;
import com.klef.jfsd.hospital.model.Pharmacist;
import com.klef.jfsd.hospital.repository.AdminRepository;
import com.klef.jfsd.hospital.repository.BookAppointmentRepository;
import com.klef.jfsd.hospital.repository.DoctorRepository;
import com.klef.jfsd.hospital.repository.PatientRepository;
import com.klef.jfsd.hospital.repository.PharmacistRepository;

@Service
public class AdminServiceImpl implements AdminService
{
	 @Autowired 
	 private AdminRepository adminRepository;
	 
	 @Autowired
	 private PatientRepository patientRepository;
	 
	 @Autowired
	 private DoctorRepository doctorRepository;
	 
	 @Autowired
	 private PharmacistRepository pharmacistRepository;
	
	 @Autowired
	 private BookAppointmentRepository bookedappointrepo;
	 
	@Override
	public Admin checkadminlogin(String uname, String pwd) {
		
    return adminRepository.checkadminlogin(uname, pwd); 
	}


	@Override
	public String adddoctor(Doctor d) {
		doctorRepository.save(d);
		return "Doctor added successfully";
	}
	
	@Override
	public String addpharmacist(Pharmacist pr) {
		pharmacistRepository.save(pr);
		return "Pharmacist Add Successfully";
	}
	

	@Override
	public Doctor displayDoctorByID(int eid) {
		return doctorRepository.findById(eid).get();
		
	}


	@Override
	public Patient displayPatientByID(int eid) {
		
		return patientRepository.findById(eid).get();
	}
	
	@Override
	public Pharmacist displayPharmacistByID(int eid) {
		
		return pharmacistRepository.findById(eid).get();
	}


	@Override
	public List<Doctor> displayallDoctors() {
		
		return (List<Doctor>) doctorRepository.findAll();
	}


	@Override
	public List<Patient> viewAllPatients() {
		
		System.out.println(patientRepository.findAll());
		return patientRepository.findAll();
		
	}
	
	@Override
	public List<Pharmacist> displayallPharmacist() {
		
		return pharmacistRepository.findAll();
	}


	@Override
	public String deletedr(int eid) {
		doctorRepository.deleteById(eid);
		return "Doctor delete Successfully";
	}


	@Override
	public String deletepat(int eid) {
		patientRepository.deleteById(eid);
		return "Patient Deleted Successfully";
	}

	@Override
	public String deletept(int eid) {
		pharmacistRepository.deleteById(eid);
		return "Pharamacist Deleted Successfully";
	}
	
	@Override
	  public Long drcount() {
	    
	    return doctorRepository.count();
	  }


	  @Override
	  public Long prcount() {
	    
	    return patientRepository.count();
	  }


	  @Override
	  public Long ptcount() {
	    
	    return pharmacistRepository.count();
	  }


	@Override
	public List<Object[]> bookedAppointcount() {
		
		
		return bookedappointrepo.getMonthlyBookings();
	}



}