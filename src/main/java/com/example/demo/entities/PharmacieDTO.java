package com.example.demo.entities;

import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class PharmacieDTO {
	
	private int id;
	private String nom;
	private double laltitude;
	private double longitude;
	private String photo;
	private String zone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getLaltitude() {
		return laltitude;
	}
	public void setLaltitude(double laltitude) {
		this.laltitude = laltitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	
    

	
	    

}
