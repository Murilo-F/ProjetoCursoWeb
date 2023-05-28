package com.ce.dto;

import com.ce.model.Requisicoes;

import java.util.Date;
public class RequisicoesRequestDTO extends Requisicoes{

	public RequisicoesRequestDTO() {
	}

	public RequisicoesRequestDTO(Long id, Integer stRequisicao, Integer idFuncionario, Integer idTipoMovi, Date dtRequisicao) {
		setId(id);
		setStRequisicao(stRequisicao);
		setIdFuncionario(idFuncionario);
		setIdTipoMovi(idTipoMovi);
		setDtRequisicao(dtRequisicao);
	}

	public RequisicoesRequestDTO(Requisicoes requisicoes) {
		setId(requisicoes.getId());
		setStRequisicao(requisicoes.getStRequisicao());
		setIdFuncionario(requisicoes.getIdFuncionario());
		setIdTipoMovi(requisicoes.getIdTipoMovi());
		setDtRequisicao(requisicoes.getDtRequisicao());
	}
}
//2023-01-28 00:01:50