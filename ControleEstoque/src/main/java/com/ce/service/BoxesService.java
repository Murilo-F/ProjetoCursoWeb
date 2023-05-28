package com.ce.service;

import com.ce.model.Boxes;
import com.ce.dto.BoxesRequestDTO;
import com.ce.dto.BoxesResponseDTO;
import com.ce.repository.BoxesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Service
public class BoxesService {
	private final String BOXESSERVICE_REGISTRO_N_ENCONTRADO ="Registro não encontrado";
	@Autowired
	BoxesRepository boxesRepository;

	public Object getAll(){
		return boxesRepository.findAll().stream().map((item)-> new BoxesRequestDTO(item));
	}

	@Transactional
	public Object save(BoxesRequestDTO boxesRequestDTO) {
		Boxes boxes = new Boxes(boxesRequestDTO); 
		return ResponseEntity.status(HttpStatus.CREATED).body( new BoxesResponseDTO(boxesRepository.save(boxes)));
	
}
	public ResponseEntity<Object> findById(Long id) {
		Optional<Boxes> optional = boxesRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(BOXESSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			return ResponseEntity.status(HttpStatus.OK).body(new BoxesResponseDTO(optional.get()));
		}
	}

	@Transactional
	public ResponseEntity<Object> update(Long id, BoxesRequestDTO boxesRequestDTO) {
		Optional<Boxes> optional = boxesRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(BOXESSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			Boxes item = optional.get();
			if(boxesRequestDTO.getCdBox()!=null){item.setCdBox(boxesRequestDTO.getCdBox());}
			if(boxesRequestDTO.getIdArmazem()!=null){item.setIdArmazem(boxesRequestDTO.getIdArmazem());}
			return ResponseEntity.status(HttpStatus.OK).body(new BoxesResponseDTO(boxesRepository.save(item)));
		}
	}

	public Object delete(Long id) {
		Optional<Boxes> optional = boxesRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(BOXESSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			boxesRepository.delete(optional.get());
			return ResponseEntity.status(HttpStatus.OK).build();
		}
	}

}
//2023-01-28 00:01:50