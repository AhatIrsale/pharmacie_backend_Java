package com.example.demo.entities;

import java.io.Serializable;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;


@Embeddable
public class PharmacieGardePK implements Serializable {

	
	private int garde_id;
	private int pharmacie_id;

	public int getGarde_id() {
		return garde_id;
	}

	public void setGarde_id(int garde_id) {
		this.garde_id = garde_id;
	}

	public int getPharmacie_id() {
		return pharmacie_id;
	}

	public void setPharmacie_id(int pharmacie_id) {
		this.pharmacie_id = pharmacie_id;
	}
	



}
