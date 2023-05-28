package com.ce.controller;

import com.ce.service.RequisicoesItemService;
import com.ce.dto.RequisicoesItemRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/requisicoesItem")
public class RequisicoesItemController {
	@Autowired
	RequisicoesItemService requisicoesItemService;

	@GetMapping
	public Object getAll(){
		return requisicoesItemService.getAll();
	}

	@GetMapping("/{id}")
	public Object getOne(@PathVariable(name = "id") Long id){
		return requisicoesItemService.findById(id);
	}

	@PostMapping
	public Object save(@RequestBody RequisicoesItemRequestDTO requisicoesItemRequestDTO){
		return requisicoesItemService.save(requisicoesItemRequestDTO);
	}

	@PutMapping("/{id}")
	public Object update(@PathVariable(name ="id") Long id,@RequestBody RequisicoesItemRequestDTO requisicoesItemRequestDTO){
		return requisicoesItemService.update(id, requisicoesItemRequestDTO);
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable(name = "id") Long id){
		return requisicoesItemService.delete(id);
	}

}
//2023-01-28 00:01:50