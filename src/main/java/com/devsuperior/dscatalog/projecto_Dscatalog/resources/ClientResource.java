package com.devsuperior.dscatalog.projecto_Dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.projecto_Dscatalog.Services.ClientsService;
import com.devsuperior.dscatalog.projecto_Dscatalog.entities.Clients;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@Autowired
	private ClientsService service;
	@GetMapping

	public ResponseEntity<List<Clients>> findAll() {
		
		List<Clients> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}

}
