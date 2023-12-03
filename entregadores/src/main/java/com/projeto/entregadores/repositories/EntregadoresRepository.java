package com.projeto.entregadores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.entregadores.models.EntregadoresModel;

@Repository
public interface EntregadoresRepository extends JpaRepository<EntregadoresModel, Integer>{

}