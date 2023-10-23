import Model.ListaModel;
import Controller.ListaController;
import View.ListaView;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaController controller = new ListaController();
        ListaView view = new ListaView();

        int opcao;

        do {
            opcao = view.exibirMenu();

            switch (opcao) {
                case 1:
                    String descricao = view.lerDescricaoTarefa();
                    controller.adicionarTarefa(descricao);
                    break;
                case 2:
                    List<ListaModel> tarefas = controller.obterTarefasNaoConcluidas();
                    view.exibirTarefas(tarefas);
                    System.out.print("Digite o número da tarefa a ser concluída: ");
                    int indiceConclusao = view.scanner.nextInt();
                    controller.concluirTarefa(indiceConclusao);
                    break;
                case 3:
                    List<ListaModel> tarefasNaoConcluidas = controller.obterTarefasNaoConcluidas();
                    view.exibirTarefas(tarefasNaoConcluidas);
                    break;
                case 4:
                    List<ListaModel> todasTarefas = controller.obterTodasTarefas();
                    view.exibirTarefas(todasTarefas);
                    break;
                case 5:
                    System.out.println("Encerrando o aplicativo.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);
    }
}