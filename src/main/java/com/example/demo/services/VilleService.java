package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Ville;
import com.example.demo.repository.VilleRepository;

@Service
public class VilleService implements IDao< Ville > {

	@Autowired  
	private VilleRepository repo;
	
	@Override
	public Ville save(Ville o) {
		return repo.save(o) ;
	}

	@Override
	public List<Ville> findAll() {
		
		return repo.findAll();
	}

	@Override
	public Ville findById(int id) {
		
		return repo.findById(id);
	}

	


	@Override
	public void delete(Long id) {
		repo.deleteById( id);
		
	}

}
