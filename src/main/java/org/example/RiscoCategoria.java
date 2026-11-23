package org.example;

public class RiscoCategoria implements IClassificacaoRisco {

    private String categoria;

    @Override
    public String getClassificacao() {
        return this.categoria;
    }

    @Override
    public void setClassificacao(String categoria) {
        this.categoria = categoria;
    }
}