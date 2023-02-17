package com.devsuperior.dscatalog.projecto_Dscatalog.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.projecto_Dscatalog.Services.CarsService;
import com.devsuperior.dscatalog.projecto_Dscatalog.entities.Cars;

@RestController
@RequestMapping(value = "/cars")
public class CarsResource {
	
	@Autowired
	
	private CarsService service;
	
	@GetMapping
	public ResponseEntity<List<Cars>> findAll() {
		
		List<Cars> carslist = service.findAll();
	
		return ResponseEntity.ok().body(carslist);
		
		
	}

	
}
