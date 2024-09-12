package br.com.fiap.cinewave.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_CNW_CAMPANHAS")
public class Campanha {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String titulo_filme;
    
    @NotBlank
    private String genero_filme;

    @NotBlank
    private String faixa_etaria_filme;

    @Positive
    private float budget;

    @Positive
    private int expectativa_alcance;

    @ManyToOne
    private Usuario usuario;
}
