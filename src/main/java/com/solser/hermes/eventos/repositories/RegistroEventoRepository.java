package com.solser.hermes.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solser.hermes.eventos.entities.RegistroEvento;

@Repository
public interface RegistroEventoRepository extends JpaRepository<RegistroEvento, Long>{

}
