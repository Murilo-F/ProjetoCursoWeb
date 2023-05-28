package com.ce.dto;

import com.ce.model.RequisicoesMovimento;

public class RequisicoesMovimentoResponseDTO extends RequisicoesMovimento{

	public RequisicoesMovimentoResponseDTO() {
	}

	public RequisicoesMovimentoResponseDTO(Long id, Integer idRequAtri, Integer idMovimento) {
		setId(id);
		setIdRequAtri(idRequAtri);
		setIdMovimento(idMovimento);
	}

	public RequisicoesMovimentoResponseDTO(RequisicoesMovimento requisicoesMovimento) {
		setId(requisicoesMovimento.getId());
		setIdRequAtri(requisicoesMovimento.getIdRequAtri());
		setIdMovimento(requisicoesMovimento.getIdMovimento());
	}
}
//2023-01-28 00:01:50