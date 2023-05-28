package com.ce.service;

import com.ce.model.RequisicoesItem;
import com.ce.dto.RequisicoesItemRequestDTO;
import com.ce.dto.RequisicoesItemResponseDTO;
import com.ce.repository.RequisicoesItemRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Service
public class RequisicoesItemService {
	private final String REQUISICOESITEMSERVICE_REGISTRO_N_ENCONTRADO ="Registro não encontrado";
	@Autowired
	RequisicoesItemRepository requisicoesItemRepository;

	public Object getAll(){
		return requisicoesItemRepository.findAll().stream().map((item)-> new RequisicoesItemRequestDTO(item));
	}

	@Transactional
	public Object save(RequisicoesItemRequestDTO requisicoesItemRequestDTO) {
		RequisicoesItem requisicoesItem = new RequisicoesItem(requisicoesItemRequestDTO); 
		return ResponseEntity.status(HttpStatus.CREATED).body( new RequisicoesItemResponseDTO(requisicoesItemRepository.save(requisicoesItem)));
	
}
	public ResponseEntity<Object> findById(Long id) {
		Optional<RequisicoesItem> optional = requisicoesItemRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(REQUISICOESITEMSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			return ResponseEntity.status(HttpStatus.OK).body(new RequisicoesItemResponseDTO(optional.get()));
		}
	}

	@Transactional
	public ResponseEntity<Object> update(Long id, RequisicoesItemRequestDTO requisicoesItemRequestDTO) {
		Optional<RequisicoesItem> optional = requisicoesItemRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(REQUISICOESITEMSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			RequisicoesItem item = optional.get();
			if(requisicoesItemRequestDTO.getIdRequisicao()!=null){item.setIdRequisicao(requisicoesItemRequestDTO.getIdRequisicao());}
			if(requisicoesItemRequestDTO.getIdMaterial()!=null){item.setIdMaterial(requisicoesItemRequestDTO.getIdMaterial());}
			return ResponseEntity.status(HttpStatus.OK).body(new RequisicoesItemResponseDTO(requisicoesItemRepository.save(item)));
		}
	}

	public Object delete(Long id) {
		Optional<RequisicoesItem> optional = requisicoesItemRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(REQUISICOESITEMSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			requisicoesItemRepository.delete(optional.get());
			return ResponseEntity.status(HttpStatus.OK).build();
		}
	}

}
//2023-01-28 00:01:50