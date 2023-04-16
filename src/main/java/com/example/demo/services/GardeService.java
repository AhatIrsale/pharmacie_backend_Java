package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Garde;
import com.example.demo.entities.Pharmacie;
import com.example.demo.repository.GardeRepository;
import com.example.demo.repository.PharmacieRepository;

@Service
public class GardeService implements IDao< Garde >  {
	@Autowired  
	private GardeRepository repo;
	
	@Override
	public Garde save(Garde o) {
		
		return repo.save(o); 
	}

	@Override
	public List<Garde> findAll() {
		
		return  repo.findAll();
	}

	@Override
	public Garde findById(int id) {
		return repo.findById(id);
	}


	
	@Override
	public void delete(Long id) {
		repo.deleteById( id);
		
	}

}
