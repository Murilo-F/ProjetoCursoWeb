package com.ce.dto;

import com.ce.model.FuncionariosComplemento;

public class FuncionariosComplementoResponseDTO extends FuncionariosComplemento{

	public FuncionariosComplementoResponseDTO() {
	}

	public FuncionariosComplementoResponseDTO(Long id, Integer idFuncionario, String nmFuncionario) {
		setId(id);
		setIdFuncionario(idFuncionario);
		setNmFuncionario(nmFuncionario);
	}

	public FuncionariosComplementoResponseDTO(FuncionariosComplemento funcionariosComplemento) {
		setId(funcionariosComplemento.getId());
		setIdFuncionario(funcionariosComplemento.getIdFuncionario());
		setNmFuncionario(funcionariosComplemento.getNmFuncionario());
	}
}
//2023-01-28 00:01:50