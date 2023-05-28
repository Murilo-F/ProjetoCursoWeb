package com.ce.controller;

import com.ce.service.FuncionariosComplementoService;
import com.ce.dto.FuncionariosComplementoRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionariosComplemento")
public class FuncionariosComplementoController {
	@Autowired
	FuncionariosComplementoService funcionariosComplementoService;

	@GetMapping
	public Object getAll(){
		return funcionariosComplementoService.getAll();
	}

	@GetMapping("/{id}")
	public Object getOne(@PathVariable(name = "id") Long id){
		return funcionariosComplementoService.findById(id);
	}

	@PostMapping
	public Object save(@RequestBody FuncionariosComplementoRequestDTO funcionariosComplementoRequestDTO){
		return funcionariosComplementoService.save(funcionariosComplementoRequestDTO);
	}

	@PutMapping("/{id}")
	public Object update(@PathVariable(name ="id") Long id,@RequestBody FuncionariosComplementoRequestDTO funcionariosComplementoRequestDTO){
		return funcionariosComplementoService.update(id, funcionariosComplementoRequestDTO);
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable(name = "id") Long id){
		return funcionariosComplementoService.delete(id);
	}

}
//2023-01-28 00:01:50