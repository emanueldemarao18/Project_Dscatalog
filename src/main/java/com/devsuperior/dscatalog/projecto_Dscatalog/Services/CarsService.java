package com.devsuperior.dscatalog.projecto_Dscatalog.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalog.projecto_Dscatalog.entities.Cars;
import com.devsuperior.dscatalog.projecto_Dscatalog.repository.CarsRepository;

@Service
public class CarsService {

	@Autowired
	private CarsRepository repository;

	@Transactional(readOnly = true)
	public List<Cars> findAll() {
		return repository.findAll();
	}

}
