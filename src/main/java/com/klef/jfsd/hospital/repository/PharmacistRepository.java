package com.klef.jfsd.hospital.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.klef.jfsd.hospital.model.Pharmacist;

@Repository
public interface PharmacistRepository extends  JpaRepository<Pharmacist, Integer>

{
	 @Query("select p from Pharmacist p where p.email=?1 and p.password=?2")
	    public Pharmacist checkpharmacistlogin(String pemail,String ppwd);
}