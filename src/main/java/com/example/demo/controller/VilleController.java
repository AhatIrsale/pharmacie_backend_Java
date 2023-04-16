package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Ville;
import com.example.demo.entities.Zone;
import com.example.demo.repository.VilleRepository;
import com.example.demo.services.VilleService;

@RestController
@RequestMapping("api")
public class VilleController {
	

	
	@Autowired
	private VilleService vs;
	
	@GetMapping("/al")
	public String find(){
		return "hello";
	}
	
	@GetMapping("/villes")
	public List<Ville> findAll(){
		return vs.findAll();
	}
	
	@PostMapping("/villes/add")
	public Ville createCity(@RequestBody Ville city) {
        return vs.save(city);
    }
	
	 @GetMapping("villes/{id}")
	    public Ville getCityById(@PathVariable int id) {
	        return vs.findById(id);
	    }

	
	 @PutMapping("villes/update/{id}")
	    public Ville updateCity(@PathVariable int id, @RequestBody Ville city) {
	        Ville existingCity = vs.findById(id);
	        if (existingCity != null) {
	            existingCity.setNom(city.getNom());
	            return vs.save(existingCity);
	        }
	        return null;
	    }
	 
	 @DeleteMapping("villes/delete/{id}")
	    public void deleteCity(@PathVariable Long id) {
	        vs.delete(id);
	    }
	 

	
	

}
