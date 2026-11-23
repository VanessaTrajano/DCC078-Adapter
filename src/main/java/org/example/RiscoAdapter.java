package org.example;

public class RiscoAdapter extends ScoreSerasa {

    private IClassificacaoRisco riscoCategoria;

    public RiscoAdapter(IClassificacaoRisco riscoCategoria) {
        this.riscoCategoria = riscoCategoria;
    }

    public String recuperarClassificacao() {
        if (this.getScore() >= 800)
            riscoCategoria.setClassificacao("Baixo");
        else
        if (this.getScore() >= 600)
            riscoCategoria.setClassificacao("Médio");
        else
        if (this.getScore() >= 400)
            riscoCategoria.setClassificacao("Alto");
        else
            riscoCategoria.setClassificacao("Crítico");
        return riscoCategoria.getClassificacao();
    }

    public void salvarClassificacao() {
        if (riscoCategoria.getClassificacao().equals("Baixo"))
            this.setScore(800);
        else
        if (riscoCategoria.getClassificacao().equals("Médio"))
            this.setScore(600);
        else
        if (riscoCategoria.getClassificacao().equals("Alto"))
            this.setScore(400);
        else
            this.setScore(0);
    }
}