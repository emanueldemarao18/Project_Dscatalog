package com.devsuperior.dscatalog.projecto_Dscatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalog.projecto_Dscatalog.entities.Cars;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Long> {

}
