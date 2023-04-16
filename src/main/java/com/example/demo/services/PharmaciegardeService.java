package com.example.demo.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Garde;
import com.example.demo.entities.PharmacieGarde;
import com.example.demo.entities.Utilisateur;
import com.example.demo.repository.GardeRepository;
import com.example.demo.repository.PharmaciegardeRepository;

@Service
public class PharmaciegardeService implements IDao<PharmacieGarde> {
	
	@Autowired  
	private PharmaciegardeRepository repo;
	
	@Override
	public PharmacieGarde save(PharmacieGarde o) {
		
		return repo.save(o); 
	}

	@Override
	public List<PharmacieGarde> findAll() {
		
		return  repo.findAll();
	}

	@Override
	public PharmacieGarde findById(int id) {
		return repo.findByPk(id);
	}
	@Override
	public void delete(Long id) {
		repo.deleteById( id);
		
	}


}
