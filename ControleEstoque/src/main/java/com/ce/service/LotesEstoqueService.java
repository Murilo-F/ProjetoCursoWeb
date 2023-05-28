package com.ce.service;

import com.ce.model.LotesEstoque;
import com.ce.dto.LotesEstoqueRequestDTO;
import com.ce.dto.LotesEstoqueResponseDTO;
import com.ce.repository.LotesEstoqueRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Service
public class LotesEstoqueService {
	private final String LOTESESTOQUESERVICE_REGISTRO_N_ENCONTRADO ="Registro não encontrado";
	@Autowired
	LotesEstoqueRepository lotesEstoqueRepository;

	public Object getAll(){
		return lotesEstoqueRepository.findAll().stream().map((item)-> new LotesEstoqueRequestDTO(item));
	}

	@Transactional
	public Object save(LotesEstoqueRequestDTO lotesEstoqueRequestDTO) {
		LotesEstoque lotesEstoque = new LotesEstoque(lotesEstoqueRequestDTO); 
		return ResponseEntity.status(HttpStatus.CREATED).body( new LotesEstoqueResponseDTO(lotesEstoqueRepository.save(lotesEstoque)));
	
}
	public ResponseEntity<Object> findById(Long id) {
		Optional<LotesEstoque> optional = lotesEstoqueRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(LOTESESTOQUESERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			return ResponseEntity.status(HttpStatus.OK).body(new LotesEstoqueResponseDTO(optional.get()));
		}
	}

	@Transactional
	public ResponseEntity<Object> update(Long id, LotesEstoqueRequestDTO lotesEstoqueRequestDTO) {
		Optional<LotesEstoque> optional = lotesEstoqueRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(LOTESESTOQUESERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			LotesEstoque item = optional.get();
			if(lotesEstoqueRequestDTO.getCdLote()!=null){item.setCdLote(lotesEstoqueRequestDTO.getCdLote());}
			return ResponseEntity.status(HttpStatus.OK).body(new LotesEstoqueResponseDTO(lotesEstoqueRepository.save(item)));
		}
	}

	public Object delete(Long id) {
		Optional<LotesEstoque> optional = lotesEstoqueRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(LOTESESTOQUESERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			lotesEstoqueRepository.delete(optional.get());
			return ResponseEntity.status(HttpStatus.OK).build();
		}
	}

}
//2023-01-28 00:01:50