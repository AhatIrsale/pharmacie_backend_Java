package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Ville;
import com.example.demo.entities.Zone;
import com.example.demo.repository.VilleRepository;
import com.example.demo.repository.ZoneRepository;

@Service
public class ZoneService implements IDao<Zone> {
	@Autowired  
	private ZoneRepository repo;
	
	@Override
	public Zone save(Zone o) {
		return repo.save(o) ;
	}

	@Override
	public List<Zone> findAll() {
		
		return repo.findAll();
	}

	@Override
	public Zone findById(int id) {
		
		return repo.findById(id);
	}

	@Override
	public void delete(Long id) {
		repo.deleteById( id);
		
	}

}
