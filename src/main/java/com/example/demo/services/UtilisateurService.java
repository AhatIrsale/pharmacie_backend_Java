package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Utilisateur;
import com.example.demo.entities.Ville;
import com.example.demo.repository.UtilisateurRepository;
import com.example.demo.repository.VilleRepository;

@Service
public class UtilisateurService implements IDao<Utilisateur> {
	
	@Autowired  
	private UtilisateurRepository repo;
	
	@Override
	public Utilisateur save(Utilisateur o) {
		return repo.save(o) ;
	}

	@Override
	public List<Utilisateur> findAll() {
		
		return repo.findAll();
	}

	@Override
	public Utilisateur findById(int id) {
		
		return repo.findById(id);
	}

	

	
	@Override
	public void delete(Long id) {
		repo.deleteById( id);
		
	}

}
