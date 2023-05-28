package com.ce.dto;

import com.ce.model.RequisicoesItem;

public class RequisicoesItemRequestDTO extends RequisicoesItem{

	public RequisicoesItemRequestDTO() {
	}

	public RequisicoesItemRequestDTO(Long id, Integer idRequisicao, Integer idMaterial) {
		setId(id);
		setIdRequisicao(idRequisicao);
		setIdMaterial(idMaterial);
	}

	public RequisicoesItemRequestDTO(RequisicoesItem requisicoesItem) {
		setId(requisicoesItem.getId());
		setIdRequisicao(requisicoesItem.getIdRequisicao());
		setIdMaterial(requisicoesItem.getIdMaterial());
	}
}
//2023-01-28 00:01:50