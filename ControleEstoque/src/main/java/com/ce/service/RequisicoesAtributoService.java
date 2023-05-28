package com.ce.service;

import com.ce.model.RequisicoesAtributo;
import com.ce.dto.RequisicoesAtributoRequestDTO;
import com.ce.dto.RequisicoesAtributoResponseDTO;
import com.ce.repository.RequisicoesAtributoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Service
public class RequisicoesAtributoService {
	private final String REQUISICOESATRIBUTOSERVICE_REGISTRO_N_ENCONTRADO ="Registro não encontrado";
	@Autowired
	RequisicoesAtributoRepository requisicoesAtributoRepository;

	public Object getAll(){
		return requisicoesAtributoRepository.findAll().stream().map((item)-> new RequisicoesAtributoRequestDTO(item));
	}

	@Transactional
	public Object save(RequisicoesAtributoRequestDTO requisicoesAtributoRequestDTO) {
		RequisicoesAtributo requisicoesAtributo = new RequisicoesAtributo(requisicoesAtributoRequestDTO); 
		return ResponseEntity.status(HttpStatus.CREATED).body( new RequisicoesAtributoResponseDTO(requisicoesAtributoRepository.save(requisicoesAtributo)));
	
}
	public ResponseEntity<Object> findById(Long id) {
		Optional<RequisicoesAtributo> optional = requisicoesAtributoRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(REQUISICOESATRIBUTOSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			return ResponseEntity.status(HttpStatus.OK).body(new RequisicoesAtributoResponseDTO(optional.get()));
		}
	}

	@Transactional
	public ResponseEntity<Object> update(Long id, RequisicoesAtributoRequestDTO requisicoesAtributoRequestDTO) {
		Optional<RequisicoesAtributo> optional = requisicoesAtributoRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(REQUISICOESATRIBUTOSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			RequisicoesAtributo item = optional.get();
			if(requisicoesAtributoRequestDTO.getIdRequItem()!=null){item.setIdRequItem(requisicoesAtributoRequestDTO.getIdRequItem());}
			if(requisicoesAtributoRequestDTO.getIdAtriEsto()!=null){item.setIdAtriEsto(requisicoesAtributoRequestDTO.getIdAtriEsto());}
			if(requisicoesAtributoRequestDTO.getQtRequisicao()!=null){item.setQtRequisicao(requisicoesAtributoRequestDTO.getQtRequisicao());}
			if(requisicoesAtributoRequestDTO.getIdArmazem()!=null){item.setIdArmazem(requisicoesAtributoRequestDTO.getIdArmazem());}
			return ResponseEntity.status(HttpStatus.OK).body(new RequisicoesAtributoResponseDTO(requisicoesAtributoRepository.save(item)));
		}
	}

	public Object delete(Long id) {
		Optional<RequisicoesAtributo> optional = requisicoesAtributoRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(REQUISICOESATRIBUTOSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			requisicoesAtributoRepository.delete(optional.get());
			return ResponseEntity.status(HttpStatus.OK).build();
		}
	}

}
//2023-01-28 00:01:50