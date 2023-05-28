package com.ce.repository;

import com.ce.model.Movimentacoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacoesRepository extends JpaRepository<Movimentacoes, Long>{}

//2023-01-28 00:01:50