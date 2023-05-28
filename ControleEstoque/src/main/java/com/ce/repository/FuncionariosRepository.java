package com.ce.repository;

import com.ce.model.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionariosRepository extends JpaRepository<Funcionarios, Long>{}

//2023-01-28 00:01:50