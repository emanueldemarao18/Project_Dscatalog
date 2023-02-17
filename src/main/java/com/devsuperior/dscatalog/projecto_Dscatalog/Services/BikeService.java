package com.devsuperior.dscatalog.projecto_Dscatalog.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalog.projecto_Dscatalog.entities.Bike;
import com.devsuperior.dscatalog.projecto_Dscatalog.repository.BikeRepository;

@Service
public class BikeService {

	@Autowired
	private BikeRepository repository;
	
	@Transactional(readOnly = true)
	public List<Bike> findAll () {
		return repository.findAll();
	}
	
	
	
	
}
