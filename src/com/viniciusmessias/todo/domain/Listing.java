package com.viniciusmessias.todo.domain;

import java.util.ArrayList;
import java.util.List;

public class Listing {
    private final List<Task> tasks;
    private final List<Boolean> isCompleted;
    private final String[] statusString = {" [not completed]", " [completed]"};

    public Listing() {
        this.tasks = new ArrayList<>();
        this.isCompleted = new ArrayList<>();

    }

    public void addTask(Task task) {
        this.tasks.add(task);
        this.isCompleted.add(false);
    }

    public void completeTask(int index) {
        this.isCompleted.set(index, true);
    }

    public void removeTask(int index) {
        this.tasks.remove(index);
        this.isCompleted.remove(index);
    }

    public void showAllTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            String task = tasks.get(i).getName();
            boolean status = isCompleted.get(i);
            String textStatus = statusString[status ? 1 : 0];
            System.out.println(i + 1 + " - " + task + textStatus);
        }
    }
}
