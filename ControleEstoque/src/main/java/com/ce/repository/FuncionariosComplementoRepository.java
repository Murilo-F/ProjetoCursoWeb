package com.ce.repository;

import com.ce.model.FuncionariosComplemento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionariosComplementoRepository extends JpaRepository<FuncionariosComplemento, Long>{}

//2023-01-28 00:01:50