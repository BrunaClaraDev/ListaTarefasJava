package View;
import Model.ListaModel;
import java.util.Scanner;
import java.util.List;

public class ListaView {
    public Scanner scanner = new Scanner(System.in);

    public int exibirMenu() {
        System.out.println("\n===== Aplicativo de Lista de Tarefas =====");
        System.out.println("1. Adicionar Tarefas");
        System.out.println("2. Concluir Tarefas");
        System.out.println("3. Mostrar Tarefas não concluídas");
        System.out.println("4. Mostrar todas as Tarefas");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public String lerDescricaoTarefa() {
        System.out.print("Digite a descrição da tarefa: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public void exibirTarefas(List<ListaModel> tarefas) {
        for (int i = 1; i <= tarefas.size(); i++) {
            System.out.println(i + ". " + tarefas.get(i-1));
        }
    }
}
