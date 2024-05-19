package br.com.fiap.cinewave.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.cinewave.model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    Optional<Usuario> findByEmail(String email);
}