package com.ce.repository;

import com.ce.model.Materiais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaisRepository extends JpaRepository<Materiais, Long>{}

//2023-01-28 00:01:50