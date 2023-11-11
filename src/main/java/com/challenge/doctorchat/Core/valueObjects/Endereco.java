package com.challenge.doctorchat.Core.valueObjects;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Endereco {
    @Column(length = 8)
    private int CEP;
    private String logradouro;
    @Column(length = 10)
    private int numero;
    private String bairro;
    private String complemento;
}
