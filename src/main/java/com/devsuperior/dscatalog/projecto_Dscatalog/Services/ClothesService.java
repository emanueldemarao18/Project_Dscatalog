package com.devsuperior.dscatalog.projecto_Dscatalog.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalog.projecto_Dscatalog.entities.Clothes;
import com.devsuperior.dscatalog.projecto_Dscatalog.repository.ClothesRepository;

@Service
public class ClothesService {

	@Autowired
	private ClothesRepository repository;
	
	@Transactional(readOnly = true)
	public List<Clothes> findAll() {
		return repository.findAll();
	}
}
