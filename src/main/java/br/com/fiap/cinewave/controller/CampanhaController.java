package br.com.fiap.cinewave.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.cinewave.model.Campanha;
import br.com.fiap.cinewave.repository.CampanhaRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("campanha")
@Slf4j
public class CampanhaController {

    CampanhaRepository campanhaRepository;


    @GetMapping
    public List<Campanha> index() {
        return campanhaRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Campanha create(@RequestBody @Valid Campanha campanha) {
        log.info("cadastrando campanha: {}", campanha);
        return campanhaRepository.save(campanha);
    }

    @GetMapping("{id}")
    public ResponseEntity<Campanha> get(@PathVariable Long id) {
        log.info("Buscar por id: {}", id);

        return campanhaRepository
                    .findById(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }


        @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void destroy(@PathVariable Long id) {
        log.info("apagando campanha {}", id);

        verificarSeExisteCampanha(id);
        campanhaRepository.deleteById(id);
    }


    @PutMapping("{id}")
    public Campanha update(@PathVariable Long id, @RequestBody Campanha campanha){
        log.info("atualizando campanha id {} para {}", id, campanha);
        
        verificarSeExisteCampanha(id);

        campanha.setId(id);
        return campanhaRepository.save(campanha);

    }



    private void verificarSeExisteCampanha(Long id) {
        campanhaRepository
            .findById(id)
            .orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "campanha não encontrada" )
            );
    }

    
}
