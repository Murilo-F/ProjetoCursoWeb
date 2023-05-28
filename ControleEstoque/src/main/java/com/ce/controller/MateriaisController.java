package com.ce.controller;

import com.ce.service.MateriaisService;
import com.ce.dto.MateriaisRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/materiais")
public class MateriaisController {
	@Autowired
	MateriaisService materiaisService;

	@GetMapping
	public Object getAll(){
		return materiaisService.getAll();
	}

	@GetMapping("/{id}")
	public Object getOne(@PathVariable(name = "id") Long id){
		return materiaisService.findById(id);
	}

	@PostMapping
	public Object save(@RequestBody MateriaisRequestDTO materiaisRequestDTO){
		return materiaisService.save(materiaisRequestDTO);
	}

	@PutMapping("/{id}")
	public Object update(@PathVariable(name ="id") Long id,@RequestBody MateriaisRequestDTO materiaisRequestDTO){
		return materiaisService.update(id, materiaisRequestDTO);
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable(name = "id") Long id){
		return materiaisService.delete(id);
	}

}
//2023-01-28 00:01:50