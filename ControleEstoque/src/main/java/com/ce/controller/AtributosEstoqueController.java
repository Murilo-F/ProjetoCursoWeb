package com.ce.controller;

import com.ce.service.AtributosEstoqueService;
import com.ce.dto.AtributosEstoqueRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/atributosEstoque")
public class AtributosEstoqueController {
	@Autowired
	AtributosEstoqueService atributosEstoqueService;

	@GetMapping
	public Object getAll(){
		return atributosEstoqueService.getAll();
	}

	@GetMapping("/{id}")
	public Object getOne(@PathVariable(name = "id") Long id){
		return atributosEstoqueService.findById(id);
	}

	@PostMapping
	public Object save(@RequestBody AtributosEstoqueRequestDTO atributosEstoqueRequestDTO){
		return atributosEstoqueService.save(atributosEstoqueRequestDTO);
	}

	@PutMapping("/{id}")
	public Object update(@PathVariable(name ="id") Long id,@RequestBody AtributosEstoqueRequestDTO atributosEstoqueRequestDTO){
		return atributosEstoqueService.update(id, atributosEstoqueRequestDTO);
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable(name = "id") Long id){
		return atributosEstoqueService.delete(id);
	}

}
//2023-01-28 00:01:50