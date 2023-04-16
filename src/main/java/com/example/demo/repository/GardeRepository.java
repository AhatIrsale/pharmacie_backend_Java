package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Garde;

@Repository
public interface GardeRepository  extends JpaRepository<Garde,Long> {
	Garde findById(int id);

}
