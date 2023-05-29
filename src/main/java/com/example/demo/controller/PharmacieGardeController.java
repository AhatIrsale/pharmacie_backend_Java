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

import com.example.demo.entities.Pharmacie;
import com.example.demo.entities.PharmacieGarde;
import com.example.demo.repository.PharmacieRepository;
import com.example.demo.repository.PharmaciegardeRepository;
import com.example.demo.repository.VilleRepository;
import com.example.demo.repository.ZoneRepository;
import com.example.demo.services.PharmacieService;
import com.example.demo.services.PharmaciegardeService;

@RestController
@RequestMapping("api")
public class PharmacieGardeController {
	@Autowired
	private PharmaciegardeService pharmGardeService;

	@PostMapping("/save")
	public PharmacieGarde save(@RequestBody PharmacieGarde p) {
		return pharmGardeService.save(p);
	}

	@GetMapping("/")
	public List<PharmacieGarde> findAll() {
		return pharmGardeService.findAll();
	}

	 @GetMapping("/findById/{id}")
	public PharmacieGarde findById(@PathVariable int id) {
		return pharmGardeService.findById(id);
	}

	 
	 @DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {
		pharmGardeService.deleteById(id);
	}

	public void update(@RequestBody PharmacieGarde p) {
		pharmGardeService.update(p);
	}

}
