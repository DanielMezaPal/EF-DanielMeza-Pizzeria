package com.idat.pizzeria.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class PizzaFK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="id_cliente", nullable = false, unique = true)
	private Integer idCliente;
	
	@Column(name="id_pizerria", nullable = false, unique = true)
	private Integer idPizerria;
	
	
	
	private String nombrePizza;
	private String descripcion;
	
	
	
}
