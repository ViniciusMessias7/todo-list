package com.viniciusmessias.todo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        char command;
        String[] task = new String[0];

        System.out.println("1 - Add task");
        System.out.println("2 - List tasks");
        System.out.println("3 - Mark as completed");
        System.out.println("4 - Remove task");
        System.out.println("0 - Exit");
        System.out.print("> ");
        command = userInput.nextLine().charAt(0);
        switch (command) {
            case '1':
                System.out.println("You can add as many tasks as you want, up to a maximum of 10.");
                System.out.print("> ");
                int count = userInput.nextInt();
                task = new String[count];
                for (int i = 0; i < task.length; i++) {
                    System.out.print("Task " + (i + 1) + " name: ");
                    task[i] = userInput.next();
                }
            case '2':
                System.out.print("Tasks: ");
                for (String sequence : task) {
                    System.out.print(sequence + " ");
                }

        }
    }
}
