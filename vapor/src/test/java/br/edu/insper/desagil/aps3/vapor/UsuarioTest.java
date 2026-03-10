package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {
    private Usuario usuario;

    @BeforeEach
    void setUp(){
        usuario = new Usuario("Gabi", "Gabriela");
    }

    @Test
    void controi() {
        assertEquals("Gabi", usuario.getApelido());
        assertEquals("Gabriela", usuario.getNome());
    }
    @Test
    void mudaNome(){
        usuario.setNome("Gabriel");
        assertEquals("Gabriel", usuario.getNome());
    }
}
