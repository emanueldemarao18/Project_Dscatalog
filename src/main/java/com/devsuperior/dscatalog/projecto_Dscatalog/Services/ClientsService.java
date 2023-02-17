package com.devsuperior.dscatalog.projecto_Dscatalog.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalog.projecto_Dscatalog.entities.Clients;
import com.devsuperior.dscatalog.projecto_Dscatalog.repository.ClientsRepository;

@Service
public class ClientsService {

	@Autowired
	private ClientsRepository repository;

	@Transactional(readOnly = true)
	public List<Clients> findAll() {
		return repository.findAll();
	}

}
