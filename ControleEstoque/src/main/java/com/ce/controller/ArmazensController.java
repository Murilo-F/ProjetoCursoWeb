package com.ce.controller;

import com.ce.service.ArmazensService;
import com.ce.dto.ArmazensRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/armazens")
public class ArmazensController {
	@Autowired
	ArmazensService armazensService;

	@GetMapping
	public Object getAll(){
		return armazensService.getAll();
	}

	@GetMapping("/{id}")
	public Object getOne(@PathVariable(name = "id") Long id){
		return armazensService.findById(id);
	}

	@PostMapping
	public Object save(@RequestBody ArmazensRequestDTO armazensRequestDTO){
		return armazensService.save(armazensRequestDTO);
	}

	@PutMapping("/{id}")
	public Object update(@PathVariable(name ="id") Long id,@RequestBody ArmazensRequestDTO armazensRequestDTO){
		return armazensService.update(id, armazensRequestDTO);
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable(name = "id") Long id){
		return armazensService.delete(id);
	}

}
//2023-01-28 00:01:50