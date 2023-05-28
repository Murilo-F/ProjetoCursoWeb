package com.ce.repository;

import com.ce.model.Armazens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmazensRepository extends JpaRepository<Armazens, Long>{}

//2023-01-28 00:01:50