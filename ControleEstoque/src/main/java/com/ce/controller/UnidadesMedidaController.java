package com.ce.controller;

import com.ce.service.UnidadesMedidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidadesMedida")
public class UnidadesMedidaController {
    @Autowired
    UnidadesMedidaService unidadesMedidaService;
    @GetMapping
    public Object getAll(){

        return unidadesMedidaService.getAll();
    }
}
