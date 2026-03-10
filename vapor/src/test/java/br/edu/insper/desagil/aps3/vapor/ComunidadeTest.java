package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComunidadeTest {
    private Comunidade comunidade;

    @BeforeEach
    void setUp() {
        Usuario usuario1 = new Usuario("Mathz", "Matheus");
        Usuario usuario2 = new Usuario("Thomas", "Tomazela");
        List<Usuario> membros = new ArrayList<>();
        membros.add(usuario1);
        membros.add(usuario2);
        comunidade = new Comunidade(membros);
    }

    @Test
    void constroi() {
        List<String> listMembros = new ArrayList<>();
        listMembros.add("Mathz");
        listMembros.add("Thomas");
        assertEquals(listMembros, comunidade.apelidosMembros());
    }

    @Test
    void adicionaUmMembro() {
        Usuario usuarioNovo = new Usuario("Lu", "Luiza");
        comunidade.adicionaMembros(usuarioNovo);
        List<String> listMembros = new ArrayList<>();
        listMembros.add("Mathz");
        listMembros.add("Thomas");
        listMembros.add("Lu");
        assertEquals(listMembros, comunidade.apelidosMembros());
    }

    @Test
    void adicionaDoisMembros() {
        Usuario usuarioNovo1 = new Usuario("Lu", "Luiza");
        Usuario usuarioNovo2 = new Usuario("Mari", "Mariana");
        comunidade.adicionaMembros(usuarioNovo1);
        comunidade.adicionaMembros(usuarioNovo2);
        List<String> listMembros = new ArrayList<>();
        listMembros.add("Mathz");
        listMembros.add("Thomas");
        listMembros.add("Lu");
        listMembros.add("Mari");
        assertEquals(listMembros, comunidade.apelidosMembros());
    }
}
