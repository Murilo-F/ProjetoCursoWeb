package com.ce.controller;

import com.ce.service.MovimentacoesService;
import com.ce.dto.MovimentacoesRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacoesController {
	@Autowired
	MovimentacoesService movimentacoesService;

	@GetMapping
	public Object getAll(){
		return movimentacoesService.getAll();
	}

	@GetMapping("/{id}")
	public Object getOne(@PathVariable(name = "id") Long id){
		return movimentacoesService.findById(id);
	}

	@PostMapping
	public Object save(@RequestBody MovimentacoesRequestDTO movimentacoesRequestDTO){
		return movimentacoesService.save(movimentacoesRequestDTO);
	}

	@PutMapping("/{id}")
	public Object update(@PathVariable(name ="id") Long id,@RequestBody MovimentacoesRequestDTO movimentacoesRequestDTO){
		return movimentacoesService.update(id, movimentacoesRequestDTO);
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable(name = "id") Long id){
		return movimentacoesService.delete(id);
	}

}
//2023-01-28 00:01:50