package com.example.demo.controller;


import java.util.ArrayList;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

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
import com.example.demo.entities.PharmacieDTO;
import com.example.demo.entities.Ville;
import com.example.demo.entities.Zone;
import com.example.demo.entities.ZoneDTO;
import com.example.demo.repository.PharmacieRepository;
import com.example.demo.repository.VilleRepository;
import com.example.demo.repository.ZoneRepository;
import com.example.demo.services.PharmacieService;
import com.example.demo.services.ZoneService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import javax.transaction.Transactional;



@RestController
@RequestMapping("api")
public class PharmacieController  {
	
	@Autowired
	  PharmacieRepository pharmacieRepository;

	@Autowired
	  ZoneRepository zoneRepository;

	@Autowired
	  VilleRepository villeRepository;
	
	@Autowired
	private PharmacieService ps;
	


	
	
	
	@GetMapping("/all")
	public String find(){
		return "hello pharmacie";
	}
	
	@PostMapping("/pharmacies/add")
	public Pharmacie createZone(@RequestBody Pharmacie p) {
        return ps.save(p);
    }
	 @DeleteMapping("pharmacies/delete/{id}")
	    public void deleteZone(@PathVariable Long id) {
	        ps.delete(id);
	    }
	
	@GetMapping("/pharmacies")
	public List<Pharmacie> all(){
		return pharmacieRepository.findAll();
	}

	@GetMapping("/pharmacies/all")
	public List<PharmacieDTO> getAllPharmacies() {
	    List<Pharmacie> ph = pharmacieRepository.findAll();
	    List<PharmacieDTO> phs = new ArrayList<>();
	    for (Pharmacie p : ph) {
	    	PharmacieDTO dto = new PharmacieDTO();
	        dto.setId(p.getId());
	        dto.setNom(p.getNom());
	        dto.setLaltitude(p.getLaltitude());
	        dto.setLongitude(p.getLongitude());
	        dto.setPhoto(p.getPhoto());
	        
	        Zone zone = p.getZone();
	        if (zone != null) {
	            dto.setZone(zone.getNom());
	        } else {
	            System.out.println("Null zone found for Pharmacie with ID: " + p.getId());
	            dto.setZone(null); 
	        }
	        
	        phs.add(dto);
	    }
	    return phs;
	}
	
	@PutMapping("pharmacies/update/{id}")
	public Pharmacie pharmacieUpdate(@PathVariable int id, @RequestBody Pharmacie updatedPharmacie) {
	    Pharmacie existingPharmacie = ps.findById(id);
	    if (existingPharmacie != null) {
	        existingPharmacie.setLaltitude(updatedPharmacie.getLaltitude());
	        existingPharmacie.setLongitude(updatedPharmacie.getLongitude());
	        existingPharmacie.setNom(updatedPharmacie.getNom());
	        existingPharmacie.setPhoto(updatedPharmacie.getPhoto());
	        existingPharmacie.setZone(updatedPharmacie.getZone());
	        
	        return ps.save(existingPharmacie);
	    } else {
	        return null;
	    }
	}
	
	@PutMapping("pharmaciefav/update/{id}")
	public Pharmacie pharmaciefavUpdate(@PathVariable int id, @RequestBody Pharmacie updatedPharmacie) {
	    Pharmacie existingPharmacie = ps.findById(id);
	    if (existingPharmacie != null) {
	    	if(existingPharmacie.isFav()) {
	    		existingPharmacie.setFav(false);
	    		System.out.println("false");
	    		}
	    	else { 
	    		existingPharmacie.setFav(true);
	    		System.out.println("false");
	    	}
	    		
	        
	        return ps.save(existingPharmacie);
	    } else {
	        return null;
	    }
	}



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
