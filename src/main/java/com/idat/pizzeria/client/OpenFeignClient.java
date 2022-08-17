package com.idat.pizzeria.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.pizzeria.dto.Cliente;


@FeignClient(name="idat-ef", url="localhost:8080")
public interface OpenFeignClient {
	@GetMapping("/api/cliente/v1/listar")
	public List<Cliente> listarCliente();

}
