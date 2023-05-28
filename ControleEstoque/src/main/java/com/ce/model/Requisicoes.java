package com.ce.model;

import com.ce.dto.RequisicoesRequestDTO;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Requisicoes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "stRequisicao")
	Integer stRequisicao;

	@Column(name = "idFuncionario")
	Integer idFuncionario;

	@Column(name = "idTipoMovi")
	Integer idTipoMovi;

	@Column(name = "dtRequisicao")
	Date dtRequisicao;

	public Requisicoes() {
	}

	public Requisicoes(Long id, Integer stRequisicao, Integer idFuncionario, Integer idTipoMovi, Date dtRequisicao) {
		this.id = id;
		this.stRequisicao = stRequisicao;
		this.idFuncionario = idFuncionario;
		this.idTipoMovi = idTipoMovi;
		this.dtRequisicao = dtRequisicao;
	}

	public Requisicoes(RequisicoesRequestDTO requisicoesRequestDTO) {
		this.id = requisicoesRequestDTO.getId();
		this.stRequisicao = requisicoesRequestDTO.getStRequisicao();
		this.idFuncionario = requisicoesRequestDTO.getIdFuncionario();
		this.idTipoMovi = requisicoesRequestDTO.getIdTipoMovi();
		this.dtRequisicao = requisicoesRequestDTO.getDtRequisicao();
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public Integer getStRequisicao() { return stRequisicao; }
	public void setStRequisicao(Integer stRequisicao) { this.stRequisicao = stRequisicao; }
	public Integer getIdFuncionario() { return idFuncionario; }
	public void setIdFuncionario(Integer idFuncionario) { this.idFuncionario = idFuncionario; }
	public Integer getIdTipoMovi() { return idTipoMovi; }
	public void setIdTipoMovi(Integer idTipoMovi) { this.idTipoMovi = idTipoMovi; }
	public Date getDtRequisicao() { return dtRequisicao; }
	public void setDtRequisicao(Date dtRequisicao) { this.dtRequisicao = dtRequisicao; }
}
//2023-01-28 00:01:50