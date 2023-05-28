package com.ce.dto;

import com.ce.model.AtributosEstoque;

public class AtributosEstoqueResponseDTO extends AtributosEstoque{

	public AtributosEstoqueResponseDTO() {
	}

	public AtributosEstoqueResponseDTO(Long id, Integer idFabricante, Integer idLoteEstoque, Integer idBox) {
		setId(id);
		setIdFabricante(idFabricante);
		setIdLoteEstoque(idLoteEstoque);
		setIdBox(idBox);
	}

	public AtributosEstoqueResponseDTO(AtributosEstoque atributosEstoque) {
		setId(atributosEstoque.getId());
		setIdFabricante(atributosEstoque.getIdFabricante());
		setIdLoteEstoque(atributosEstoque.getIdLoteEstoque());
		setIdBox(atributosEstoque.getIdBox());
	}
}
//2023-01-28 00:01:50