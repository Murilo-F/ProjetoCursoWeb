package com.ce.controller;

import com.ce.service.RequisicoesService;
import com.ce.dto.RequisicoesRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/requisicoes")
public class RequisicoesController {
	@Autowired
	RequisicoesService requisicoesService;

	@GetMapping
	public Object getAll(){
		return requisicoesService.getAll();
	}

	@GetMapping("/{id}")
	public Object getOne(@PathVariable(name = "id") Long id){
		return requisicoesService.findById(id);
	}

	@PostMapping
	public Object save(@RequestBody RequisicoesRequestDTO requisicoesRequestDTO){
		return requisicoesService.save(requisicoesRequestDTO);
	}

	@PutMapping("/{id}")
	public Object update(@PathVariable(name ="id") Long id,@RequestBody RequisicoesRequestDTO requisicoesRequestDTO){
		return requisicoesService.update(id, requisicoesRequestDTO);
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable(name = "id") Long id){
		return requisicoesService.delete(id);
	}

}
//2023-01-28 00:01:50