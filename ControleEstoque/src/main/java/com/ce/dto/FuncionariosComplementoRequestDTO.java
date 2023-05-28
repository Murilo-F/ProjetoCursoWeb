package com.ce.dto;

import com.ce.model.FuncionariosComplemento;

public class FuncionariosComplementoRequestDTO extends FuncionariosComplemento{

	public FuncionariosComplementoRequestDTO() {
	}

	public FuncionariosComplementoRequestDTO(Long id, Integer idFuncionario, String nmFuncionario) {
		setId(id);
		setIdFuncionario(idFuncionario);
		setNmFuncionario(nmFuncionario);
	}

	public FuncionariosComplementoRequestDTO(FuncionariosComplemento funcionariosComplemento) {
		setId(funcionariosComplemento.getId());
		setIdFuncionario(funcionariosComplemento.getIdFuncionario());
		setNmFuncionario(funcionariosComplemento.getNmFuncionario());
	}
}
//2023-01-28 00:01:50