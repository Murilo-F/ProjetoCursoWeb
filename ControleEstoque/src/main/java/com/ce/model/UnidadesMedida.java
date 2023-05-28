package com.ce.model;

import com.ce.dto.UnidadesMedidaRequestDTO;
import jakarta.persistence.*;

@Entity
public class UnidadesMedida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long Id;

    @Column(name = "dsUnimed")
    String dsUnimed;

    @Column(name = "dsSigla")
    String dsSigla;

    public UnidadesMedida() {
    }

    public UnidadesMedida(Long id, String dsUnimed, String dsSigla) {
        Id = id;
        this.dsUnimed = dsUnimed;
        this.dsSigla = dsSigla;
    }

    public UnidadesMedida(UnidadesMedidaRequestDTO unidadesMedidaRequestDTO) {
        this.dsUnimed = unidadesMedidaRequestDTO.getDsUnimed();
        this.dsSigla = unidadesMedidaRequestDTO.getDsSigla();
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDsUnimed() {
        return dsUnimed;
    }

    public void setDsUnimed(String dsUnimed) {
        this.dsUnimed = dsUnimed;
    }

    public String getDsSigla() {
        return dsSigla;
    }

    public void setDsSigla(String dsSigla) {
        this.dsSigla = dsSigla;
    }
}
