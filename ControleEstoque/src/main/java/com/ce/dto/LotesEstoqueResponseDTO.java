package com.ce.dto;

import com.ce.model.LotesEstoque;

public class LotesEstoqueResponseDTO extends LotesEstoque{

	public LotesEstoqueResponseDTO() {
	}

	public LotesEstoqueResponseDTO(Long id, String cdLote) {
		setId(id);
		setCdLote(cdLote);
	}

	public LotesEstoqueResponseDTO(LotesEstoque lotesEstoque) {
		setId(lotesEstoque.getId());
		setCdLote(lotesEstoque.getCdLote());
	}
}
//2023-01-28 00:01:50