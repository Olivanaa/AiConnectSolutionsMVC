package br.com.fiap.connectionsolutions_ia.lead;


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
@Table(name = "lead")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Size(min=3, max=200)
    private String nome;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min=10, max=11)
    private String telefone;

    @NotNull
    @PastOrPresent
    private LocalDate dtInteracao;

    @ManyToOne
    private Interesse interesse;
}
