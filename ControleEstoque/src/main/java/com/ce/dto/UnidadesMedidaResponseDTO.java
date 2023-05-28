package com.ce.dto;

import com.ce.model.UnidadesMedida;

public class UnidadesMedidaResponseDTO extends UnidadesMedida{

	public UnidadesMedidaResponseDTO() {
	}

	public UnidadesMedidaResponseDTO(Long id, String dsUnimed, String dsSigla) {
		setId(id);
		setDsUnimed(dsUnimed);
		setDsSigla(dsSigla);
	}

	public UnidadesMedidaResponseDTO(UnidadesMedida unidadesMedida) {
		setId(unidadesMedida.getId());
		setDsUnimed(unidadesMedida.getDsUnimed());
		setDsSigla(unidadesMedida.getDsSigla());
	}
}
//2023-01-28 00:01:50