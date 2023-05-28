package com.ce.model;

import com.ce.dto.MovimentacoesRequestDTO;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Movimentacoes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "dtMovimento")
	Date dtMovimento;

	@Column(name = "idTipoMovi")
	Integer idTipoMovi;

	@Column(name = "tiOperacao")
	Integer tiOperacao;

	@Column(name = "idMaterial")
	Integer idMaterial;

	@Column(name = "idAtriEsto")
	Integer idAtriEsto;

	@Column(name = "qtMovimento")
	Double qtMovimento;

	@Column(name = "idArmazem")
	Integer idArmazem;

	public Movimentacoes() {
	}

	public Movimentacoes(Long id, Date dtMovimento, Integer idTipoMovi, Integer tiOperacao, Integer idMaterial, Integer idAtriEsto, Double qtMovimento, Integer idArmazem) {
		this.id = id;
		this.dtMovimento = dtMovimento;
		this.idTipoMovi = idTipoMovi;
		this.tiOperacao = tiOperacao;
		this.idMaterial = idMaterial;
		this.idAtriEsto = idAtriEsto;
		this.qtMovimento = qtMovimento;
		this.idArmazem = idArmazem;
	}

	public Movimentacoes(MovimentacoesRequestDTO movimentacoesRequestDTO) {
		this.id = movimentacoesRequestDTO.getId();
		this.dtMovimento = movimentacoesRequestDTO.getDtMovimento();
		this.idTipoMovi = movimentacoesRequestDTO.getIdTipoMovi();
		this.tiOperacao = movimentacoesRequestDTO.getTiOperacao();
		this.idMaterial = movimentacoesRequestDTO.getIdMaterial();
		this.idAtriEsto = movimentacoesRequestDTO.getIdAtriEsto();
		this.qtMovimento = movimentacoesRequestDTO.getQtMovimento();
		this.idArmazem = movimentacoesRequestDTO.getIdArmazem();
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public Date getDtMovimento() { return dtMovimento; }
	public void setDtMovimento(Date dtMovimento) { this.dtMovimento = dtMovimento; }
	public Integer getIdTipoMovi() { return idTipoMovi; }
	public void setIdTipoMovi(Integer idTipoMovi) { this.idTipoMovi = idTipoMovi; }
	public Integer getTiOperacao() { return tiOperacao; }
	public void setTiOperacao(Integer tiOperacao) { this.tiOperacao = tiOperacao; }
	public Integer getIdMaterial() { return idMaterial; }
	public void setIdMaterial(Integer idMaterial) { this.idMaterial = idMaterial; }
	public Integer getIdAtriEsto() { return idAtriEsto; }
	public void setIdAtriEsto(Integer idAtriEsto) { this.idAtriEsto = idAtriEsto; }
	public Double getQtMovimento() { return qtMovimento; }
	public void setQtMovimento(Double qtMovimento) { this.qtMovimento = qtMovimento; }
	public Integer getIdArmazem() { return idArmazem; }
	public void setIdArmazem(Integer idArmazem) { this.idArmazem = idArmazem; }
}
//2023-01-28 00:01:50