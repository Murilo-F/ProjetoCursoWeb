package com.ce.model;

import com.ce.dto.PessoasRequestDTO;
import jakarta.persistence.*;

@Entity
public class Pessoas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "nmPessoa")
	String nmPessoa;

	@Column(name = "stPessoa")
	Integer stPessoa;

	public Pessoas() {
	}

	public Pessoas(Long id, String nmPessoa, Integer stPessoa) {
		this.id = id;
		this.nmPessoa = nmPessoa;
		this.stPessoa = stPessoa;
	}

	public Pessoas(PessoasRequestDTO pessoasRequestDTO) {
		this.id = pessoasRequestDTO.getId();
		this.nmPessoa = pessoasRequestDTO.getNmPessoa();
		this.stPessoa = pessoasRequestDTO.getStPessoa();
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public String getNmPessoa() { return nmPessoa; }
	public void setNmPessoa(String nmPessoa) { this.nmPessoa = nmPessoa; }
	public Integer getStPessoa() { return stPessoa; }
	public void setStPessoa(Integer stPessoa) { this.stPessoa = stPessoa; }
}
//2023-01-28 00:01:50