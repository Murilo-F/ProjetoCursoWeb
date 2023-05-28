package com.ce.controller;

import com.ce.service.MateriaisFabricanteService;
import com.ce.dto.MateriaisFabricanteRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/materiaisFabricante")
public class MateriaisFabricanteController {
	@Autowired
	MateriaisFabricanteService materiaisFabricanteService;

	@GetMapping
	public Object getAll(){
		return materiaisFabricanteService.getAll();
	}

	@GetMapping("/{id}")
	public Object getOne(@PathVariable(name = "id") Long id){
		return materiaisFabricanteService.findById(id);
	}

	@PostMapping
	public Object save(@RequestBody MateriaisFabricanteRequestDTO materiaisFabricanteRequestDTO){
		return materiaisFabricanteService.save(materiaisFabricanteRequestDTO);
	}

	@PutMapping("/{id}")
	public Object update(@PathVariable(name ="id") Long id,@RequestBody MateriaisFabricanteRequestDTO materiaisFabricanteRequestDTO){
		return materiaisFabricanteService.update(id, materiaisFabricanteRequestDTO);
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable(name = "id") Long id){
		return materiaisFabricanteService.delete(id);
	}

}
//2023-01-28 00:01:50