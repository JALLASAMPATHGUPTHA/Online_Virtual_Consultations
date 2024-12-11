package com.klef.jfsd.hospital.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pharmacist")
public class Pharmacist 
{
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 @Column(name="pr_id")
	 private int id;
	 @Column(name="pr_name",nullable=false,length = 50)
	 private String name;
	 @Column(name="pr_gender",nullable=false,length = 20)
	 private String gender;
	 @Column(name="pr_dob",nullable=false,length = 20)
	 private String dateofbirth;
	 @Column(name="pr_salary",nullable=false)
	 private double salary;
	 @Column(name="pr_email",nullable=false,unique = true,length = 50)
	 private String email;
	 @Column(name="pr_password",nullable=false,length = 50)
	 private String password;
	 @Column(name="pr_location",nullable=false,length=50)
	 private String location;
	 @Column(name="pr_contact",nullable=false,length = 20)
	 private String contact;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

}
