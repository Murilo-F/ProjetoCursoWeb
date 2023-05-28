package com.ce.service;

import com.ce.model.AtributosEstoque;
import com.ce.dto.AtributosEstoqueRequestDTO;
import com.ce.dto.AtributosEstoqueResponseDTO;
import com.ce.repository.AtributosEstoqueRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Service
public class AtributosEstoqueService {
	private final String ATRIBUTOSESTOQUESERVICE_REGISTRO_N_ENCONTRADO ="Registro não encontrado";
	@Autowired
	AtributosEstoqueRepository atributosEstoqueRepository;

	public Object getAll(){
		return atributosEstoqueRepository.findAll().stream().map((item)-> new AtributosEstoqueRequestDTO(item));
	}

	@Transactional
	public Object save(AtributosEstoqueRequestDTO atributosEstoqueRequestDTO) {
		AtributosEstoque atributosEstoque = new AtributosEstoque(atributosEstoqueRequestDTO); 
		return ResponseEntity.status(HttpStatus.CREATED).body( new AtributosEstoqueResponseDTO(atributosEstoqueRepository.save(atributosEstoque)));
	
}
	public ResponseEntity<Object> findById(Long id) {
		Optional<AtributosEstoque> optional = atributosEstoqueRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ATRIBUTOSESTOQUESERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			return ResponseEntity.status(HttpStatus.OK).body(new AtributosEstoqueResponseDTO(optional.get()));
		}
	}

	@Transactional
	public ResponseEntity<Object> update(Long id, AtributosEstoqueRequestDTO atributosEstoqueRequestDTO) {
		Optional<AtributosEstoque> optional = atributosEstoqueRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ATRIBUTOSESTOQUESERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			AtributosEstoque item = optional.get();
			if(atributosEstoqueRequestDTO.getIdFabricante()!=null){item.setIdFabricante(atributosEstoqueRequestDTO.getIdFabricante());}
			if(atributosEstoqueRequestDTO.getIdLoteEstoque()!=null){item.setIdLoteEstoque(atributosEstoqueRequestDTO.getIdLoteEstoque());}
			if(atributosEstoqueRequestDTO.getIdBox()!=null){item.setIdBox(atributosEstoqueRequestDTO.getIdBox());}
			return ResponseEntity.status(HttpStatus.OK).body(new AtributosEstoqueResponseDTO(atributosEstoqueRepository.save(item)));
		}
	}

	public Object delete(Long id) {
		Optional<AtributosEstoque> optional = atributosEstoqueRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ATRIBUTOSESTOQUESERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			atributosEstoqueRepository.delete(optional.get());
			return ResponseEntity.status(HttpStatus.OK).build();
		}
	}

}
//2023-01-28 00:01:50