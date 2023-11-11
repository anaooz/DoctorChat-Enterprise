package com.challenge.doctorchat.Core.entities;

import com.challenge.doctorchat.Core.valueObjects.CNPJ;
import com.challenge.doctorchat.Core.valueObjects.Endereco;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Hospital")
public class Hospital extends BaseEntity{

    private String nomeFantasia;
    private String razaoSocial;
    private Date dataDaAbertura;
    @Embedded
    private Endereco endereco;
    @Embedded
    private CNPJ CNPJ;
    private boolean ativo = true;

    @ManyToMany
    private List<Usuario> usuarios;
}
