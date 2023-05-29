package com.example.demo.entities;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import javax.persistence.*;

@Entity
@Table(name = "zone")
public class Zone {
	
		//@JsonUnwrapped
		//@JsonProperty("ville")
		//@ManyToOne(fetch = FetchType.LAZY)
		//@JsonProperty(access = JsonProperty.Access.WRITE_ONLY
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	
	@ManyToOne
	@JoinColumn(name = "ville_id")
	@JsonBackReference
	//@JsonIgnore()
	private Ville ville;
	
	@OneToMany(mappedBy = "zone", fetch = FetchType.EAGER)
	
	@JsonManagedReference
	private List<Pharmacie> pharmacies;
	
	public Zone() {
		super();
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

	

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	@Transient
	public List<Pharmacie> getPharmacies() {
		return pharmacies;
	}

	public void setPharmacies(List<Pharmacie> pharmacies) {
		this.pharmacies = pharmacies;
	}

	
}
