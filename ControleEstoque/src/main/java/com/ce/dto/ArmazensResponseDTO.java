package com.ce.dto;

import com.ce.model.Armazens;

public class ArmazensResponseDTO extends Armazens{

	public ArmazensResponseDTO() {
	}

	public ArmazensResponseDTO(Long id, String dsArmazem) {
		setId(id);
		setDsArmazem(dsArmazem);
	}

	public ArmazensResponseDTO(Armazens armazens) {
		setId(armazens.getId());
		setDsArmazem(armazens.getDsArmazem());
	}
}
//2023-01-28 00:01:50