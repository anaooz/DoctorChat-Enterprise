package com.challenge.doctorchat.Core.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Agendamento")
public class Agendamento extends BaseEntity{

    private Date Data;

    private String Descricao;

    @OneToMany(mappedBy = "Agendamento")
    private List<Medico> Medico;

    @OneToMany(mappedBy = "Agendamento")
    private List<Usuario> Usuario;
}
