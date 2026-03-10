package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTest {
    private Loja loja;
    private Usuario dono;
    private Jogo jogo1;
    private Jogo jogo2;
    private Jogo jogo3;

    @BeforeEach
    void setUp() {
        dono = new Usuario("Duda", "Maria Eduarda");
        jogo1 = new Jogo(0, "Tetris");
        jogo2 = new Jogo(1, "Xadrez");
        jogo3 = new Jogo(2, "Valorant");
        List<Jogo> listaJogos = new ArrayList<>();
        listaJogos.add(jogo1);
        listaJogos.add(jogo2);
        listaJogos.add(jogo3);
        loja = new Loja(dono, listaJogos);
    }

    @Test
    void constroi() {
        assertEquals(dono, loja.getDono());
        assertEquals(0, loja.numeroAvaliados(dono));
    }

    @Test
    void umUsuarioAvaliaUmJogo() {
        jogo1.avalia("Duda", 5);
        assertEquals(1, loja.numeroAvaliados(dono));
    }

    @Test
    void umUsuarioAvaliaDoisJogos() {
        jogo1.avalia("Duda", 5);
        jogo2.avalia("Duda", 2);
        assertEquals(2, loja.numeroAvaliados(dono));
    }

    @Test
    void doisUsuariosAvaliamUmJogo() {
        Usuario usuario = new Usuario("Gabi", "Gabriela");
        jogo1.avalia("Duda", 5);
        jogo1.avalia("Gabi", 7);
        assertEquals(1, loja.numeroAvaliados(dono));
        assertEquals(1, loja.numeroAvaliados(usuario));
    }

    @Test
    void doisUsuariosAvaliamDoisJogos() {
        Usuario usuario = new Usuario("Gabi", "Gabriela");
        jogo1.avalia("Duda", 5);
        jogo2.avalia("Gabi", 4);
        assertEquals(1, loja.numeroAvaliados(dono));
        assertEquals(1, loja.numeroAvaliados(usuario));
    }
}
