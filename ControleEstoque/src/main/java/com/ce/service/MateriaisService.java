package com.ce.service;

import com.ce.model.Materiais;
import com.ce.dto.MateriaisRequestDTO;
import com.ce.dto.MateriaisResponseDTO;
import com.ce.repository.MateriaisRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Service
public class MateriaisService {
	private final String MATERIAISSERVICE_REGISTRO_N_ENCONTRADO ="Registro não encontrado";
	@Autowired
	MateriaisRepository materiaisRepository;

	public Object getAll(){
		return materiaisRepository.findAll().stream().map((item)-> new MateriaisRequestDTO(item));
	}

	@Transactional
	public Object save(MateriaisRequestDTO materiaisRequestDTO) {
		Materiais materiais = new Materiais(materiaisRequestDTO); 
		return ResponseEntity.status(HttpStatus.CREATED).body( new MateriaisResponseDTO(materiaisRepository.save(materiais)));
	
}
	public ResponseEntity<Object> findById(Long id) {
		Optional<Materiais> optional = materiaisRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(MATERIAISSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			return ResponseEntity.status(HttpStatus.OK).body(new MateriaisResponseDTO(optional.get()));
		}
	}

	@Transactional
	public ResponseEntity<Object> update(Long id, MateriaisRequestDTO materiaisRequestDTO) {
		Optional<Materiais> optional = materiaisRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(MATERIAISSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			Materiais item = optional.get();
			if(materiaisRequestDTO.getNmMaterial()!=null){item.setNmMaterial(materiaisRequestDTO.getNmMaterial());}
			if(materiaisRequestDTO.getStMaterial()!=null){item.setStMaterial(materiaisRequestDTO.getStMaterial());}
			if(materiaisRequestDTO.getVlCompra()!=null){item.setVlCompra(materiaisRequestDTO.getVlCompra());}
			if(materiaisRequestDTO.getQtMinima()!=null){item.setQtMinima(materiaisRequestDTO.getQtMinima());}
			if(materiaisRequestDTO.getIdUnimed()!=null){item.setIdUnimed(materiaisRequestDTO.getIdUnimed());}
			return ResponseEntity.status(HttpStatus.OK).body(new MateriaisResponseDTO(materiaisRepository.save(item)));
		}
	}

	public Object delete(Long id) {
		Optional<Materiais> optional = materiaisRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(MATERIAISSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			materiaisRepository.delete(optional.get());
			return ResponseEntity.status(HttpStatus.OK).build();
		}
	}

}
//2023-01-28 00:01:50