package com.devsuperior.dscatalog.projecto_Dscatalog.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.projecto_Dscatalog.Services.BikeService;
import com.devsuperior.dscatalog.projecto_Dscatalog.entities.Bike;

@RestController
@RequestMapping(value = "/bike")
public class BikeResource {
	
	@Autowired
	private BikeService service;
	
	@GetMapping
	
	public ResponseEntity<List<Bike>> findAll() {
		List<Bike> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	
}
