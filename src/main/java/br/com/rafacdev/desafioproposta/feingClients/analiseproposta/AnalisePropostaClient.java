package br.com.rafacdev.desafioproposta.feingClients.analiseproposta;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "analise-proposta", url = "http://localhost:9999")
public interface AnalisePropostaClient {

    @PostMapping("/api/solicitacao")
    AnaliseResponse consultaSolicitacao(AnaliseRequest request);
}
