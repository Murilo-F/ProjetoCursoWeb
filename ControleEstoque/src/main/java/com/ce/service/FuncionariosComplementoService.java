package com.ce.service;

import com.ce.model.FuncionariosComplemento;
import com.ce.dto.FuncionariosComplementoRequestDTO;
import com.ce.dto.FuncionariosComplementoResponseDTO;
import com.ce.repository.FuncionariosComplementoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Service
public class FuncionariosComplementoService {
	private final String FUNCIONARIOSCOMPLEMENTOSERVICE_REGISTRO_N_ENCONTRADO ="Registro não encontrado";
	@Autowired
	FuncionariosComplementoRepository funcionariosComplementoRepository;

	public Object getAll(){
		return funcionariosComplementoRepository.findAll().stream().map((item)-> new FuncionariosComplementoRequestDTO(item));
	}

	@Transactional
	public Object save(FuncionariosComplementoRequestDTO funcionariosComplementoRequestDTO) {
		FuncionariosComplemento funcionariosComplemento = new FuncionariosComplemento(funcionariosComplementoRequestDTO); 
		return ResponseEntity.status(HttpStatus.CREATED).body( new FuncionariosComplementoResponseDTO(funcionariosComplementoRepository.save(funcionariosComplemento)));
	
}
	public ResponseEntity<Object> findById(Long id) {
		Optional<FuncionariosComplemento> optional = funcionariosComplementoRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(FUNCIONARIOSCOMPLEMENTOSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			return ResponseEntity.status(HttpStatus.OK).body(new FuncionariosComplementoResponseDTO(optional.get()));
		}
	}

	@Transactional
	public ResponseEntity<Object> update(Long id, FuncionariosComplementoRequestDTO funcionariosComplementoRequestDTO) {
		Optional<FuncionariosComplemento> optional = funcionariosComplementoRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(FUNCIONARIOSCOMPLEMENTOSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			FuncionariosComplemento item = optional.get();
			if(funcionariosComplementoRequestDTO.getIdFuncionario()!=null){item.setIdFuncionario(funcionariosComplementoRequestDTO.getIdFuncionario());}
			if(funcionariosComplementoRequestDTO.getNmFuncionario()!=null){item.setNmFuncionario(funcionariosComplementoRequestDTO.getNmFuncionario());}
			return ResponseEntity.status(HttpStatus.OK).body(new FuncionariosComplementoResponseDTO(funcionariosComplementoRepository.save(item)));
		}
	}

	public Object delete(Long id) {
		Optional<FuncionariosComplemento> optional = funcionariosComplementoRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(FUNCIONARIOSCOMPLEMENTOSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			funcionariosComplementoRepository.delete(optional.get());
			return ResponseEntity.status(HttpStatus.OK).build();
		}
	}

}
//2023-01-28 00:01:50