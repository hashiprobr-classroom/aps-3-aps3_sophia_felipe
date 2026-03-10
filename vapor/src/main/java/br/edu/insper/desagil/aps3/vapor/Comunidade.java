package br.edu.insper.desagil.aps3.vapor;

import java.util.ArrayList;
import java.util.List;

public class Comunidade {
    List<Usuario> membros;

    public Comunidade(List<Usuario> membros) {
        this.membros = membros;
    }

    public void adicionaMembros(Usuario usuario) {
        this.membros.add(usuario);
    }
    public List<String> apelidosMembros(){
        List<String> apelidos = new ArrayList<>();
        for (Usuario usuario : this.membros) {
            String apelido = usuario.getApelido();
            apelidos.add(apelido);
        }
        return apelidos;
    }
}
