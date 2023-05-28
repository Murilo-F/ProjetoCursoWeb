package com.ce.dto;

import com.ce.model.Movimentacoes;

import java.util.Date;
public class MovimentacoesResponseDTO extends Movimentacoes{

	public MovimentacoesResponseDTO() {
	}

	public MovimentacoesResponseDTO(Long id, Date dtMovimento, Integer idTipoMovi, Integer tiOperacao, Integer idMaterial, Integer idAtriEsto, Double qtMovimento, Integer idArmazem) {
		setId(id);
		setDtMovimento(dtMovimento);
		setIdTipoMovi(idTipoMovi);
		setTiOperacao(tiOperacao);
		setIdMaterial(idMaterial);
		setIdAtriEsto(idAtriEsto);
		setQtMovimento(qtMovimento);
		setIdArmazem(idArmazem);
	}

	public MovimentacoesResponseDTO(Movimentacoes movimentacoes) {
		setId(movimentacoes.getId());
		setDtMovimento(movimentacoes.getDtMovimento());
		setIdTipoMovi(movimentacoes.getIdTipoMovi());
		setTiOperacao(movimentacoes.getTiOperacao());
		setIdMaterial(movimentacoes.getIdMaterial());
		setIdAtriEsto(movimentacoes.getIdAtriEsto());
		setQtMovimento(movimentacoes.getQtMovimento());
		setIdArmazem(movimentacoes.getIdArmazem());
	}
}
//2023-01-28 00:01:50