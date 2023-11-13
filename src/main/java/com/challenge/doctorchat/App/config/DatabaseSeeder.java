package com.challenge.doctorchat.App.config;

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

import java.time.LocalDate;


@Configuration
public class DatabaseSeeder implements CommandLineRunner {

    private final UsuarioRepository usuarioRepository;
    private final MedicoRepository medicoRepository;
    private final HospitalRepository hospitalRepository;

    @Autowired
    public DatabaseSeeder(
            UsuarioRepository usuarioRepository,
            MedicoRepository medicoRepository,
            HospitalRepository hospitalRepository
    ) {
        this.usuarioRepository = usuarioRepository;
        this.medicoRepository = medicoRepository;
        this.hospitalRepository = hospitalRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        long userIdCounter = 1L;

        usuarioRepository.save(new Usuario(1L,"Elizabeth Grant", new CPF("23324234126"), "lanadelrey@email.com", "210685", LocalDate.of(1985, 6, 21), new Endereco(67890453, "Rua das Lamentações", 505, "Hollywood", "Sem Complemento"), null));
        usuarioRepository.save(new Usuario(2L, "Mateus Marchetti Vieira", new CPF("78901234567"), "rm94075@fiap.com.br", "170703", LocalDate.of(2003, 7, 17), new Endereco(87654321, "Rua dos Girassóis", 987, "Centro", "Apt 56"), null));
        usuarioRepository.save(new Usuario(3L, "Amanda Grazielle Mendes da Silva", new CPF("12345678901"), "rm95456@fiap.com.br", "123123", LocalDate.of(1990, 3, 15), new Endereco(12345678, "Rua do Brasil", 123, "São Paulo", "Apto 456"), null));
        usuarioRepository.save(new Usuario(4L, "Jean Soares Ferreira", new CPF("21098765432"), "rm94329@fiap.com.br", "567567", LocalDate.of(1988, 4, 19), new Endereco(34567890, "Alameda das Flores", 321, "Belo Horizonte", "Casa Verde"), null));
        usuarioRepository.save(new Usuario(5L, "Kaio Gomes Vilarinho Vieira Pereira", new CPF("54321098765"), "rm94348@fiap.com.br", "09756", LocalDate.of(1992, 10, 30), new Endereco(65432109, "Rua das Amizades", 654, "Curitiba", "Apartamento 101"), null));

        medicoRepository.save(new Medico(1L,"Renato Ruiz", new CPF("12345678901"), new CNPJ("12345678901234"), "cmr123456", "Cardiologista", new Endereco(87654321, "Rua Médica", 1245, "Bairro Saúde", "Complemento Médico"), false, null, null));
        medicoRepository.save(new Medico(2L, "Isabel Lima", new CPF("98765432109"), new CNPJ("98765432109876"), "cmr987654", "Pediatra", new Endereco(65432109, "Avenida da Saúde", 789, "Bairro Infantil", "Sala 203"), true, null, null));
        medicoRepository.save(new Medico(3L, "Gabriel Oliveira", new CPF("23456789012"), new CNPJ("23456789012345"), "cmr234567", "Ortopedista", new Endereco(34567890, "Rua dos Cirurgiões", 567, "Bairro Ortopédico", "Bloco A, Sala 101"), false, null, null));
        medicoRepository.save(new Medico(4L, "Juliana Santos", new CPF("34567890123"), new CNPJ("34567890123456"), "cmr345678", "Ginecologista", new Endereco(45678901, "Travessa da Maternidade", 678, "Bairro da Mulher", "Andar 2, Sala 303"), true, null, null));
        medicoRepository.save(new Medico(5L, "Lucas Pereira", new CPF("45678901234"), new CNPJ("45678901234567"), "cmr456789", "Dermatologista", new Endereco(56789012, "Alameda da Pele", 890, "Bairro Estética", "Sala 405"), false, null, null));

        hospitalRepository.save(new Hospital(1L,"Hospital São Lucas", "Ricardo Santos", LocalDate.of(2023, 7, 18), new Endereco(34567890, "Rua da Cura", 789, "Bairro Medicinal", "Torre 2, Andar 4"), new CNPJ("3456789012345"), true, null));
        hospitalRepository.save(new Hospital(2L, "Hospital Nossa Senhora", "Fernanda Lima", LocalDate.of(2023, 6, 30), new Endereco(45678901, "Travessa do Bem-Estar", 12, "Bairro Sossego", "Setor Pediátrico"), new CNPJ("4567890123456"), false, null));
        hospitalRepository.save(new Hospital(3L, "Hospital São Francisco", "Carlos Pereira", LocalDate.of(2023, 5, 14), new Endereco(56789012, "Alameda da Saúde", 345, "Bairro Cuidado Integral", "Bloco A, Andar 3"), new CNPJ("5678901234567"), true, null));
        hospitalRepository.save(new Hospital(4L, "Hospital Santa Clara", "Ana Silva", LocalDate.of(2023, 4, 27), new Endereco(67890123, "Rua do Socorro", 678, "Bairro Humanizado", "Sala de Emergência"), new CNPJ("6789012345678"), false, null));
        hospitalRepository.save(new Hospital(5L, "Hospital XYZ", "Maria Oliveira", LocalDate.of(2023, 8, 25), new Endereco(23456789, "Avenida da Saúde", 456, "Bairro Cuidado", "Ala B"), new CNPJ("2345678901234"), false, null));

    }
}
