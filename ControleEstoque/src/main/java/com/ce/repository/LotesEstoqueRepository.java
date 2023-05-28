package com.ce.repository;

import com.ce.model.LotesEstoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LotesEstoqueRepository extends JpaRepository<LotesEstoque, Long>{}

//2023-01-28 00:01:50