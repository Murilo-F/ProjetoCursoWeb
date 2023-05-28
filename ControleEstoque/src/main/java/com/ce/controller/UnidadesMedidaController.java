package com.ce.controller;

import com.ce.service.UnidadesMedidaService;
import com.ce.dto.UnidadesMedidaRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/unidadesMedida")
public class UnidadesMedidaController {
	@Autowired
	UnidadesMedidaService unidadesMedidaService;

	@GetMapping
	public Object getAll(){
		return unidadesMedidaService.getAll();
	}

	@GetMapping("/{id}")
	public Object getOne(@PathVariable(name = "id") Long id){
		return unidadesMedidaService.findById(id);
	}

	@PostMapping
	public Object save(@RequestBody UnidadesMedidaRequestDTO unidadesMedidaRequestDTO){
		return unidadesMedidaService.save(unidadesMedidaRequestDTO);
	}

	@PutMapping("/{id}")
	public Object update(@PathVariable(name ="id") Long id,@RequestBody UnidadesMedidaRequestDTO unidadesMedidaRequestDTO){
		return unidadesMedidaService.update(id, unidadesMedidaRequestDTO);
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable(name = "id") Long id){
		return unidadesMedidaService.delete(id);
	}

}
//2023-01-28 00:01:50