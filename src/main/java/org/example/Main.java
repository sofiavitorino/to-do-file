package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        while (true) {
            System.out.println("------------ ToDo List ------------");
            System.out.println("Escolha a opção desejada: ");
            System.out.println("[1] Criar tarefa");
            System.out.println("[2] Visualizar tarefas");
            System.out.println("[3] Editar tarefa");
            System.out.println("[4] Deletar tarefa");
            System.out.println("[5] Marcar como concluída");
            System.out.println("[0] Sair");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Digite o título");
                    String title = scanner.nextLine();
                    manager.addTask(title);
                break;
                case 2:
                    manager.listTasks();
                    break;
                case 3:
                    manager.listTasks();
                    System.out.println("Digite o ID da tarefa a editar: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Novo título: ");
                    String newTitle = scanner.nextLine();
                    manager.editTask(editId, newTitle);
                    break;
                case 4:
                    manager.listTasks();
                    System.out.println("Digite qual tarefa deseja deletar:");
                    int delete = scanner.nextInt();
                    manager.deleteTask(delete);
                    break;
                case 5:
                    System.out.println("escolha a tarefa a ser marcada como concluida");
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
