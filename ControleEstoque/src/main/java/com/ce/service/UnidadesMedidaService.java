package com.ce.service;

import com.ce.model.UnidadesMedida;
import com.ce.dto.UnidadesMedidaRequestDTO;
import com.ce.dto.UnidadesMedidaResponseDTO;
import com.ce.repository.UnidadesMedidaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Service
public class UnidadesMedidaService {
	private final String UNIDADESMEDIDASERVICE_REGISTRO_N_ENCONTRADO ="Registro não encontrado";
	@Autowired
	UnidadesMedidaRepository unidadesMedidaRepository;

	public Object getAll(){
		return unidadesMedidaRepository.findAll().stream().map((item)-> new UnidadesMedidaRequestDTO(item));
	}

	@Transactional
	public Object save(UnidadesMedidaRequestDTO unidadesMedidaRequestDTO) {
		UnidadesMedida unidadesMedida = new UnidadesMedida(unidadesMedidaRequestDTO); 
		return ResponseEntity.status(HttpStatus.CREATED).body( new UnidadesMedidaResponseDTO(unidadesMedidaRepository.save(unidadesMedida)));
	
}
	public ResponseEntity<Object> findById(Long id) {
		Optional<UnidadesMedida> optional = unidadesMedidaRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(UNIDADESMEDIDASERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			return ResponseEntity.status(HttpStatus.OK).body(new UnidadesMedidaResponseDTO(optional.get()));
		}
	}

	@Transactional
	public ResponseEntity<Object> update(Long id, UnidadesMedidaRequestDTO unidadesMedidaRequestDTO) {
		Optional<UnidadesMedida> optional = unidadesMedidaRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(UNIDADESMEDIDASERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			UnidadesMedida item = optional.get();
			if(unidadesMedidaRequestDTO.getDsUnimed()!=null){item.setDsUnimed(unidadesMedidaRequestDTO.getDsUnimed());}
			if(unidadesMedidaRequestDTO.getDsSigla()!=null){item.setDsSigla(unidadesMedidaRequestDTO.getDsSigla());}
			return ResponseEntity.status(HttpStatus.OK).body(new UnidadesMedidaResponseDTO(unidadesMedidaRepository.save(item)));
		}
	}

	public Object delete(Long id) {
		Optional<UnidadesMedida> optional = unidadesMedidaRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(UNIDADESMEDIDASERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			unidadesMedidaRepository.delete(optional.get());
			return ResponseEntity.status(HttpStatus.OK).build();
		}
	}

}
//2023-01-28 00:01:50