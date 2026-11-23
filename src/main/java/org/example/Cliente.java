package org.example;

public class Cliente {

    IClassificacaoRisco classificacao;
    RiscoAdapter persistencia;

    public Cliente() {
        classificacao = new RiscoCategoria();
        persistencia = new RiscoAdapter(classificacao);
    }

    public void setClassificacao(String categoria) {
        classificacao.setClassificacao(categoria);
        persistencia.salvarClassificacao();
    }

    public String getClassificacao() {
        return persistencia.recuperarClassificacao();
    }

    public int getScore() {
        return persistencia.getScore();
    }
}