package com.ce.model;

import com.ce.dto.RequisicoesAtributoRequestDTO;
import jakarta.persistence.*;

@Entity
public class RequisicoesAtributo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long idRequItem;

	@Column(name = "idAtriEsto")
	Integer idAtriEsto;

	@Column(name = "qtRequisicao")
	Double qtRequisicao;

	@Column(name = "idArmazem")
	Integer idArmazem;

	public RequisicoesAtributo() {
	}

	public RequisicoesAtributo(Long idRequItem, Integer idAtriEsto, Double qtRequisicao, Integer idArmazem) {
		this.idRequItem = idRequItem;
		this.idAtriEsto = idAtriEsto;
		this.qtRequisicao = qtRequisicao;
		this.idArmazem = idArmazem;
	}

	public RequisicoesAtributo(RequisicoesAtributoRequestDTO requisicoesAtributoRequestDTO) {
		this.idRequItem = requisicoesAtributoRequestDTO.getIdRequItem();
		this.idAtriEsto = requisicoesAtributoRequestDTO.getIdAtriEsto();
		this.qtRequisicao = requisicoesAtributoRequestDTO.getQtRequisicao();
		this.idArmazem = requisicoesAtributoRequestDTO.getIdArmazem();
	}

	public Long getIdRequItem() { return idRequItem; }
	public void setIdRequItem(Long idRequItem) { this.idRequItem = idRequItem; }
	public Integer getIdAtriEsto() { return idAtriEsto; }
	public void setIdAtriEsto(Integer idAtriEsto) { this.idAtriEsto = idAtriEsto; }
	public Double getQtRequisicao() { return qtRequisicao; }
	public void setQtRequisicao(Double qtRequisicao) { this.qtRequisicao = qtRequisicao; }
	public Integer getIdArmazem() { return idArmazem; }
	public void setIdArmazem(Integer idArmazem) { this.idArmazem = idArmazem; }
}
//2023-01-28 00:01:50