package com.ce.dto;

import com.ce.model.UnidadesMedida;

public class UnidadesMedidaRequestDTO extends UnidadesMedida {

    public UnidadesMedidaRequestDTO() {
    }

    public UnidadesMedidaRequestDTO(Long id, String dsUnimed, String dsSigla) {
        super(id, dsUnimed, dsSigla);
    }

    public UnidadesMedidaRequestDTO(UnidadesMedida unidadesMedida) {
        this.setId(unidadesMedida.getId());
        this.setDsUnimed(unidadesMedida.getDsUnimed());
        this.setDsSigla(unidadesMedida.getDsSigla());
    }
}
