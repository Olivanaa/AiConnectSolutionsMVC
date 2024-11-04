package br.com.fiap.connectionsolutions_ia.interesse;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "interesse")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Interesse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Size(min=5, max=500)
    private String descricao;

    @NotNull
    @PastOrPresent
    private LocalDate dtInteracao;
}
