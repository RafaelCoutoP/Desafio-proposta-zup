package br.com.rafacdev.desafioproposta.feingClients.analiseproposta;

import br.com.rafacdev.desafioproposta.enums.StatusProposta;

public class AnaliseResponse {

    private String documento;
    private String nome;
    private Long idProposta;
    private ResultadoSolicitacao resultadoSolicitacao;

    public String getDocumento() {
        return documento;
    }

    public String getNome() {
        return nome;
    }

    public Long getIdProposta() {
        return idProposta;
    }

    public ResultadoSolicitacao getResultadoSolicitacao() {
        return resultadoSolicitacao;
    }

    public StatusProposta statusProposta(){
        return resultadoSolicitacao.getStatusProposta();
    }
}