package com.ce.model;

import com.ce.dto.UnidadesMedidaRequestDTO;
import jakarta.persistence.*;

@Entity
public class UnidadesMedida {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "dsUnimed")
	String dsUnimed;

	@Column(name = "dsSigla")
	String dsSigla;

	public UnidadesMedida() {
	}

	public UnidadesMedida(Long id, String dsUnimed, String dsSigla) {
		this.id = id;
		this.dsUnimed = dsUnimed;
		this.dsSigla = dsSigla;
	}

	public UnidadesMedida(UnidadesMedidaRequestDTO unidadesMedidaRequestDTO) {
		this.id = unidadesMedidaRequestDTO.getId();
		this.dsUnimed = unidadesMedidaRequestDTO.getDsUnimed();
		this.dsSigla = unidadesMedidaRequestDTO.getDsSigla();
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public String getDsUnimed() { return dsUnimed; }
	public void setDsUnimed(String dsUnimed) { this.dsUnimed = dsUnimed; }
	public String getDsSigla() { return dsSigla; }
	public void setDsSigla(String dsSigla) { this.dsSigla = dsSigla; }
}
//2023-01-28 00:01:50