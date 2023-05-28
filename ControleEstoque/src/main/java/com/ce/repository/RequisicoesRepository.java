package com.ce.repository;

import com.ce.model.Requisicoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequisicoesRepository extends JpaRepository<Requisicoes, Long>{}

//2023-01-28 00:01:50