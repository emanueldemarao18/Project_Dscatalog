package com.devsuperior.dscatalog.projecto_Dscatalog.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.projecto_Dscatalog.Services.ClothesService;
import com.devsuperior.dscatalog.projecto_Dscatalog.entities.Clothes;

@RestController
@RequestMapping(value = "/clothes")
public class ClothesResource {

	@Autowired

	private ClothesService service;

	@GetMapping

	public ResponseEntity<List<Clothes>> findAll() {

		List<Clothes> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}

}
