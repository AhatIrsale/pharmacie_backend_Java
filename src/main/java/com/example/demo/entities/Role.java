package com.example.demo.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
public class Role {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 @Column(nullable = false, length = 45)
	 private String name;
	 public Role() { }
	 
	 public Role(String name) {
	        this.name = name;
	    }
	 @ManyToMany(mappedBy = "roles")
	 private Set<Utilisateur> users = new HashSet<>();
	 public Role(Long id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	 
	 public Role(Long id) {
	        this.id = id;
	    }
	     
	 
	    @Override
	    public String toString() {
	        return this.name;
	    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Set<Utilisateur> getUtilisateurs() {
			return users;
		}
		public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
			this.users = utilisateurs;
		}
		
		

}
