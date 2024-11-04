package br.com.fiap.connectionsolutions_ia.interesse.dto;



import br.com.fiap.connectionsolutions_ia.interesse.Interesse;

import java.time.LocalDate;

public record InteresseFormRequest(
        String descricao,
        LocalDate dtaInteracao
) {
    public Interesse toModel(){
        return Interesse.builder()
                .descricao(descricao)
                .dtInteracao(dtaInteracao)
                .build();
    }
}
