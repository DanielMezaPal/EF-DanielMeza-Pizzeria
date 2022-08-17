package com.idat.pizzeria.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pizzeria.client.OpenFeignClient;
import com.idat.pizzeria.dto.Cliente;
import com.idat.pizzeria.entity.Pizzeria;
import com.idat.pizzeria.entity.PizzeriaDetalle;
import com.idat.pizzeria.entity.PizzaFK;
import com.idat.pizzeria.repository.DetallePizzeriaRepository;
import com.idat.pizzeria.repository.PizzeriaRepository;

@Service
public class PizzeriaServiceImpl implements PizzeriaService{
	@Autowired
	private PizzeriaRepository repository;
	
	
	
	@Autowired
	private DetallePizzeriaRepository repositoryDetalle;
	
	
	
	@Autowired
	private OpenFeignClient feign;
	
	
	
	@Override
	public void guardar(Pizzeria pizerria) {
		repository.save(pizerria);
	}
	
	
	
	@Override
	public void asignarPizza() {
		
		List<Cliente> listado = feign.listarCliente();
		PizzaFK fk = null;
		PizzeriaDetalle detalle = null;

		
		for (Cliente cliente : listado) {
			
			fk = new PizzaFK();
			fk.setIdCliente(cliente.getIdCliente());
			fk.setIdPizerria(1);
			fk.setNombrePizza("Full meat");
			fk.setDescripcion("Festival de carnes");			
			detalle = new PizzeriaDetalle();
			detalle.setFk(fk);	
			
			repositoryDetalle.save(detalle);
		}

	}
}
