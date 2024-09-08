package br.com.fiap.cinewave.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.cinewave.model.Campanha;

import java.util.List;

public interface CampanhaRepository extends JpaRepository<Campanha, Long> {

    List<Campanha> findByUsuarioId(Long usuarioId);
}
