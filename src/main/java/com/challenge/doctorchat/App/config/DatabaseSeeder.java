package com.challenge.doctorchat.App.config;

import com.challenge.doctorchat.Core.entities.Agendamento;
import com.challenge.doctorchat.Core.entities.Hospital;
import com.challenge.doctorchat.Core.entities.Medico;
import com.challenge.doctorchat.Core.entities.Usuario;
import com.challenge.doctorchat.Core.valueObjects.CNPJ;
import com.challenge.doctorchat.Core.valueObjects.CPF;
import com.challenge.doctorchat.Core.valueObjects.Endereco;
import com.challenge.doctorchat.Details.repositories.HospitalRepository;
import com.challenge.doctorchat.Details.repositories.MedicoRepository;
import com.challenge.doctorchat.Details.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Date;


@Configuration
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    MedicoRepository medicoRepository;

    @Autowired
    HospitalRepository hospitalRepository;

    @Override
    public void run(String... args) throws Exception {
        usuarioRepository.save(new Usuario("Elizabeth Grant", new CPF("23324234126"), "lanadelrey@email.com", "210685", new Date(1985, 6, 21), new Endereco(67890453, "Rua das Lamentações", 505, "Hollywood", "Sem Complemento"), null));
        usuarioRepository.save(new Usuario("Mateus Marchetti Vieira", new CPF("78901234567"), "rm94075@fiap.com.br", "170703", new Date(2003, 7, 17), new Endereco(87654321, "Rua dos Girassóis", 987, "Centro", "Apt 56"), null));
        usuarioRepository.save(new Usuario("Amanda Grazielle Mendes da Silva", new CPF("12345678901"), "rm95456@fiap.com.br", "123123", new Date(1990, 3, 15), new Endereco(12345678, "Rua do Brasil", 123, "São Paulo", "Apto 456"), null));
        usuarioRepository.save(new Usuario("Jean Soares Ferreira", new CPF("21098765432"), "rm94329@fiap.com.br", "567567", new Date(1988, 4, 19), new Endereco(34567890, "Alameda das Flores", 321, "Belo Horizonte", "Casa Verde"), null));
        usuarioRepository.save(new Usuario("Kaio Gomes Vilarinho Vieira Pereira", new CPF("54321098765"), "rm94348@fiap.com.br", "09756", new Date(1992, 10, 30), new Endereco(65432109, "Rua das Amizades", 654, "Curitiba", "Apartamento 101"), null));

        medicoRepository.save(new Medico("Renato Ruiz", new CPF("12345678901"), new CNPJ("12345678901234"), "cmr123456", "Cardiologista", new Endereco(87654321, "Rua Médica", 1245, "Bairro Saúde", "Complemento Médico"), false, null, null));
        medicoRepository.save(new Medico("Isabel Lima", new CPF("98765432109"), new CNPJ("98765432109876"), "cmr987654", "Pediatra", new Endereco(65432109, "Avenida da Saúde", 789, "Bairro Infantil", "Sala 203"), true, null, null));
        medicoRepository.save(new Medico("Gabriel Oliveira", new CPF("23456789012"), new CNPJ("23456789012345"), "cmr234567", "Ortopedista", new Endereco(34567890, "Rua dos Cirurgiões", 567, "Bairro Ortopédico", "Bloco A, Sala 101"), false, null, null));
        medicoRepository.save(new Medico("Juliana Santos", new CPF("34567890123"), new CNPJ("34567890123456"), "cmr345678", "Ginecologista", new Endereco(45678901, "Travessa da Maternidade", 678, "Bairro da Mulher", "Andar 2, Sala 303"), true, null, null));
        medicoRepository.save(new Medico("Lucas Pereira", new CPF("45678901234"), new CNPJ("45678901234567"), "cmr456789", "Dermatologista", new Endereco(56789012, "Alameda da Pele", 890, "Bairro Estética", "Sala 405"), false, null, null));

        hospitalRepository.save(new Hospital("Hospital ABC", "João da Silva", new Date(2023, 9, 11), new Endereco(12345678, "Rua Hospitalar", 123, "Bairro Saúde", "Sem Complemento"), new CNPJ("1234567890123"), true, null));
        hospitalRepository.save(new Hospital("Hospital São Lucas", "Ricardo Santos", new Date(2023, 07, 18), new Endereco(34567890, "Rua da Cura", 789, "Bairro Medicinal", "Torre 2, Andar 4"), new CNPJ("3456789012345"), true, null));
        hospitalRepository.save(new Hospital("Hospital Nossa Senhora", "Fernanda Lima", new Date(2023, 06, 30), new Endereco(45678901, "Travessa do Bem-Estar", 012, "Bairro Sossego", "Setor Pediátrico"), new CNPJ("4567890123456"), false, null));
        hospitalRepository.save(new Hospital("Hospital São Francisco", "Carlos Pereira", new Date(2023, 05, 14), new Endereco(56789012, "Alameda da Saúde", 345, "Bairro Cuidado Integral", "Bloco A, Andar 3"), new CNPJ("5678901234567"), true, null));
        hospitalRepository.save(new Hospital("Hospital Santa Clara", "Ana Silva", new Date(2023, 04, 27), new Endereco(67890123, "Rua do Socorro", 678, "Bairro Humanizado", "Sala de Emergência"), new CNPJ("6789012345678"), false, null));

    }
}
