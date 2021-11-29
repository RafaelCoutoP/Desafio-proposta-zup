package br.com.rafacdev.desafioproposta.controllers;

import br.com.rafacdev.desafioproposta.DTOs.PropostaRequest;
import br.com.rafacdev.desafioproposta.DTOs.PropostaResponse;
import br.com.rafacdev.desafioproposta.entities.Proposta;
import br.com.rafacdev.desafioproposta.repositories.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "/propostas")
public class PropostaController {

    @Autowired
    private PropostaRepository propostaRepository;

    @PostMapping
    public ResponseEntity<PropostaResponse> criacaoNovaProposta(@RequestBody @Valid PropostaRequest request){
        Proposta proposta = request.paraProposta();
        if (propostaRepository.existsByDocumento(request.getDocumento())){
            return ResponseEntity.unprocessableEntity().build();
        }
        propostaRepository.save(proposta);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(proposta.getId()).toUri();
        return ResponseEntity.created(uri).body(new PropostaResponse(proposta));
    }
}