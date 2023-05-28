package com.ce.dto;

import com.ce.model.Pessoas;

public class PessoasRequestDTO extends Pessoas{

	public PessoasRequestDTO() {
	}

	public PessoasRequestDTO(Long id, String nmPessoa, Integer stPessoa) {
		setId(id);
		setNmPessoa(nmPessoa);
		setStPessoa(stPessoa);
	}

	public PessoasRequestDTO(Pessoas pessoas) {
		setId(pessoas.getId());
		setNmPessoa(pessoas.getNmPessoa());
		setStPessoa(pessoas.getStPessoa());
	}
}
//2023-01-28 00:01:50