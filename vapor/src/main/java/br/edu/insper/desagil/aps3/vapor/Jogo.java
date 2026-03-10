package br.edu.insper.desagil.aps3.vapor;

import java.util.HashMap;
import java.util.Map;

public class Jogo {
    private int id;
    private String nome;
    private Map<String, Integer> avaliacoes;

    public Jogo(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.avaliacoes = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void avalia(String apelido, int avaliacao) {
        this.avaliacoes.put(apelido, avaliacao);
    }

    public boolean avaliado(String apelido) {
        boolean resposta = false;
        if (this.avaliacoes.containsKey(apelido)) {
            resposta = true;
        }
        return resposta;
    }

    public double media() {
        double media = 0;
        if (this.avaliacoes.isEmpty()) {
            return media;
        } else {
            double sum = 0;
            for (int avaliacao : this.avaliacoes.values()){
                sum += avaliacao;
            }
            media = sum/this.avaliacoes.size();
        }
        return media;
    }
}
