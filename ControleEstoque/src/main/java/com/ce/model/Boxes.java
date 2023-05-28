package com.ce.model;

import com.ce.dto.BoxesRequestDTO;
import jakarta.persistence.*;

@Entity
public class Boxes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "cdBox")
	String cdBox;

	@Column(name = "idArmazem")
	Integer idArmazem;

	public Boxes() {
	}

	public Boxes(Long id, String cdBox, Integer idArmazem) {
		this.id = id;
		this.cdBox = cdBox;
		this.idArmazem = idArmazem;
	}

	public Boxes(BoxesRequestDTO boxesRequestDTO) {
		this.id = boxesRequestDTO.getId();
		this.cdBox = boxesRequestDTO.getCdBox();
		this.idArmazem = boxesRequestDTO.getIdArmazem();
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public String getCdBox() { return cdBox; }
	public void setCdBox(String cdBox) { this.cdBox = cdBox; }
	public Integer getIdArmazem() { return idArmazem; }
	public void setIdArmazem(Integer idArmazem) { this.idArmazem = idArmazem; }
}
//2023-01-28 00:01:50