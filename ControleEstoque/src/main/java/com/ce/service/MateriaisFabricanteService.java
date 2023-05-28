package com.ce.service;

import com.ce.model.MateriaisFabricante;
import com.ce.dto.MateriaisFabricanteRequestDTO;
import com.ce.dto.MateriaisFabricanteResponseDTO;
import com.ce.repository.MateriaisFabricanteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Service
public class MateriaisFabricanteService {
	private final String MATERIAISFABRICANTESERVICE_REGISTRO_N_ENCONTRADO ="Registro não encontrado";
	@Autowired
	MateriaisFabricanteRepository materiaisFabricanteRepository;

	public Object getAll(){
		return materiaisFabricanteRepository.findAll().stream().map((item)-> new MateriaisFabricanteRequestDTO(item));
	}

	@Transactional
	public Object save(MateriaisFabricanteRequestDTO materiaisFabricanteRequestDTO) {
		MateriaisFabricante materiaisFabricante = new MateriaisFabricante(materiaisFabricanteRequestDTO); 
		return ResponseEntity.status(HttpStatus.CREATED).body( new MateriaisFabricanteResponseDTO(materiaisFabricanteRepository.save(materiaisFabricante)));
	
}
	public ResponseEntity<Object> findById(Long id) {
		Optional<MateriaisFabricante> optional = materiaisFabricanteRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(MATERIAISFABRICANTESERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			return ResponseEntity.status(HttpStatus.OK).body(new MateriaisFabricanteResponseDTO(optional.get()));
		}
	}

	@Transactional
	public ResponseEntity<Object> update(Long id, MateriaisFabricanteRequestDTO materiaisFabricanteRequestDTO) {
		Optional<MateriaisFabricante> optional = materiaisFabricanteRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(MATERIAISFABRICANTESERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			MateriaisFabricante item = optional.get();
			if(materiaisFabricanteRequestDTO.getIdMaterial()!=null){item.setIdMaterial(materiaisFabricanteRequestDTO.getIdMaterial());}
			if(materiaisFabricanteRequestDTO.getIdFabricante()!=null){item.setIdFabricante(materiaisFabricanteRequestDTO.getIdFabricante());}
			if(materiaisFabricanteRequestDTO.getCdEan13()!=null){item.setCdEan13(materiaisFabricanteRequestDTO.getCdEan13());}
			return ResponseEntity.status(HttpStatus.OK).body(new MateriaisFabricanteResponseDTO(materiaisFabricanteRepository.save(item)));
		}
	}

	public Object delete(Long id) {
		Optional<MateriaisFabricante> optional = materiaisFabricanteRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(MATERIAISFABRICANTESERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			materiaisFabricanteRepository.delete(optional.get());
			return ResponseEntity.status(HttpStatus.OK).build();
		}
	}

}
//2023-01-28 00:01:50