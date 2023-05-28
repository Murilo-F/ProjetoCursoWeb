package com.ce.dto;

import com.ce.model.RequisicoesMovimento;

public class RequisicoesMovimentoRequestDTO extends RequisicoesMovimento{

	public RequisicoesMovimentoRequestDTO() {
	}

	public RequisicoesMovimentoRequestDTO(Long id, Integer idRequAtri, Integer idMovimento) {
		setId(id);
		setIdRequAtri(idRequAtri);
		setIdMovimento(idMovimento);
	}

	public RequisicoesMovimentoRequestDTO(RequisicoesMovimento requisicoesMovimento) {
		setId(requisicoesMovimento.getId());
		setIdRequAtri(requisicoesMovimento.getIdRequAtri());
		setIdMovimento(requisicoesMovimento.getIdMovimento());
	}
}
//2023-01-28 00:01:50