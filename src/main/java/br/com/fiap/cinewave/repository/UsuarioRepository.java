package br.com.fiap.cinewave.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.cinewave.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}