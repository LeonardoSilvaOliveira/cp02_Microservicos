package com.github.leonardoSilvaOliveira.repository;

import com.github.leonardoSilvaOliveira.entities.DadoColetado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DadoColetadoRepository extends JpaRepository <DadoColetado, Long> {
}
