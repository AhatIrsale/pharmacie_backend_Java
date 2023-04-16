package com.example.demo.dao;

import java.util.List;

import com.example.demo.entities.Ville;

public interface IDao<T> {

	T save(T o);
	List<T> findAll();
	T findById(int id);
	void delete (Long id);
	
	
}
