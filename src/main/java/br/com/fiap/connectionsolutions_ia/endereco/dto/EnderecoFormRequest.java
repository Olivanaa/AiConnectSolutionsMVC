package br.com.fiap.connectionsolutions_ia.endereco.dto;


import br.com.fiap.connectionsolutions_ia.endereco.Endereco;

public record EnderecoFormRequest(
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String estado,
        String pais,
        String cep,
        String tipo
) {
    public Endereco toModel(){
        return Endereco.builder()
                .logradouro(logradouro)
                .numero(numero)
                .complemento(complemento)
                .bairro(bairro)
                .cidade(cidade)
                .estado(estado)
                .pais(pais)
                .cep(cep)
                .tipo(tipo)
                .build();
    }
}
