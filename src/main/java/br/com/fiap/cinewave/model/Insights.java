package br.com.fiap.cinewave.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
@Entity
public class Insights {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private float previsao_roi;
    
    @NotBlank
    private String canal_marketing;
    
    @NotBlank
    private float custo_medio_clique;
    
    @NotBlank
    private float previsao_convercao;

    @OneToOne
    private Campanha campanha;

}
