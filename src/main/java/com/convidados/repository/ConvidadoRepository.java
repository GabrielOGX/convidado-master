package com.convidados.repository;

import com.convidados.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {
}
