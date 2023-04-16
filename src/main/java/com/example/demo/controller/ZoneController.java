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
import com.example.demo.repository.ZoneRepository;
import com.example.demo.services.ZoneService;


@RestController
@RequestMapping("api")
public class ZoneController {
	@Autowired
	private ZoneRepository zoneRepository;
	
	@Autowired
	private VilleRepository villerepo;
	
	@Autowired
	private ZoneService zs;
	
	
	
	

	

	@GetMapping("/Zones")
	public List<Zone> findAll(){
		return zs.findAll();
	}
	
	@PostMapping("/Zones/add")
	public Zone createZone(@RequestBody Zone zone) {
        return zs.save(zone);
    }
	
	 @GetMapping("Zones/{id}")
	    public Zone getZoneById(@PathVariable int id) {
	        return zs.findById(id);
	    }

	
	 @PutMapping("Zones/update/{id}")
	    public Zone updateZone(@PathVariable int id, @RequestBody Zone zone) {
	        Zone existingZone = zs.findById(id);
	        if (existingZone != null) {
	        	existingZone.setNom(zone.getNom());
	            return zs.save(existingZone);
	        }
	        return null;
	    }
	 
	 @DeleteMapping("Zones/delete/{id}")
	    public void deleteZone(@PathVariable Long id) {
	        zs.delete(id);
	    }
	 
	 
	 
	 
	 
	 
	
	@PostMapping("/api/ville/{id1}/zone/{id2}/pharmacies")
	public void villezonepharmacie(@PathVariable String id1, @PathVariable String id2){
		Ville ville = villerepo.findById(Integer.parseInt(id1));
		Zone zone = zoneRepository.findById(Integer.parseInt(id2));
		zone.getPharmacies();
		
	}
	
	@GetMapping("/api/villes/{id1}/zones")
	public List<Zone> villezones(@PathVariable String id1 ){
		Ville v = villerepo.findById(Integer.parseInt(id1));
		return v.getZones();
		
	}
	

	
	

}
