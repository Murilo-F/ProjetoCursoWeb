package com.ce.controller;

import com.ce.service.BoxesService;
import com.ce.dto.BoxesRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boxes")
public class BoxesController {
	@Autowired
	BoxesService boxesService;

	@GetMapping
	public Object getAll(){
		return boxesService.getAll();
	}

	@GetMapping("/{id}")
	public Object getOne(@PathVariable(name = "id") Long id){
		return boxesService.findById(id);
	}

	@PostMapping
	public Object save(@RequestBody BoxesRequestDTO boxesRequestDTO){
		return boxesService.save(boxesRequestDTO);
	}

	@PutMapping("/{id}")
	public Object update(@PathVariable(name ="id") Long id,@RequestBody BoxesRequestDTO boxesRequestDTO){
		return boxesService.update(id, boxesRequestDTO);
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable(name = "id") Long id){
		return boxesService.delete(id);
	}

}
//2023-01-28 00:01:50