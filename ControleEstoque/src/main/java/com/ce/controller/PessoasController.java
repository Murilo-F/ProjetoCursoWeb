package com.ce.controller;

import com.ce.service.PessoasService;
import com.ce.dto.PessoasRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoas")
public class PessoasController {
	@Autowired
	PessoasService pessoasService;

	@GetMapping
	public Object getAll(){
		return pessoasService.getAll();
	}

	@GetMapping("/{id}")
	public Object getOne(@PathVariable(name = "id") Long id){
		return pessoasService.findById(id);
	}

	@PostMapping
	public Object save(@RequestBody PessoasRequestDTO pessoasRequestDTO){
		return pessoasService.save(pessoasRequestDTO);
	}

	@PutMapping("/{id}")
	public Object update(@PathVariable(name ="id") Long id,@RequestBody PessoasRequestDTO pessoasRequestDTO){
		return pessoasService.update(id, pessoasRequestDTO);
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable(name = "id") Long id){
		return pessoasService.delete(id);
	}

}
//2023-01-28 00:01:50