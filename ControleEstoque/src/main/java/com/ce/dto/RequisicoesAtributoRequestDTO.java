package com.ce.dto;

import com.ce.model.RequisicoesAtributo;

public class RequisicoesAtributoRequestDTO extends RequisicoesAtributo{

	public RequisicoesAtributoRequestDTO() {
	}

	public RequisicoesAtributoRequestDTO(Long idRequItem, Integer idAtriEsto, Double qtRequisicao, Integer idArmazem) {
		setIdRequItem(idRequItem);
		setIdAtriEsto(idAtriEsto);
		setQtRequisicao(qtRequisicao);
		setIdArmazem(idArmazem);
	}

	public RequisicoesAtributoRequestDTO(RequisicoesAtributo requisicoesAtributo) {
		setIdRequItem(requisicoesAtributo.getIdRequItem());
		setIdAtriEsto(requisicoesAtributo.getIdAtriEsto());
		setQtRequisicao(requisicoesAtributo.getQtRequisicao());
		setIdArmazem(requisicoesAtributo.getIdArmazem());
	}
}
//2023-01-28 00:01:50