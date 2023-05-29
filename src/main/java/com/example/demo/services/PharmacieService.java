package com.example.demo.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Pharmacie;
import com.example.demo.repository.PharmacieRepository;
@Service
public class PharmacieService implements IDao< Pharmacie > {

	
	@Autowired  
	private PharmacieRepository repo;
	
	@Override
	public Pharmacie save(Pharmacie o) {
		
		return repo.save(o); 
	}

	@Override
	public List<Pharmacie> findAll() {
		
		return  repo.findAll();
	}

	@Override
	public Pharmacie findById(int id) {
		return repo.findById(id);
	}


	

	@Override
	public void delete(Long id) {
		repo.deleteById( id);
		
	}


}
