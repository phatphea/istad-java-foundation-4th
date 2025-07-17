package todolist;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static void menu(){
        System.out.println("""
                ==========| Menu |==========
                1. Add task
                2. View all tasks
                3. Mark task as completed
                4. Delete task
                5. Exit
                ============================""");

    }

    //validate is match to a menu
    static boolean isMatchOption(String input, String regex){

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TodoManagerServices services = new TodoManagerImpl();

        int option = 0;
        do {

            menu();
            System.out.print("Enter the option -> ");

            String input = scanner.nextLine();
            if(isMatchOption(input, "[1-5]")){
                option = Integer.parseInt(input);
            }

            switch (option) {
                case 1: {
                    System.out.println("===============================");
                    System.out.print("Enter Task Title: ");
                    String inputTitle = scanner.nextLine();
                    System.out.print("Enter Description: ");
                    String inputDesc = scanner.nextLine();

                    String title = "";
                    if (inputTitle != null && !inputTitle.trim().isEmpty()) {
                        title = inputTitle;
                    } else {
                        System.out.println("Invalid title: Title cannot be empty.");
                        break;
                    }

                    String desc = "";
                    if (inputDesc != null && !inputDesc.trim().isEmpty()) {
                        desc = inputDesc;
                    } else {
                        System.out.println("Invalid description: Description cannot be empty.");
                        break;
                    }

                    if (services.addTask(title, desc)) {
                        System.out.println("===============================");
                        System.out.println("Created task successfully");
                    } else {
                        System.out.println("Failed to create task: Service error or duplicate task.");
                    }
                    break;
                }
                case 2: {
                    List<Task> tasks = services.viewAllTasks();
                    System.out.println("===========| Task Lists |===========");
                    System.out.printf("%-5s %-20s %-30s %-10s\n", "ID", "Title", "Description", "isCompleted");
                    for (Task task : tasks) {
                        System.out.printf("%-5d %-20s %-30s %-10s\n",
                                task.getId(),
                                task.getTitle(),
                                task.getDescription(),
                                task.getCompleted());
                    }
                    System.out.println("+++++++++++++++++++++++++++++++++++++++");
                    break;
                }
                case 3: {
                    System.out.println("===============================");
                    System.out.print("Enter Task ID: ");
                    String inputId = scanner.nextLine();
                    try {
                        if (!isMatchOption(inputId, "[0-9]+")) {
                            System.out.println("Invalid ID: Must be a number.");
                            break;
                        }
                        Long id = Long.parseLong(inputId);
                        if (services.markTaskAsCompleted(id)) {
                            System.out.println("Task is completed!");
                        } else {
                            System.out.println("Task not found!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID: Must be a valid number.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("===============================");
                    System.out.print("Enter Task ID: ");
                    String inputId = scanner.nextLine();
                    try {
                        if (!isMatchOption(inputId, "[0-9]+")) {
                            System.out.println("Invalid ID: Must be a number.");
                            break;
                        }
                        Long id = Long.parseLong(inputId);
                        if (services.deleteTask(id)) {
                            System.out.println("Task is deleted!");
                        } else {
                            System.out.println("Task not found!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID: Must be a valid number.");
                    }
                    break;
                }
                case 5:
                    System.out.println("Exiting the program!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }

        }while (option!=5);
    }

}
