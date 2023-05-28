package com.ce.model;

import com.ce.dto.RequisicoesMovimentoRequestDTO;
import jakarta.persistence.*;

@Entity
public class RequisicoesMovimento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "idRequAtri")
	Integer idRequAtri;

	@Column(name = "idMovimento")
	Integer idMovimento;

	public RequisicoesMovimento() {
	}

	public RequisicoesMovimento(Long id, Integer idRequAtri, Integer idMovimento) {
		this.id = id;
		this.idRequAtri = idRequAtri;
		this.idMovimento = idMovimento;
	}

	public RequisicoesMovimento(RequisicoesMovimentoRequestDTO requisicoesMovimentoRequestDTO) {
		this.id = requisicoesMovimentoRequestDTO.getId();
		this.idRequAtri = requisicoesMovimentoRequestDTO.getIdRequAtri();
		this.idMovimento = requisicoesMovimentoRequestDTO.getIdMovimento();
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public Integer getIdRequAtri() { return idRequAtri; }
	public void setIdRequAtri(Integer idRequAtri) { this.idRequAtri = idRequAtri; }
	public Integer getIdMovimento() { return idMovimento; }
	public void setIdMovimento(Integer idMovimento) { this.idMovimento = idMovimento; }
}
//2023-01-28 00:01:50