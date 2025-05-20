package com.viniciusmessias.todo.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();
        char command = ' ';
        int correctPositionTaskCompleted = 0;
        int correctPositionTaskRemoved = 0;
        boolean taskCompleted = false;
        boolean taskRemoved = false;

        while (command != '0') {
            System.out.println("0 - Exit");
            System.out.println("1 - Add task");
            System.out.println("2 - List task");
            System.out.println("3 - Complete task");
            System.out.println("4 - Remove task");
            System.out.print("Option: ");
            command = userInput.nextLine().charAt(0);

            switch (command) {
                case '1':
                    System.out.println("Add a task: ");
                    tasks.add(userInput.nextLine());
                    break;
                case '2':
                    if (taskRemoved) {
                        tasks.remove(correctPositionTaskRemoved);
                    }

                    taskRemoved = false;
                    if (taskCompleted) {
                        for (int i = 0; i < tasks.size(); i++) {
                            if (i != correctPositionTaskCompleted) {
                                System.out.println("[" + "] " + tasks.get(i));
                            } else {
                                System.out.println("[" + "x]" + tasks.get(correctPositionTaskCompleted));
                            }
                        }
                    } else {
                        for (String task : tasks) {
                            System.out.println("[" + "] " + task);
                        }
                    }
                    break;
                case '3':
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + " - " + tasks.get(i));
                        if (i == tasks.size() - 1) {
                            System.out.println("Type the respective number of the task to complete: ");
                            correctPositionTaskCompleted = userInput.nextInt() - 1;
                            userInput.nextLine();
                            taskCompleted = true;
                        }
                    }
                    break;
                case '4':
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + " - " + tasks.get(i));
                        if (i == tasks.size() - 1) {
                            System.out.println("Type the respective number of the task to remove: ");
                            correctPositionTaskRemoved = userInput.nextInt() - 1;
                            userInput.nextLine();
                            taskRemoved = true;
                        }
                    }
                    break;
            }
        }
    }
}
