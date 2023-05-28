package com.ce.dto;

import com.ce.model.Funcionarios;

public class FuncionariosRequestDTO extends Funcionarios{

	public FuncionariosRequestDTO() {
	}

	public FuncionariosRequestDTO(Long id, Integer stFuncionario, String cdLogin, String cdSenha) {
		setId(id);
		setStFuncionario(stFuncionario);
		setCdLogin(cdLogin);
		setCdSenha(cdSenha);
	}

	public FuncionariosRequestDTO(Funcionarios funcionarios) {
		setId(funcionarios.getId());
		setStFuncionario(funcionarios.getStFuncionario());
		setCdLogin(funcionarios.getCdLogin());
		setCdSenha(funcionarios.getCdSenha());
	}
}
//2023-01-28 00:01:50