package br.com.fiap.cinewave.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.cinewave.model.Campanha;

public interface CampanhaRepository extends JpaRepository<Campanha, Long> {
    
}
