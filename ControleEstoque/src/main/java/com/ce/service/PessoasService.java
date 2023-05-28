package com.ce.service;

import com.ce.model.Pessoas;
import com.ce.dto.PessoasRequestDTO;
import com.ce.dto.PessoasResponseDTO;
import com.ce.repository.PessoasRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Service
public class PessoasService {
	private final String PESSOASSERVICE_REGISTRO_N_ENCONTRADO ="Registro não encontrado";
	@Autowired
	PessoasRepository pessoasRepository;

	public Object getAll(){
		return pessoasRepository.findAll().stream().map((item)-> new PessoasRequestDTO(item));
	}

	@Transactional
	public Object save(PessoasRequestDTO pessoasRequestDTO) {
		Pessoas pessoas = new Pessoas(pessoasRequestDTO); 
		return ResponseEntity.status(HttpStatus.CREATED).body( new PessoasResponseDTO(pessoasRepository.save(pessoas)));
	
}
	public ResponseEntity<Object> findById(Long id) {
		Optional<Pessoas> optional = pessoasRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(PESSOASSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			return ResponseEntity.status(HttpStatus.OK).body(new PessoasResponseDTO(optional.get()));
		}
	}

	@Transactional
	public ResponseEntity<Object> update(Long id, PessoasRequestDTO pessoasRequestDTO) {
		Optional<Pessoas> optional = pessoasRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(PESSOASSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			Pessoas item = optional.get();
			if(pessoasRequestDTO.getNmPessoa()!=null){item.setNmPessoa(pessoasRequestDTO.getNmPessoa());}
			if(pessoasRequestDTO.getStPessoa()!=null){item.setStPessoa(pessoasRequestDTO.getStPessoa());}
			return ResponseEntity.status(HttpStatus.OK).body(new PessoasResponseDTO(pessoasRepository.save(item)));
		}
	}

	public Object delete(Long id) {
		Optional<Pessoas> optional = pessoasRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(PESSOASSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			pessoasRepository.delete(optional.get());
			return ResponseEntity.status(HttpStatus.OK).build();
		}
	}

}
//2023-01-28 00:01:50