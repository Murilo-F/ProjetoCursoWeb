package com.ce.model;

import com.ce.dto.MateriaisRequestDTO;
import jakarta.persistence.*;

@Entity
public class Materiais {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "nmMaterial")
	String nmMaterial;

	@Column(name = "stMaterial")
	Integer stMaterial;

	@Column(name = "vlCompra")
	Double vlCompra;

	@Column(name = "qtMinima")
	Double qtMinima;

	@Column(name = "idUnimed")
	Integer idUnimed;

	public Materiais() {
	}

	public Materiais(Long id, String nmMaterial, Integer stMaterial, Double vlCompra, Double qtMinima, Integer idUnimed) {
		this.id = id;
		this.nmMaterial = nmMaterial;
		this.stMaterial = stMaterial;
		this.vlCompra = vlCompra;
		this.qtMinima = qtMinima;
		this.idUnimed = idUnimed;
	}

	public Materiais(MateriaisRequestDTO materiaisRequestDTO) {
		this.id = materiaisRequestDTO.getId();
		this.nmMaterial = materiaisRequestDTO.getNmMaterial();
		this.stMaterial = materiaisRequestDTO.getStMaterial();
		this.vlCompra = materiaisRequestDTO.getVlCompra();
		this.qtMinima = materiaisRequestDTO.getQtMinima();
		this.idUnimed = materiaisRequestDTO.getIdUnimed();
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public String getNmMaterial() { return nmMaterial; }
	public void setNmMaterial(String nmMaterial) { this.nmMaterial = nmMaterial; }
	public Integer getStMaterial() { return stMaterial; }
	public void setStMaterial(Integer stMaterial) { this.stMaterial = stMaterial; }
	public Double getVlCompra() { return vlCompra; }
	public void setVlCompra(Double vlCompra) { this.vlCompra = vlCompra; }
	public Double getQtMinima() { return qtMinima; }
	public void setQtMinima(Double qtMinima) { this.qtMinima = qtMinima; }
	public Integer getIdUnimed() { return idUnimed; }
	public void setIdUnimed(Integer idUnimed) { this.idUnimed = idUnimed; }
}
//2023-01-28 00:01:50