package br.com.rafacdev.desafioproposta.feingClients.analiseproposta;

import br.com.rafacdev.desafioproposta.entities.Proposta;

public class AnaliseRequest {

    private String documento;
    private String nome;
    private Long idProposta;

    public AnaliseRequest(Proposta entity) {
        this.documento = entity.getDocumento();
        this.nome = entity.getNome();
        this.idProposta = entity.getId();
    }

    public String getDocumento() {
        return documento;
    }

    public String getNome() {
        return nome;
    }

    public Long getIdProposta() {
        return idProposta;
    }
}