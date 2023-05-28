package com.ce.service;

import com.ce.model.Movimentacoes;
import com.ce.dto.MovimentacoesRequestDTO;
import com.ce.dto.MovimentacoesResponseDTO;
import com.ce.repository.MovimentacoesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Service
public class MovimentacoesService {
	private final String MOVIMENTACOESSERVICE_REGISTRO_N_ENCONTRADO ="Registro não encontrado";
	@Autowired
	MovimentacoesRepository movimentacoesRepository;

	public Object getAll(){
		return movimentacoesRepository.findAll().stream().map((item)-> new MovimentacoesRequestDTO(item));
	}

	@Transactional
	public Object save(MovimentacoesRequestDTO movimentacoesRequestDTO) {
		Movimentacoes movimentacoes = new Movimentacoes(movimentacoesRequestDTO); 
		return ResponseEntity.status(HttpStatus.CREATED).body( new MovimentacoesResponseDTO(movimentacoesRepository.save(movimentacoes)));
	
}
	public ResponseEntity<Object> findById(Long id) {
		Optional<Movimentacoes> optional = movimentacoesRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(MOVIMENTACOESSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			return ResponseEntity.status(HttpStatus.OK).body(new MovimentacoesResponseDTO(optional.get()));
		}
	}

	@Transactional
	public ResponseEntity<Object> update(Long id, MovimentacoesRequestDTO movimentacoesRequestDTO) {
		Optional<Movimentacoes> optional = movimentacoesRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(MOVIMENTACOESSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			Movimentacoes item = optional.get();
			if(movimentacoesRequestDTO.getDtMovimento()!=null){item.setDtMovimento(movimentacoesRequestDTO.getDtMovimento());}
			if(movimentacoesRequestDTO.getIdTipoMovi()!=null){item.setIdTipoMovi(movimentacoesRequestDTO.getIdTipoMovi());}
			if(movimentacoesRequestDTO.getTiOperacao()!=null){item.setTiOperacao(movimentacoesRequestDTO.getTiOperacao());}
			if(movimentacoesRequestDTO.getIdMaterial()!=null){item.setIdMaterial(movimentacoesRequestDTO.getIdMaterial());}
			if(movimentacoesRequestDTO.getIdAtriEsto()!=null){item.setIdAtriEsto(movimentacoesRequestDTO.getIdAtriEsto());}
			if(movimentacoesRequestDTO.getQtMovimento()!=null){item.setQtMovimento(movimentacoesRequestDTO.getQtMovimento());}
			if(movimentacoesRequestDTO.getIdArmazem()!=null){item.setIdArmazem(movimentacoesRequestDTO.getIdArmazem());}
			return ResponseEntity.status(HttpStatus.OK).body(new MovimentacoesResponseDTO(movimentacoesRepository.save(item)));
		}
	}

	public Object delete(Long id) {
		Optional<Movimentacoes> optional = movimentacoesRepository.findById(id);
		if(optional.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(MOVIMENTACOESSERVICE_REGISTRO_N_ENCONTRADO);
		}else{
			movimentacoesRepository.delete(optional.get());
			return ResponseEntity.status(HttpStatus.OK).build();
		}
	}

}
//2023-01-28 00:01:50