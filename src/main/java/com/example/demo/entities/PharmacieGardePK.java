package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Embeddable;


@Embeddable
public class PharmacieGardePK implements Serializable {

	
	private long pharmacie;
	private long garde;
	private Date dateDebut;

	public long getPharmacie() {
		return pharmacie;
	}

	public void setPharmacie(long pharmacie) {
		this.pharmacie = pharmacie;
	}

	public long getGarde() {
		return garde;
	}

	public void setGarde(long garde) {
		this.garde = garde;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public PharmacieGardePK() {
		super();
	}
	



}
