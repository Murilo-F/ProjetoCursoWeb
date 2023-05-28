package com.ce.model;

import com.ce.dto.AtributosEstoqueRequestDTO;
import jakarta.persistence.*;

@Entity
public class AtributosEstoque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "idFabricante")
	Integer idFabricante;

	@Column(name = "idLoteEstoque")
	Integer idLoteEstoque;

	@Column(name = "idBox")
	Integer idBox;

	public AtributosEstoque() {
	}

	public AtributosEstoque(Long id, Integer idFabricante, Integer idLoteEstoque, Integer idBox) {
		this.id = id;
		this.idFabricante = idFabricante;
		this.idLoteEstoque = idLoteEstoque;
		this.idBox = idBox;
	}

	public AtributosEstoque(AtributosEstoqueRequestDTO atributosEstoqueRequestDTO) {
		this.id = atributosEstoqueRequestDTO.getId();
		this.idFabricante = atributosEstoqueRequestDTO.getIdFabricante();
		this.idLoteEstoque = atributosEstoqueRequestDTO.getIdLoteEstoque();
		this.idBox = atributosEstoqueRequestDTO.getIdBox();
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public Integer getIdFabricante() { return idFabricante; }
	public void setIdFabricante(Integer idFabricante) { this.idFabricante = idFabricante; }
	public Integer getIdLoteEstoque() { return idLoteEstoque; }
	public void setIdLoteEstoque(Integer idLoteEstoque) { this.idLoteEstoque = idLoteEstoque; }
	public Integer getIdBox() { return idBox; }
	public void setIdBox(Integer idBox) { this.idBox = idBox; }
}
//2023-01-28 00:01:50