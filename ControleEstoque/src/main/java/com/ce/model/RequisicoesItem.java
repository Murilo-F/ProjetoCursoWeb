package com.ce.model;

import com.ce.dto.RequisicoesItemRequestDTO;
import jakarta.persistence.*;

@Entity
public class RequisicoesItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "idRequisicao")
	Integer idRequisicao;

	@Column(name = "idMaterial")
	Integer idMaterial;

	public RequisicoesItem() {
	}

	public RequisicoesItem(Long id, Integer idRequisicao, Integer idMaterial) {
		this.id = id;
		this.idRequisicao = idRequisicao;
		this.idMaterial = idMaterial;
	}

	public RequisicoesItem(RequisicoesItemRequestDTO requisicoesItemRequestDTO) {
		this.id = requisicoesItemRequestDTO.getId();
		this.idRequisicao = requisicoesItemRequestDTO.getIdRequisicao();
		this.idMaterial = requisicoesItemRequestDTO.getIdMaterial();
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public Integer getIdRequisicao() { return idRequisicao; }
	public void setIdRequisicao(Integer idRequisicao) { this.idRequisicao = idRequisicao; }
	public Integer getIdMaterial() { return idMaterial; }
	public void setIdMaterial(Integer idMaterial) { this.idMaterial = idMaterial; }
}
//2023-01-28 00:01:50