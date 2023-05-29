package com.example.demo.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Garde;
import com.example.demo.entities.PharmacieGarde;
import com.example.demo.repository.GardeRepository;
import com.example.demo.repository.PharmaciegardeRepository;

@Service
public class PharmaciegardeService  {
	
	@Autowired
	private PharmaciegardeRepository pharmGardeRepo;

	public PharmacieGarde save(PharmacieGarde p) {
		return pharmGardeRepo.save(p);
	}

	public List<PharmacieGarde> findAll() {
		return pharmGardeRepo.findAll();
	}

	public PharmacieGarde findById(int id) {
		return pharmGardeRepo.findById(id);
	}

	public void deleteById(Integer id) {
		pharmGardeRepo.deleteById(id);
	}

	public void update(PharmacieGarde p) {
		pharmGardeRepo.save(p);
	}


}
