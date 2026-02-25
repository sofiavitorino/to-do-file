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

    public void editTask(){

    }

    public void deleteTask(){

    }

    public void setDone(){

    }

    public void listTask(){

    }

}
