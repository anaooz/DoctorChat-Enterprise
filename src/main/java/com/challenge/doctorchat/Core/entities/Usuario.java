package com.challenge.doctorchat.Core.entities;

import com.challenge.doctorchat.Core.valueObjects.CPF;
import com.challenge.doctorchat.Core.valueObjects.Endereco;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @Embedded
    private CPF CPF;
    private String email;
    private String senha;
    private LocalDate dataDeNascimento;
    @Embedded
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "Agendamento_Id")
    private Agendamento Agendamento;
}
