package com.ce.dto;

import com.ce.model.LotesEstoque;

public class LotesEstoqueRequestDTO extends LotesEstoque{

	public LotesEstoqueRequestDTO() {
	}

	public LotesEstoqueRequestDTO(Long id, String cdLote) {
		setId(id);
		setCdLote(cdLote);
	}

	public LotesEstoqueRequestDTO(LotesEstoque lotesEstoque) {
		setId(lotesEstoque.getId());
		setCdLote(lotesEstoque.getCdLote());
	}
}
//2023-01-28 00:01:50