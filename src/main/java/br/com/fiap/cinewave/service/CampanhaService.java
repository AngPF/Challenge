package br.com.fiap.cinewave.service;

import br.com.fiap.cinewave.model.Campanha;
import br.com.fiap.cinewave.repository.CampanhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampanhaService {

    @Autowired
    private CampanhaRepository campanhaRepository;

    public Campanha criarCampanha(Campanha campanha) {
        return campanhaRepository.save(campanha);
    }

    public List<Campanha> buscarCampanhasPorUsuarioId(Long usuarioId) {
        return campanhaRepository.findByUsuarioId(usuarioId);
    }
}
