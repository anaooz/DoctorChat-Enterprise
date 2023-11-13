package com.challenge.doctorchat.Core.entities;

import com.challenge.doctorchat.Core.valueObjects.CNPJ;
import com.challenge.doctorchat.Core.valueObjects.Endereco;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeFantasia;
    private String razaoSocial;
    private LocalDate dataDaAbertura;
    @Embedded
    private Endereco endereco;
    @Embedded
    private CNPJ CNPJ;
    private boolean ativo = true;

    @ManyToMany
    private List<Usuario> usuarios;
}
