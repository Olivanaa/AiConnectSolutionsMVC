package br.com.fiap.connectionsolutions_ia.lead.dto;



import br.com.fiap.connectionsolutions_ia.interesse.Interesse;
import br.com.fiap.connectionsolutions_ia.interesse.dto.InteresseFormRequest;
import br.com.fiap.connectionsolutions_ia.lead.Lead;

import java.time.LocalDate;

public record LeadFormRequest(
        String nome,
        String email,
        String telefone,
        LocalDate dtInteracao,
        InteresseFormRequest interesse
) {
    public Lead toModel(Interesse interesse){
        return Lead.builder()
                .nome(nome)
                .email(email)
                .telefone(telefone)
                .dtInteracao(dtInteracao)
                .interesse(interesse)
                .build();
    }
}
