package com.ce.dto;

import com.ce.model.UnidadesMedida;

public class UnidadesMedidaRequestDTO extends UnidadesMedida{

	public UnidadesMedidaRequestDTO() {
	}

	public UnidadesMedidaRequestDTO(Long id, String dsUnimed, String dsSigla) {
		setId(id);
		setDsUnimed(dsUnimed);
		setDsSigla(dsSigla);
	}

	public UnidadesMedidaRequestDTO(UnidadesMedida unidadesMedida) {
		setId(unidadesMedida.getId());
		setDsUnimed(unidadesMedida.getDsUnimed());
		setDsSigla(unidadesMedida.getDsSigla());
	}
}
//2023-01-28 00:01:50