package com.ce.controller;

import com.ce.service.FuncionariosService;
import com.ce.dto.FuncionariosRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionarios")
public class FuncionariosController {
	@Autowired
	FuncionariosService funcionariosService;

	@GetMapping
	public Object getAll(){
		return funcionariosService.getAll();
	}

	@GetMapping("/{id}")
	public Object getOne(@PathVariable(name = "id") Long id){
		return funcionariosService.findById(id);
	}

	@PostMapping
	public Object save(@RequestBody FuncionariosRequestDTO funcionariosRequestDTO){
		return funcionariosService.save(funcionariosRequestDTO);
	}

	@PutMapping("/{id}")
	public Object update(@PathVariable(name ="id") Long id,@RequestBody FuncionariosRequestDTO funcionariosRequestDTO){
		return funcionariosService.update(id, funcionariosRequestDTO);
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable(name = "id") Long id){
		return funcionariosService.delete(id);
	}

}
//2023-01-28 00:01:50