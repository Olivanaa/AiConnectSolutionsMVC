package br.com.fiap.connectionsolutions_ia.cliente.dto;



import br.com.fiap.connectionsolutions_ia.cliente.Cliente;
import br.com.fiap.connectionsolutions_ia.endereco.Endereco;
import br.com.fiap.connectionsolutions_ia.endereco.dto.EnderecoFormRequest;
import br.com.fiap.connectionsolutions_ia.interesse.Interesse;
import br.com.fiap.connectionsolutions_ia.interesse.dto.InteresseFormRequest;

import java.time.LocalDate;

public record ClienteFormRequest(
        String nome,
        String email,
        String telefone,
        LocalDate dtaCadastro,
        LocalDate dtaNascimento,
        String segmentoMercado,
        LocalDate dtaUltimaInteracao,
        EnderecoFormRequest endereco,
        InteresseFormRequest interesse
) {
    public Cliente toModel(Endereco endereco, Interesse interesse){
        return Cliente.builder()
                .nome(nome)
                .email(email)
                .telefone(telefone)
                .dtaNascimento(dtaNascimento)
                .dtaCadastro(dtaCadastro)
                .segmentoMercado(segmentoMercado)
                .dtaUltimaInteracao(dtaUltimaInteracao)
                .endereco(endereco)
                .interesse(interesse)
                .build();

    }
}
