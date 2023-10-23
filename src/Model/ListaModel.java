package Model;

public class ListaModel {
    private String descricao;
    private boolean concluida;

    public ListaModel(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarConcluida() {
        concluida = true;
    }

    @Override
    public String toString() {
        return descricao + (concluida ? " (Concluída)" : " (Não Concluída)");
    }
}
