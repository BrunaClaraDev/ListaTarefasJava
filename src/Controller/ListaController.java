package Controller;
import Model.ListaModel;
import java.util.ArrayList;
import java.util.List;
public class ListaController {
    private List<ListaModel> tarefas = new ArrayList<ListaModel>();

    public void adicionarTarefa(String descricao) {
        ListaModel tarefa = new ListaModel(descricao);
        tarefas.add(tarefa);
    }

    public void concluirTarefa(int indice) {
        indice = indice - 1;
        if (indice  >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarConcluida();
        }
        else {
            System.out.print("Tarefa não encontrada. Tente novamente!");
        }
    }

    public List<ListaModel> obterTarefasNaoConcluidas() {
        List<ListaModel> tarefasNaoConcluidas = new ArrayList<ListaModel>();
        for (ListaModel tarefa : tarefas) {
            if (!tarefa.isConcluida()) {
                tarefasNaoConcluidas.add(tarefa);
            }
        }
        return tarefasNaoConcluidas;
    }

    public List<ListaModel> obterTodasTarefas() {
        return tarefas;
    }
}
