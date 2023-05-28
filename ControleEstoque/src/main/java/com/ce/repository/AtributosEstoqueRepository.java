package com.ce.repository;

import com.ce.model.AtributosEstoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtributosEstoqueRepository extends JpaRepository<AtributosEstoque, Long>{}

//2023-01-28 00:01:50