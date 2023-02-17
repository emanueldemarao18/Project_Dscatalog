package com.devsuperior.dscatalog.projecto_Dscatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalog.projecto_Dscatalog.entities.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long>{
	
	

}
