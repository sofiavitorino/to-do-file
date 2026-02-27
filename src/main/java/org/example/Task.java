package org.example;


public class Task {

    public enum Status {
        PENDING,
        DONE
    }

    private String title;
    private int id;
    private Status status;


    public Task(String title, int id) {
        this.title = title;
        this.id = id;
        this.status = Status.PENDING;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}


