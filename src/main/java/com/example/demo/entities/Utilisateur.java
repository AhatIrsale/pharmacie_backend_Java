package com.example.demo.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Utilisateur {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(nullable = false, unique = true, length = 45)
		private String email;
		
		@Column(nullable = false, length = 64)
		private String password;
		
		@Column(name = "first_name", nullable = false, length = 20)
		private String firstName;
		
		@Column(name = "last_name", nullable = false, length = 20)
		private String lastName;
		
		@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		@JoinTable(
		    name = "user_roles",
		    joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
		    inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id") )
		
		private Set<Role> roles = new HashSet<>();
		
		@JsonIgnore
		@OneToMany(mappedBy = "user")
		private List<Pharmacie> pharmacies;
		
		 public void addRole(Role role) {
		        this.roles.add(role);
		}
		 
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
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
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public Set<Role> getRoles() {
			return roles;
		}
		public void setRoles(Set<Role> roles) {
			this.roles = roles;
		}
		public List<Pharmacie> getPharmacies() {
			return pharmacies;
		}
		public void setPharmacies(List<Pharmacie> pharmacies) {
			this.pharmacies = pharmacies;
		}
		
		
	

}
