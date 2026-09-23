package Lab11_Collection;

import java.util.ArrayList;
import java.util.Scanner;

class Task {

    private int taskId;
    private String taskName;
    private String description;
    private String priority;
    private String status;

    public Task(int taskId, String taskName, String description, String priority, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }
    public int getTaskId() {
        return taskId;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void display() {
        System.out.println("----------------------------------");
        System.out.println("Task ID     : " + taskId);
        System.out.println("Task Name   : " + taskName);
        System.out.println("Description : " + description);
        System.out.println("Priority    : " + priority);
        System.out.println("Status      : " + status);
    }
}

public class TaskManagement {

    static ArrayList<Task> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addTask() {

        System.out.print("Enter Task ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Task Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Description: ");
        String desc = sc.nextLine();

        System.out.print("Enter Priority (High/Medium/Low): ");
        String priority = sc.nextLine();

        System.out.print("Enter Status (Pending/In Progress): ");
        String status = sc.nextLine();

        tasks.add(new Task(id, name, desc, priority, status));

        System.out.println("Task Added Successfully.");
    }
    static Task searchTask(int id) {

        for (Task t : tasks) {
            if (t.getTaskId() == id) {
                return t;
            }
        }
        return null;
    }
    static void displayAllTasks() {

        if (tasks.isEmpty()) {
            System.out.println("No Tasks Available.");
            return;
        }

        for (Task t : tasks) {
            t.display();
        }
    }
    static void updateTaskStatus() {

        System.out.print("Enter Task ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Task t = searchTask(id);

        if (t == null) {
            System.out.println("Task Not Found.");
            return;
        }

        System.out.print("Enter New Status: ");
        String status = sc.nextLine();

        t.setStatus(status);

        System.out.println("Task Status Updated.");
    }
    static void deleteTask() {

        System.out.print("Enter Task ID: ");
        int id = sc.nextInt();

        Task t = searchTask(id);

        if (t != null) {
            tasks.remove(t);
            System.out.println("Task Deleted Successfully.");
        } else {
            System.out.println("Task Not Found.");
        }
    }
    static void markCompleted() {

        System.out.print("Enter Task ID: ");
        int id = sc.nextInt();

        Task t = searchTask(id);

        if (t != null) {
            t.setStatus("Completed");
            System.out.println("Task Marked as Completed.");
        } else {
            System.out.println("Task Not Found.");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== Task Management System =====");
            System.out.println("1. Add Task");
            System.out.println("2. Display All Tasks");
            System.out.println("3. Search Task by ID");
            System.out.println("4. Update Task Status");
            System.out.println("5. Delete Task");
            System.out.println("6. Mark Task as Completed");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addTask();
                    break;

                case 2:
                    displayAllTasks();
                    break;

                case 3:
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();

                    Task t = searchTask(id);

                    if (t != null)
                        t.display();
                    else
                        System.out.println("Task Not Found.");
                    break;

                case 4:
                    updateTaskStatus();
                    break;

                case 5:
                    deleteTask();
                    break;

                case 6:
                    markCompleted();
                    break;

                case 7:
                    System.out.println("Thank You.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice != 7);
    }
}
