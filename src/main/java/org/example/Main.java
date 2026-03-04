package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        FileManager fileManager = new FileManager();
        fileManager.loadTasks(manager.getTasks());
        while (true) {
            System.out.println("------------ ToDo List ------------");
            System.out.println("Escolha a opção desejada: ");
            System.out.println("[1] Criar tarefa");
            System.out.println("[2] Visualizar tarefas");
            System.out.println("[3] Editar tarefa");
            System.out.println("[4] Deletar tarefa");
            System.out.println("[5] Marcar como concluída");
            System.out.println("[0] Sair");
            System.out.println();
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Digite o título");
                    String title = scanner.nextLine();
                    manager.addTask(title);
                    fileManager.saveTasks(manager.getTasks());
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
                    fileManager.saveTasks(manager.getTasks());
                    break;
                case 4:
                    manager.listTasks();
                    System.out.println("Digite qual tarefa deseja deletar:");
                    int delete = scanner.nextInt();
                    manager.deleteTask(delete);
                    fileManager.saveTasks(manager.getTasks());
                    break;
                case 5:
                    manager.listTasks();
                    System.out.println("Digite qual tarefa deseja completar:");
                    int complete = scanner.nextInt();
                    manager.setDone(complete);
                    fileManager.saveTasks(manager.getTasks());
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
