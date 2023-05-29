package com.example.demo.entities;



import javax.persistence.*;


@Entity
public class Garde {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Garde() {
		super();
	}

	public Garde(Long gardeId) {
		// TODO Auto-generated constructor stub
	}

	

	
}
