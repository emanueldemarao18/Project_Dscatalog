package com.devsuperior.dscatalog.projecto_Dscatalog.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalog.projecto_Dscatalog.entities.Category;
import com.devsuperior.dscatalog.projecto_Dscatalog.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public List<Category> findAll() {
		
		return repository.findAll();
	}
}
