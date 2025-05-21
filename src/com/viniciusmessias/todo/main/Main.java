package com.viniciusmessias.todo.main;

import com.viniciusmessias.todo.domain.Listing;
import com.viniciusmessias.todo.domain.Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Listing listing = new Listing();
        char command = ' ';

        while (command != '0') {
            System.out.println("1 - Add task");
            System.out.println("2 - List tasks");
            System.out.println("3 - Complete task");
            System.out.println("4 - Remove task");
            System.out.println("0 - Quit");
            System.out.print("Option: ");
            command = userInput.nextLine().charAt(0);

            switch (command) {
                case '1':
                    System.out.print("Add a task: ");
                    listing.addTask(new Task(userInput.nextLine()));
                    System.out.println("Congratulations you add a task 👍");
                    System.out.println();
                    break;
                case '2':
                    System.out.println("List:");
                    listing.showAllTasks();
                    System.out.println();
                    break;
                case '3':
                    listing.showAllTasks();
                    System.out.println("Please, choose the number related to a task you want to complete:");
                    listing.completeTask(userInput.nextInt() - 1);
                    userInput.nextLine();
                    break;
                case '4':
                    listing.showAllTasks();
                    System.out.println("Please, choose the number related to a task you want to remove:");
                    listing.removeTask(userInput.nextInt() - 1);
                    userInput.nextLine();
                    System.out.println("Task removed successfully 😁");
                    System.out.println();
                    break;
            }
        }
    }
}
