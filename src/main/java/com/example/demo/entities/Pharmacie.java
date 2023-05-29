package com.example.demo.entities;




import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity

public class Pharmacie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private double laltitude;
	private double longitude;
	private String photo;
	private boolean fav;
	
	public boolean isFav() {
		return fav;
	}

	public void setFav(boolean fav) {
		this.fav = fav;
	}

	@ManyToOne
	@JsonBackReference
	private Zone zone;

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

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

	

	public Pharmacie() {
		super();
	}

	public Pharmacie( String nom, double laltitude, double longitude, String photo,  Zone zone,boolean f) {
		super();
		this.nom = nom;
		this.laltitude = laltitude;
		this.longitude = longitude;
		this.photo = photo;
		this.zone = zone;
		this.fav = f;
	}

	@Override
	public String toString() {
		return "Pharmacie [id=" + id + ", nom=" + nom + ", laltitude=" + laltitude + ", longitude=" + longitude
				+ ", photo=" + photo + ", zone=" + zone +  ", favorie=" + fav + "]";
	}
	
	
	
	


}
