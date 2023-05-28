package com.ce.model;

import com.ce.dto.MateriaisFabricanteRequestDTO;
import jakarta.persistence.*;

@Entity
public class MateriaisFabricante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "idMaterial")
	Integer idMaterial;

	@Column(name = "idFabricante")
	Integer idFabricante;

	@Column(name = "cdEan13")
	String cdEan13;

	public MateriaisFabricante() {
	}

	public MateriaisFabricante(Long id, Integer idMaterial, Integer idFabricante, String cdEan13) {
		this.id = id;
		this.idMaterial = idMaterial;
		this.idFabricante = idFabricante;
		this.cdEan13 = cdEan13;
	}

	public MateriaisFabricante(MateriaisFabricanteRequestDTO materiaisFabricanteRequestDTO) {
		this.id = materiaisFabricanteRequestDTO.getId();
		this.idMaterial = materiaisFabricanteRequestDTO.getIdMaterial();
		this.idFabricante = materiaisFabricanteRequestDTO.getIdFabricante();
		this.cdEan13 = materiaisFabricanteRequestDTO.getCdEan13();
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public Integer getIdMaterial() { return idMaterial; }
	public void setIdMaterial(Integer idMaterial) { this.idMaterial = idMaterial; }
	public Integer getIdFabricante() { return idFabricante; }
	public void setIdFabricante(Integer idFabricante) { this.idFabricante = idFabricante; }
	public String getCdEan13() { return cdEan13; }
	public void setCdEan13(String cdEan13) { this.cdEan13 = cdEan13; }
}
//2023-01-28 00:01:50