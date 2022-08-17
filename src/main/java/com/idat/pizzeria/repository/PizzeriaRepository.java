package com.idat.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.pizzeria.entity.Pizzeria;




@Repository
public interface PizzeriaRepository extends JpaRepository<Pizzeria,Integer> {
	
	
	
	
	
}
