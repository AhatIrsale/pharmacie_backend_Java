package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.PharmacieGarde;


@Repository
public interface PharmaciegardeRepository extends JpaRepository<PharmacieGarde,Integer>{
	
	PharmacieGarde save(PharmacieGarde p);
	List<PharmacieGarde> findAll();
	PharmacieGarde findById(int id);
	

}
