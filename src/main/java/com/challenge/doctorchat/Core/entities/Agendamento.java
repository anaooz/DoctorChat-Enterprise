package com.challenge.doctorchat.Core.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Agendamento")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate Data;

    private String Descricao;

    @OneToMany(mappedBy = "Agendamento")
    private List<Medico> Medico;

    @OneToMany(mappedBy = "Agendamento")
    private List<Usuario> Usuario;
}
