package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Garde;
import com.example.demo.entities.Pharmacie;
import com.example.demo.repository.GardeRepository;
import com.example.demo.repository.PharmaciegardeRepository;
import com.example.demo.services.GardeService;
import com.example.demo.services.PharmacieService;

@RestController
@RequestMapping("api")
public class GardeController {
	
	@Autowired
	  GardeRepository gr;
	@Autowired
	private GardeService gs;
	
	@GetMapping("/gardes")
	public List<Garde> all(){
		return gr.findAll();
	}

}
