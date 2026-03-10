package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComunidadeDeJogoTest {
    private ComunidadeDeJogo comunidadeJogo;
    private Jogo jogo;

    @BeforeEach
    void setUp() {
        Usuario usuario = new Usuario("Mi", "Mirella");
        List<Usuario> membros = new ArrayList<>();
        membros.add(usuario);

        jogo = new Jogo(0, "Tetris");
        comunidadeJogo = new ComunidadeDeJogo(membros, jogo);
    }

    @Test
    void adicionaDoisInvalidos() {
        Usuario usuario1 = new Usuario("Mari", "Mariana");
        Usuario usuario2 = new Usuario("Duda", "Maria Eduarda");
        comunidadeJogo.adicionaMembros(usuario1);
        comunidadeJogo.adicionaMembros(usuario2);

        List<String> apelidos = new ArrayList<>();
        apelidos.add("Mi");
        assertEquals(apelidos, comunidadeJogo.apelidosMembros());
    }

    @Test
    void adicionaUmInvalidoUmValido() {
        jogo.avalia("Mari", 7);

        Usuario usuario1 = new Usuario("Mari", "Mariana");
        Usuario usuario2 = new Usuario("Duda", "Maria Eduarda");
        comunidadeJogo.adicionaMembros(usuario1);
        comunidadeJogo.adicionaMembros(usuario2);


        List<String> apelidos = new ArrayList<>();
        apelidos.add("Mi");
        apelidos.add("Mari");
        assertEquals(apelidos, comunidadeJogo.apelidosMembros());
    }

    @Test
    void adicionaDoisValidos() {
        jogo.avalia("Mari", 7);
        jogo.avalia("Duda", 5);

        Usuario usuario1 = new Usuario("Mari", "Mariana");
        Usuario usuario2 = new Usuario("Duda", "Maria Eduarda");
        comunidadeJogo.adicionaMembros(usuario1);
        comunidadeJogo.adicionaMembros(usuario2);


        List<String> apelidos = new ArrayList<>();
        apelidos.add("Mi");
        apelidos.add("Mari");
        apelidos.add("Duda");
        assertEquals(apelidos, comunidadeJogo.apelidosMembros());
    }
}
