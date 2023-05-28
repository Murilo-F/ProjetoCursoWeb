package com.ce.controller;

import com.ce.service.RequisicoesAtributoService;
import com.ce.dto.RequisicoesAtributoRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/requisicoesAtributo")
public class RequisicoesAtributoController {
	@Autowired
	RequisicoesAtributoService requisicoesAtributoService;

	@GetMapping
	public Object getAll(){
		return requisicoesAtributoService.getAll();
	}

	@GetMapping("/{id}")
	public Object getOne(@PathVariable(name = "id") Long id){
		return requisicoesAtributoService.findById(id);
	}

	@PostMapping
	public Object save(@RequestBody RequisicoesAtributoRequestDTO requisicoesAtributoRequestDTO){
		return requisicoesAtributoService.save(requisicoesAtributoRequestDTO);
	}

	@PutMapping("/{id}")
	public Object update(@PathVariable(name ="id") Long id,@RequestBody RequisicoesAtributoRequestDTO requisicoesAtributoRequestDTO){
		return requisicoesAtributoService.update(id, requisicoesAtributoRequestDTO);
	}

	@DeleteMapping("/{id}")
	public Object delete(@PathVariable(name = "id") Long id){
		return requisicoesAtributoService.delete(id);
	}

}
//2023-01-28 00:01:50