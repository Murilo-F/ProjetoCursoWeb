package com.ce.dto;

import com.ce.model.Armazens;

public class ArmazensRequestDTO extends Armazens{

	public ArmazensRequestDTO() {
	}

	public ArmazensRequestDTO(Long id, String dsArmazem) {
		setId(id);
		setDsArmazem(dsArmazem);
	}

	public ArmazensRequestDTO(Armazens armazens) {
		setId(armazens.getId());
		setDsArmazem(armazens.getDsArmazem());
	}
}
//2023-01-28 00:01:50