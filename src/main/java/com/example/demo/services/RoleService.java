package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Role;
import com.example.demo.repository.RoleRepository;

@Service
public class RoleService implements IDao<Role> {
	@Autowired  
	private RoleRepository repo;
	
	@Override
	public Role save(Role o) {
		return repo.save(o) ;
	}

	@Override
	public List<Role> findAll() {
		
		return repo.findAll();
	}

	@Override
	public Role findById(int id) {
		
		return repo.findById(id);
	}

	@Override
	public void delete(Long id) {
		repo.deleteById( id);
		
	
	}

}
