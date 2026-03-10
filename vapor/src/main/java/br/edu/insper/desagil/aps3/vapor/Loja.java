package br.edu.insper.desagil.aps3.vapor;

import java.util.List;

public class Loja {
    private Usuario dono;
    private List <Jogo> jogos;

    public Loja(Usuario dono, List<Jogo> jogos) {
        this.dono = dono;
        this.jogos = jogos;
    }

    public Usuario getDono() {
        return dono;
    }

    public int numeroAvaliados(Usuario usuario) {
        int contagem = 0;
        for (Jogo jogo : jogos) {
            if (jogo.avaliado(usuario.getApelido())){
                contagem+=1;
            }
        }
        return contagem;
    }
}
