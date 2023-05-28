package com.ce.dto;

import com.ce.model.UnidadesMedida;

public class UnidadesMedidaResponseDTO extends UnidadesMedida {

    public UnidadesMedidaResponseDTO() {
    }

    public UnidadesMedidaResponseDTO(Long id, String dsUnimed, String dsSigla) {
        super(id, dsUnimed, dsSigla);
    }

    public UnidadesMedidaResponseDTO(UnidadesMedida unidadesMedida) {
        this.setDsUnimed(unidadesMedida.getDsUnimed());
        this.setDsSigla(unidadesMedida.getDsSigla());
    }
}
