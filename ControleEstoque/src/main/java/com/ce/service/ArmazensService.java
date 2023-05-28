package com.ce.service;

import com.ce.model.Armazens;
import com.ce.dto.ArmazensRequestDTO;
import com.ce.dto.ArmazensResponseDTO;
import com.ce.repository.ArmazensRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Service
public class ArmazensService {
	private final String ARMAZENSSERVICE_REGISTRO_N_ENCONTRADO ="Registro não encontrado";
	@Autowired
	ArmazensRepository armazensRepository;

	public Object getAll(){
		return armazensRepository.findAll().stream().map((item)-> new ArmazensRequestDTO(item));
	}

	@Transactional
	public Object save(ArmazensRequestDTO armazensRequestDTO) {
		Armazens armazens = new Armazens(armazensRequestDTO); 
		return ResponseEntity.status(HttpStatus.CREATED).body( new ArmazensResponseDTO(armazensRepository.save(armazens)));
	
}
	public ResponseEntity<Object> findById(Long id) {
		Optional<Armazens> optional = armazensRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ARMAZENSSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			return ResponseEntity.status(HttpStatus.OK).body(new ArmazensResponseDTO(optional.get()));
		}
	}

	@Transactional
	public ResponseEntity<Object> update(Long id, ArmazensRequestDTO armazensRequestDTO) {
		Optional<Armazens> optional = armazensRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ARMAZENSSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			Armazens item = optional.get();
			if(armazensRequestDTO.getDsArmazem()!=null){item.setDsArmazem(armazensRequestDTO.getDsArmazem());}
			return ResponseEntity.status(HttpStatus.OK).body(new ArmazensResponseDTO(armazensRepository.save(item)));
		}
	}

	public Object delete(Long id) {
		Optional<Armazens> optional = armazensRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ARMAZENSSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			armazensRepository.delete(optional.get());
			return ResponseEntity.status(HttpStatus.OK).build();
		}
	}

}
//2023-01-28 00:01:50