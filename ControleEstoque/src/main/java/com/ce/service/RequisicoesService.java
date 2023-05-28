package com.ce.service;

import com.ce.model.Requisicoes;
import com.ce.dto.RequisicoesRequestDTO;
import com.ce.dto.RequisicoesResponseDTO;
import com.ce.repository.RequisicoesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Service
public class RequisicoesService {
	private final String REQUISICOESSERVICE_REGISTRO_N_ENCONTRADO ="Registro não encontrado";
	@Autowired
	RequisicoesRepository requisicoesRepository;

	public Object getAll(){
		return requisicoesRepository.findAll().stream().map((item)-> new RequisicoesRequestDTO(item));
	}

	@Transactional
	public Object save(RequisicoesRequestDTO requisicoesRequestDTO) {
		Requisicoes requisicoes = new Requisicoes(requisicoesRequestDTO); 
		return ResponseEntity.status(HttpStatus.CREATED).body( new RequisicoesResponseDTO(requisicoesRepository.save(requisicoes)));
	
}
	public ResponseEntity<Object> findById(Long id) {
		Optional<Requisicoes> optional = requisicoesRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(REQUISICOESSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			return ResponseEntity.status(HttpStatus.OK).body(new RequisicoesResponseDTO(optional.get()));
		}
	}

	@Transactional
	public ResponseEntity<Object> update(Long id, RequisicoesRequestDTO requisicoesRequestDTO) {
		Optional<Requisicoes> optional = requisicoesRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(REQUISICOESSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			Requisicoes item = optional.get();
			if(requisicoesRequestDTO.getStRequisicao()!=null){item.setStRequisicao(requisicoesRequestDTO.getStRequisicao());}
			if(requisicoesRequestDTO.getIdFuncionario()!=null){item.setIdFuncionario(requisicoesRequestDTO.getIdFuncionario());}
			if(requisicoesRequestDTO.getIdTipoMovi()!=null){item.setIdTipoMovi(requisicoesRequestDTO.getIdTipoMovi());}
			if(requisicoesRequestDTO.getDtRequisicao()!=null){item.setDtRequisicao(requisicoesRequestDTO.getDtRequisicao());}
			return ResponseEntity.status(HttpStatus.OK).body(new RequisicoesResponseDTO(requisicoesRepository.save(item)));
		}
	}

	public Object delete(Long id) {
		Optional<Requisicoes> optional = requisicoesRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(REQUISICOESSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			requisicoesRepository.delete(optional.get());
			return ResponseEntity.status(HttpStatus.OK).build();
		}
	}

}
//2023-01-28 00:01:50