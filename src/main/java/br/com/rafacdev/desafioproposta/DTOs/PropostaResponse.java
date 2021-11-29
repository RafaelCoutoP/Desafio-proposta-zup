package br.com.rafacdev.desafioproposta.DTOs;

import br.com.rafacdev.desafioproposta.entities.Proposta;

public class PropostaResponse {

    private String email;
    private String nome;

    public PropostaResponse(Proposta entity) {
        email = entity.getEmail();
        nome =email;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }
}