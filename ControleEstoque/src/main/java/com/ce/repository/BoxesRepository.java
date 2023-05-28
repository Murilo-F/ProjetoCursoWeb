package com.ce.repository;

import com.ce.model.Boxes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoxesRepository extends JpaRepository<Boxes, Long>{}

//2023-01-28 00:01:50