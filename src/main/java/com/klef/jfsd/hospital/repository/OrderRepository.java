package com.klef.jfsd.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.klef.jfsd.hospital.model.MedicineOrders;

import jakarta.transaction.Transactional;

public interface OrderRepository extends JpaRepository<MedicineOrders, Integer>{

      @Query("update  MedicineOrders b set b.id=?1 where b.status=?2 ")
      @Modifying //DML 
      @Transactional  //To enable auto commit
      public int updatestatus(int id,String status);
  
      @Query("select d from MedicineOrders d where d.status='ACCEPTED'")
    public List<MedicineOrders> viewallapprovedorders();
}