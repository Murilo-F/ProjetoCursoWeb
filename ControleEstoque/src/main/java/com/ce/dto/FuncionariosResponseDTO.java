package com.ce.dto;

import com.ce.model.Funcionarios;

public class FuncionariosResponseDTO extends Funcionarios{

	public FuncionariosResponseDTO() {
	}

	public FuncionariosResponseDTO(Long id, Integer stFuncionario, String cdLogin, String cdSenha) {
		setId(id);
		setStFuncionario(stFuncionario);
		setCdLogin(cdLogin);
		setCdSenha(cdSenha);
	}

	public FuncionariosResponseDTO(Funcionarios funcionarios) {
		setId(funcionarios.getId());
		setStFuncionario(funcionarios.getStFuncionario());
		setCdLogin(funcionarios.getCdLogin());
		setCdSenha(funcionarios.getCdSenha());
	}
}
//2023-01-28 00:01:50