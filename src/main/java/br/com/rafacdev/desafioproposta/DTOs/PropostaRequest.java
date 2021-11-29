package br.com.rafacdev.desafioproposta.DTOs;

import br.com.rafacdev.desafioproposta.entities.Proposta;
import br.com.rafacdev.desafioproposta.enums.StatusProposta;
import br.com.rafacdev.desafioproposta.servicosUtils.Documento;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

public class PropostaRequest {

    @NotBlank @Documento
    private String documento;
    @NotBlank @Email
    private String email;
    @NotBlank
    private String nome;
    @NotBlank
    private String endereco;
    @NotNull @Positive
    private BigDecimal salario;
    private StatusProposta statusProposta;

    public PropostaRequest(String documento, String email, String nome, String endereco, BigDecimal salario,
           StatusProposta statusProposta) {
        this.documento = documento;
        this.email = email;
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.statusProposta = statusProposta;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public Proposta paraProposta() {
        return new Proposta(documento, email, nome, endereco, salario, statusProposta);
    }
}