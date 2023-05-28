package com.ce.repository;

import com.ce.model.Pessoas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoasRepository extends JpaRepository<Pessoas, Long>{}

//2023-01-28 00:01:50