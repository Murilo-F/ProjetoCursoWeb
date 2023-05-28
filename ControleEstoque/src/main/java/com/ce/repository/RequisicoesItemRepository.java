package com.ce.repository;

import com.ce.model.RequisicoesItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequisicoesItemRepository extends JpaRepository<RequisicoesItem, Long>{}

//2023-01-28 00:01:50