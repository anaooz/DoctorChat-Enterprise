package com.challenge.doctorchat.Core.interfaces;

import com.challenge.doctorchat.Core.entities.Usuario;
import com.challenge.doctorchat.Core.valueObjects.CPF;

public interface CustomUsuarioRepository {
    Usuario findByCPF(CPF CPF);
}
