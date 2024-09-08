package br.com.fiap.cinewave.service;

import br.com.fiap.cinewave.model.Usuario;
import br.com.fiap.cinewave.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario autenticarUsuario (String email, String senha) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findByEmail(email);

        if (optionalUsuario.isPresent() && optionalUsuario.get().getSenha().equals(senha)) {
            return optionalUsuario.get();
        }
        return null;
    }

}
