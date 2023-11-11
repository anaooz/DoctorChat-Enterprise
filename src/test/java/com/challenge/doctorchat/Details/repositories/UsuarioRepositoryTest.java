package com.challenge.doctorchat.Details.repositories;

import com.challenge.DoctorChatApplication;
import com.challenge.doctorchat.Core.entities.Usuario;
import com.challenge.doctorchat.Core.valueObjects.CPF;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

//https://www.baeldung.com/spring-data-entitymanager
@SpringBootTest(classes = DoctorChatApplication.class)
@RunWith(SpringRunner.class)
public class UsuarioRepositoryTest {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Test
    public void findUserByCPFTest() {
        Usuario usuario = new Usuario();
        usuario.setNome("Mateus");
        usuario.setCPF(new CPF("1234567890"));

        Usuario usuarioPersistido = usuarioRepository.save(usuario);

        assertEquals(usuarioPersistido, usuarioRepository.findByCPF(usuario.getCPF()));
    }
}