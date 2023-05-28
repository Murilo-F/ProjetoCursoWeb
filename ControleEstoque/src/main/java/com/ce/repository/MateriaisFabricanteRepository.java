package com.ce.repository;

import com.ce.model.MateriaisFabricante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaisFabricanteRepository extends JpaRepository<MateriaisFabricante, Long>{}

//2023-01-28 00:01:50