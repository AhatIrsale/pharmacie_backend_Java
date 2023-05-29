package com.example.demo.entities;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity

public class Ville {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String nom;
	@OneToMany(mappedBy = "ville", fetch = FetchType.EAGER)
	@JsonManagedReference
	private List<Zone> zones;

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

	public List<Zone> getZones() {
		return zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}

	public Ville() {
		super();
	}

	public Ville(int id, String nom, List<Zone> zones) {
		super();
		this.id = id;
		this.nom = nom;
		this.zones = zones;
	}

	@Override
	public String toString() {
		return "Ville [id=" + id + ", nom=" + nom + ", zones=" + zones + "]";
	}

}
