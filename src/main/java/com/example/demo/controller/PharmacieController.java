package com.example.demo.controller;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Pharmacie;
import com.example.demo.entities.Ville;
import com.example.demo.entities.Zone;
import com.example.demo.repository.PharmacieRepository;
import com.example.demo.repository.VilleRepository;
import com.example.demo.repository.ZoneRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.transaction.Transactional;




@RestController
@RequestMapping("api")
public class PharmacieController  {
	
	@Autowired
	  PharmacieRepository pharmacieRepository;

	@Autowired
	  ZoneRepository zoneRepository;

	@Autowired
	  VilleRepository villeRepository;
	


	
	
	
	@GetMapping("/all")
	public String find(){
		return "hello pharmacie";
	}
	
	
//	@PostMapping("/pharmacies")
//	public List<Pharmacie> findpharmacie(){
//		return pharmacieRepository.findAll();
//	}
	
	@GetMapping("/villes/{ville}/zones")
	public List<Zone> findzones( @PathVariable String ville){
		
		Ville v = villeRepository.findBynom(ville);
		return v.getZones();
		
	}
	
	@PostMapping("/villes/ville/zones/{zone}/pharmacies")
	public List<Pharmacie> findpharmacies( @PathVariable String zone){
		
			Zone z = zoneRepository.findBynom(zone);
			return z.getPharmacies() ;
			
			}
	
	@GetMapping("/villes/{ville}/zones/{zone}/pharmacies")
	public List<Pharmacie> findpharmacieszv( @PathVariable String ville , @PathVariable String zone){
		
			List<Pharmacie> ph = null;
			for (Zone z : this.findzones(ville)) {
				if (z.getNom().equals(zone)) {
					ph = z.getPharmacies();
				}
			}
			return ph;
		}
			
	
	
	@GetMapping("/pharmacies/{id}")
	public Optional<Pharmacie> findbyid(@PathVariable Long id){
		
		Optional<Pharmacie> p = pharmacieRepository.findById(id);
		return p;
		}
	 
	 
	@PostMapping("/al")
	public List<Pharmacie> findpharmacie(){
	
	return pharmacieRepository.f();
}
	
	
	

	@Transactional
	@GetMapping("/villes/ville/zones/{zone}/pharmacies/garde/{periode}")  
	public List<Pharmacie> findByF(@PathVariable  String zone,@PathVariable  String periode) throws JsonProcessingException  {
		
		System.out.println(pharmacieRepository.FindPharmacieByZonePeriode(zone,periode));
		
		
			return pharmacieRepository.FindPharmacieByZonePeriode(zone,periode);
		
		
	}

    
	
		
	 


	 
	 
	
	

}
