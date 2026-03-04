package org.example;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    private static final String FILE_PATH = "tasks.txt";

    public void saveTasks(ArrayList<Task> tasks) {
        try {
            FileWriter fw = new FileWriter(FILE_PATH);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Task task : tasks) {
                bw.write(task.getId() + "," + task.getTitle() + "," + task.getStatus());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar tarefas: " + e.getMessage());
        }
    }

    public void loadTasks(ArrayList<Task> tasks) {
        try {
            FileReader fr = new FileReader(FILE_PATH);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                Task.Status status = Task.Status.valueOf(parts[2]);
                tasks.add(new Task(title, id, status));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Erro ao carregar tarefas: " + e.getMessage());
        }
    }
}