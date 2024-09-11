package br.com.fiap.cinewave.model;

import lombok.Getter;

@Getter
public class LoginRequest {
    private String email;
    private String senha;
}
