package com.ce.model;

import com.ce.dto.ArmazensRequestDTO;
import jakarta.persistence.*;

@Entity
public class Armazens {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "dsArmazem")
	String dsArmazem;

	public Armazens() {
	}

	public Armazens(Long id, String dsArmazem) {
		this.id = id;
		this.dsArmazem = dsArmazem;
	}

	public Armazens(ArmazensRequestDTO armazensRequestDTO) {
		this.id = armazensRequestDTO.getId();
		this.dsArmazem = armazensRequestDTO.getDsArmazem();
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public String getDsArmazem() { return dsArmazem; }
	public void setDsArmazem(String dsArmazem) { this.dsArmazem = dsArmazem; }
}
//2023-01-28 00:01:50