package com.ce.service;

import com.ce.dto.UnidadesMedidaRequestDTO;
import com.ce.dto.UnidadesMedidaResponseDTO;
import com.ce.model.UnidadesMedida;
import com.ce.repository.UnidadesMedidaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnidadesMedidaService {

    @Autowired
    UnidadesMedidaRepository unidadesMedidaRepository;

    public Object getAll() {
        return unidadesMedidaRepository.findAll().stream().map((unidadesMedida)-> new UnidadesMedidaRequestDTO(unidadesMedida));
    }
    @Transactional
    public Object save(UnidadesMedidaRequestDTO unidadesMedidaRequestDTO) {
        UnidadesMedida unidadesMedida = new UnidadesMedida(unidadesMedidaRequestDTO);
        return new UnidadesMedidaResponseDTO(unidadesMedidaRepository.save(unidadesMedida));
    }
}
