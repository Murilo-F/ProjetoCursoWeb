package com.ce.controller;

import com.ce.service.RequisicoesMovimentoService;
import com.ce.dto.RequisicoesMovimentoRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/requisicoesMovimento")
public class RequisicoesMovimentoController {
	@Autowired
	RequisicoesMovimentoService requisicoesMovimentoService;

	@GetMapping
	public Object getAll(){
		return requisicoesMovimentoService.getAll();
	}

	@GetMapping("/{id}")
	public Object getOne(@PathVariable(name = "id") Long id){
		return requisicoesMovimentoService.findById(id);
	}

	@PostMapping
	public Object save(@RequestBody RequisicoesMovimentoRequestDTO requisicoesMovimentoRequestDTO){
		return requisicoesMovimentoService.save(requisicoesMovimentoRequestDTO);
	}

	@PutMapping("/{id}")
	public Object update(@PathVariable(name ="id") Long id,@RequestBody RequisicoesMovimentoRequestDTO requisicoesMovimentoRequestDTO){
		return requisicoesMovimentoService.update(id, requisicoesMovimentoRequestDTO);
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable(name = "id") Long id){
		return requisicoesMovimentoService.delete(id);
	}

}
//2023-01-28 00:01:50