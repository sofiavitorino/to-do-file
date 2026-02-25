package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                break;
                case 2:
                    System.out.println("tarefa x teste");
                    break;
                case 3:
                    System.out.println("Digite qual tarefa deseja editar:");
                    break;
                case 4:
                    System.out.println("Digite qual tarefa deseja deletar:");
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
