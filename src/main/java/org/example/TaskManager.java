package org.example;

import java.util.ArrayList;

public class TaskManager {
    private int nextId;
    private ArrayList<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.nextId = 1;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void addTask(String title){
        Task task = new Task(title, nextId);
        tasks.add(task);
        nextId++;
    }

    public void editTask(int id, String newTitle) {
        for (Task task : tasks) {
            if (id == task.getId()) {
                task.setTitle(newTitle);
                System.out.println("Tarefa editada com sucesso!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }

    public void deleteTask(int id){
        for (Task task : tasks) {
            if (id == task.getId()) {
                tasks.remove(task);
                System.out.println("Objeto removido com sucesso!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }

    public void setDone(int id){
        for (Task task : tasks) {
            if (id == task.getId()) {
                task.setStatus(Task.Status.DONE);
                System.out.println("Tarefa marcada como feita!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        for (Task task : tasks) {
            System.out.printf("[%d] %s - %s%n", task.getId(), task.getTitle(), task.getStatus());
        }
    }

}
