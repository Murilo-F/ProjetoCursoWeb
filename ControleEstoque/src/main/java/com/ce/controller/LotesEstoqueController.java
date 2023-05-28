package com.ce.controller;

import com.ce.service.LotesEstoqueService;
import com.ce.dto.LotesEstoqueRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lotesEstoque")
public class LotesEstoqueController {
	@Autowired
	LotesEstoqueService lotesEstoqueService;

	@GetMapping
	public Object getAll(){
		return lotesEstoqueService.getAll();
	}

	@GetMapping("/{id}")
	public Object getOne(@PathVariable(name = "id") Long id){
		return lotesEstoqueService.findById(id);
	}

	@PostMapping
	public Object save(@RequestBody LotesEstoqueRequestDTO lotesEstoqueRequestDTO){
		return lotesEstoqueService.save(lotesEstoqueRequestDTO);
	}

	@PutMapping("/{id}")
	public Object update(@PathVariable(name ="id") Long id,@RequestBody LotesEstoqueRequestDTO lotesEstoqueRequestDTO){
		return lotesEstoqueService.update(id, lotesEstoqueRequestDTO);
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable(name = "id") Long id){
		return lotesEstoqueService.delete(id);
	}

}
//2023-01-28 00:01:50