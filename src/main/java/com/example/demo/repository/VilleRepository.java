package com.example.demo.repository;


import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Ville;
@Repository
public interface VilleRepository extends JpaRepository<Ville,Long> {
	Ville findById(int id);
	Ville findBynom(String nom);

}
