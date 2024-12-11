package com.klef.jfsd.hospital.model;

import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reports_table")
public class AddReports 
{
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="report_id")
	  private int id;
	  @Column(name="report_image",nullable = false)
	  private byte[] image; // blob - binary large object
	  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
}
