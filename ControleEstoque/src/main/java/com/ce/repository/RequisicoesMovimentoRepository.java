package com.ce.repository;

import com.ce.model.RequisicoesMovimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequisicoesMovimentoRepository extends JpaRepository<RequisicoesMovimento, Long>{}

//2023-01-28 00:01:50