package com.ce.repository;

import com.ce.model.UnidadesMedida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadesMedidaRepository extends JpaRepository<UnidadesMedida, Long>{}

//2023-01-28 00:01:50