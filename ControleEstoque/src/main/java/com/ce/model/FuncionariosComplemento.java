package com.ce.model;

import com.ce.dto.FuncionariosComplementoRequestDTO;
import jakarta.persistence.*;

@Entity
public class FuncionariosComplemento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "idFuncionario")
	Integer idFuncionario;

	@Column(name = "nmFuncionario")
	String nmFuncionario;

	public FuncionariosComplemento() {
	}

	public FuncionariosComplemento(Long id, Integer idFuncionario, String nmFuncionario) {
		this.id = id;
		this.idFuncionario = idFuncionario;
		this.nmFuncionario = nmFuncionario;
	}

	public FuncionariosComplemento(FuncionariosComplementoRequestDTO funcionariosComplementoRequestDTO) {
		this.id = funcionariosComplementoRequestDTO.getId();
		this.idFuncionario = funcionariosComplementoRequestDTO.getIdFuncionario();
		this.nmFuncionario = funcionariosComplementoRequestDTO.getNmFuncionario();
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public Integer getIdFuncionario() { return idFuncionario; }
	public void setIdFuncionario(Integer idFuncionario) { this.idFuncionario = idFuncionario; }
	public String getNmFuncionario() { return nmFuncionario; }
	public void setNmFuncionario(String nmFuncionario) { this.nmFuncionario = nmFuncionario; }
}
//2023-01-28 00:01:50