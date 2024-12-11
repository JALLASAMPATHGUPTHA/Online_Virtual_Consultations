package com.klef.jfsd.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.hospital.model.AddReports;

@Repository
public interface AddReportsRepository extends JpaRepository<AddReports, Integer>
{

}
