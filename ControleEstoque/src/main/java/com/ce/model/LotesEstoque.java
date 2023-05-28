package com.ce.model;

import com.ce.dto.LotesEstoqueRequestDTO;
import jakarta.persistence.*;

@Entity
public class LotesEstoque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "cdLote")
	String cdLote;

	public LotesEstoque() {
	}

	public LotesEstoque(Long id, String cdLote) {
		this.id = id;
		this.cdLote = cdLote;
	}

	public LotesEstoque(LotesEstoqueRequestDTO lotesEstoqueRequestDTO) {
		this.id = lotesEstoqueRequestDTO.getId();
		this.cdLote = lotesEstoqueRequestDTO.getCdLote();
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public String getCdLote() { return cdLote; }
	public void setCdLote(String cdLote) { this.cdLote = cdLote; }
}
//2023-01-28 00:01:50