package com.viniciusmessias.todo.domain;

import java.util.ArrayList;
import java.util.List;

public class Listing {
    private final List<Task> tasks;

    public Listing() {
        this.tasks = new ArrayList<>();

    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void removeTask(int index) {
        this.tasks.remove(index);
    }

    public void showAllTasks() {
        int count = 0;
        for (Task task : tasks) {
            System.out.println(++count + ". " + task.getName());
        }
    }
}
