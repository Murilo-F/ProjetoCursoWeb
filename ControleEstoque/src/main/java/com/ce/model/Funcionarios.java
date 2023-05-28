package com.ce.model;

import com.ce.dto.FuncionariosRequestDTO;
import jakarta.persistence.*;

@Entity
public class Funcionarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "stFuncionario")
	Integer stFuncionario;

	@Column(name = "cdLogin")
	String cdLogin;

	@Column(name = "cdSenha")
	String cdSenha;

	public Funcionarios() {
	}

	public Funcionarios(Long id, Integer stFuncionario, String cdLogin, String cdSenha) {
		this.id = id;
		this.stFuncionario = stFuncionario;
		this.cdLogin = cdLogin;
		this.cdSenha = cdSenha;
	}

	public Funcionarios(FuncionariosRequestDTO funcionariosRequestDTO) {
		this.id = funcionariosRequestDTO.getId();
		this.stFuncionario = funcionariosRequestDTO.getStFuncionario();
		this.cdLogin = funcionariosRequestDTO.getCdLogin();
		this.cdSenha = funcionariosRequestDTO.getCdSenha();
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public Integer getStFuncionario() { return stFuncionario; }
	public void setStFuncionario(Integer stFuncionario) { this.stFuncionario = stFuncionario; }
	public String getCdLogin() { return cdLogin; }
	public void setCdLogin(String cdLogin) { this.cdLogin = cdLogin; }
	public String getCdSenha() { return cdSenha; }
	public void setCdSenha(String cdSenha) { this.cdSenha = cdSenha; }
}
//2023-01-28 00:01:50