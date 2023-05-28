package com.ce.service;

import com.ce.model.Funcionarios;
import com.ce.dto.FuncionariosRequestDTO;
import com.ce.dto.FuncionariosResponseDTO;
import com.ce.repository.FuncionariosRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Service
public class FuncionariosService {
	private final String FUNCIONARIOSSERVICE_REGISTRO_N_ENCONTRADO ="Registro não encontrado";
	@Autowired
	FuncionariosRepository funcionariosRepository;

	public Object getAll(){
		return funcionariosRepository.findAll().stream().map((item)-> new FuncionariosRequestDTO(item));
	}

	@Transactional
	public Object save(FuncionariosRequestDTO funcionariosRequestDTO) {
		Funcionarios funcionarios = new Funcionarios(funcionariosRequestDTO); 
		return ResponseEntity.status(HttpStatus.CREATED).body( new FuncionariosResponseDTO(funcionariosRepository.save(funcionarios)));
	
}
	public ResponseEntity<Object> findById(Long id) {
		Optional<Funcionarios> optional = funcionariosRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(FUNCIONARIOSSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			return ResponseEntity.status(HttpStatus.OK).body(new FuncionariosResponseDTO(optional.get()));
		}
	}

	@Transactional
	public ResponseEntity<Object> update(Long id, FuncionariosRequestDTO funcionariosRequestDTO) {
		Optional<Funcionarios> optional = funcionariosRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(FUNCIONARIOSSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			Funcionarios item = optional.get();
			if(funcionariosRequestDTO.getStFuncionario()!=null){item.setStFuncionario(funcionariosRequestDTO.getStFuncionario());}
			if(funcionariosRequestDTO.getCdLogin()!=null){item.setCdLogin(funcionariosRequestDTO.getCdLogin());}
			if(funcionariosRequestDTO.getCdSenha()!=null){item.setCdSenha(funcionariosRequestDTO.getCdSenha());}
			return ResponseEntity.status(HttpStatus.OK).body(new FuncionariosResponseDTO(funcionariosRepository.save(item)));
		}
	}

	public Object delete(Long id) {
		Optional<Funcionarios> optional = funcionariosRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(FUNCIONARIOSSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			funcionariosRepository.delete(optional.get());
			return ResponseEntity.status(HttpStatus.OK).build();
		}
	}

}
//2023-01-28 00:01:50