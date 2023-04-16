package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.PharmacieGarde;
import com.example.demo.entities.Role;

@Repository
public interface PharmaciegardeRepository extends JpaRepository<PharmacieGarde,Long>{
	PharmacieGarde findByPk(int id);
	

}
