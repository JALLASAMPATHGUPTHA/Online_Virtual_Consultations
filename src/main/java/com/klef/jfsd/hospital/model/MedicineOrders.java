package com.klef.jfsd.hospital.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="medicineorder_table")
public class MedicineOrders {
  
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY) 
     @Column(name="order_id")
     private int id;
     
     @Column(name="order_email",nullable=false,length = 50)
     private String email;
     
   

    @Column(name="order_department",nullable=false,length = 30)
     private String department;
     
     @Column(name="order_medicine",nullable=false,length = 1000)
     private String medicine;
     
     @Column(name="order_status",nullable=false,length = 1000)
     private String status;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  

  public String getMedicine() {
    return medicine;
  }

  public void setMedicine(String medicine) {
    this.medicine = medicine;
  }
    public String getDepartment() {
      return department;
    }

    public void setDepartment(String department) {
      this.department = department;
    }
   
  
}