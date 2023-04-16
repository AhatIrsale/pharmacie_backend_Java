package com.example.demo.entities;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Ville {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nom;
	@OneToMany(mappedBy = "ville", fetch = FetchType.EAGER)
	private List<Zone> zones;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Ville(Long id, String nom, List<Zone> zones) {
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
