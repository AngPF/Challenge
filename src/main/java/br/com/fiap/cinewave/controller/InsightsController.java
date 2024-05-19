package br.com.fiap.cinewave.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
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

import br.com.fiap.cinewave.model.Insights;
import br.com.fiap.cinewave.repository.InsightsRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("insights")
@Slf4j
@Tag(name = "insights", description = "Endpoint relacionado com os insights do CineWave")
public class InsightsController {

    @Autowired
    InsightsRepository insightsRepository;

    @GetMapping
    @Operation(summary = "Lista todos os insights cadastrados no sistema.",
            description = "Endpoint que retorna um array de objetos do tipo insights")
    public List<Insights> index() {
        return insightsRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    @Operation(summary = "Cadastra um insight no sistema.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Erro de validação do insight"),
            @ApiResponse(responseCode = "201", description = "Insight cadastrado com sucesso")
    })
    public Insights create(@RequestBody @Valid Insights insights) {
        log.info("cadastrando insights: {}", insights);
        return insightsRepository.save(insights);
    }

    @GetMapping("{id}")
    @Operation(summary = "Busca um insight pelo id.",
            description = "Endpoint que retorna um insight com base em seu id.")
    public ResponseEntity<Insights> get(@PathVariable Long id) {
        log.info("Buscar por id: {}", id);

        return insightsRepository
                    .findById(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    @Operation(summary = "Apaga um insight do sistema.")
    public void destroy(@PathVariable Long id) {
        log.info("apagando insights {}", id);

        verificarSeExisteInsights(id);
        insightsRepository.deleteById(id);
    }

    @PutMapping("{id}")
    @Operation(summary = "Atualiza os dados de um insight no sistema com base no id.")
    public Insights update(@PathVariable Long id, @RequestBody Insights insights){
        log.info("atualizando insights id {} para {}", id, insights);
        
        verificarSeExisteInsights(id);

        insights.setId(id);
        return insightsRepository.save(insights);

    }

    private void verificarSeExisteInsights(Long id) {
        insightsRepository
            .findById(id)
            .orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "insights não encontrada" )
            );
    }
}
