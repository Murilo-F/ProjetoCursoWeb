package com.ce.service;

import com.ce.model.RequisicoesMovimento;
import com.ce.dto.RequisicoesMovimentoRequestDTO;
import com.ce.dto.RequisicoesMovimentoResponseDTO;
import com.ce.repository.RequisicoesMovimentoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Service
public class RequisicoesMovimentoService {
	private final String REQUISICOESMOVIMENTOSERVICE_REGISTRO_N_ENCONTRADO ="Registro não encontrado";
	@Autowired
	RequisicoesMovimentoRepository requisicoesMovimentoRepository;

	public Object getAll(){
		return requisicoesMovimentoRepository.findAll().stream().map((item)-> new RequisicoesMovimentoRequestDTO(item));
	}

	@Transactional
	public Object save(RequisicoesMovimentoRequestDTO requisicoesMovimentoRequestDTO) {
		RequisicoesMovimento requisicoesMovimento = new RequisicoesMovimento(requisicoesMovimentoRequestDTO); 
		return ResponseEntity.status(HttpStatus.CREATED).body( new RequisicoesMovimentoResponseDTO(requisicoesMovimentoRepository.save(requisicoesMovimento)));
	
}
	public ResponseEntity<Object> findById(Long id) {
		Optional<RequisicoesMovimento> optional = requisicoesMovimentoRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(REQUISICOESMOVIMENTOSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			return ResponseEntity.status(HttpStatus.OK).body(new RequisicoesMovimentoResponseDTO(optional.get()));
		}
	}

	@Transactional
	public ResponseEntity<Object> update(Long id, RequisicoesMovimentoRequestDTO requisicoesMovimentoRequestDTO) {
		Optional<RequisicoesMovimento> optional = requisicoesMovimentoRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(REQUISICOESMOVIMENTOSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			RequisicoesMovimento item = optional.get();
			if(requisicoesMovimentoRequestDTO.getIdRequAtri()!=null){item.setIdRequAtri(requisicoesMovimentoRequestDTO.getIdRequAtri());}
			if(requisicoesMovimentoRequestDTO.getIdMovimento()!=null){item.setIdMovimento(requisicoesMovimentoRequestDTO.getIdMovimento());}
			return ResponseEntity.status(HttpStatus.OK).body(new RequisicoesMovimentoResponseDTO(requisicoesMovimentoRepository.save(item)));
		}
	}

	public Object delete(Long id) {
		Optional<RequisicoesMovimento> optional = requisicoesMovimentoRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(REQUISICOESMOVIMENTOSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			requisicoesMovimentoRepository.delete(optional.get());
			return ResponseEntity.status(HttpStatus.OK).build();
		}
	}

}
//2023-01-28 00:01:50