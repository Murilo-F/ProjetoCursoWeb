package com.ce.dto;

import com.ce.model.Pessoas;

public class PessoasResponseDTO extends Pessoas{

	public PessoasResponseDTO() {
	}

	public PessoasResponseDTO(Long id, String nmPessoa, Integer stPessoa) {
		setId(id);
		setNmPessoa(nmPessoa);
		setStPessoa(stPessoa);
	}

	public PessoasResponseDTO(Pessoas pessoas) {
		setId(pessoas.getId());
		setNmPessoa(pessoas.getNmPessoa());
		setStPessoa(pessoas.getStPessoa());
	}
}
//2023-01-28 00:01:50