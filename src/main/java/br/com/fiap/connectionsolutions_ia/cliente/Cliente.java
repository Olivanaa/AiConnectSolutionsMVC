package br.com.fiap.connectionsolutions_ia.cliente;

import br.com.fiap.connectionsolutions_ia.endereco.Endereco;
import br.com.fiap.connectionsolutions_ia.interesse.Interesse;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "cliente")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Size(min=3, max= 200)
    private String nome;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min=10, max=11)
    private String telefone;

    @NotNull
    @Past
    private LocalDate dtaNascimento;

    @NotNull
    @PastOrPresent
    private LocalDate dtaCadastro;

    @NotBlank
    @Size(min=3, max=50)
    private String segmentoMercado;

    @NotNull
    @PastOrPresent
    private LocalDate dtaUltimaInteracao;

    @ManyToOne
    private Endereco endereco;

    @ManyToOne
    private Interesse interesse;

}