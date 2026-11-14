import java.util.*;

public class Main {
    static void showTask(List<Task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No task added.");
        } else {
            for (Task t : tasks) {
                System.out.println(t);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("1: Add task");
            System.out.println("2: show task");
            System.out.println("3: Mark as done");
            System.out.println("4: End");
            System.out.print("> ");
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                System.out.print("Title : ");
                String title = sc.nextLine();
                if(manager.addTask(title)){
                    System.out.println("Task added");
                }
                else{
                    System.out.println("Title cannot be empty");
                }
            } else if (choice.equals("2")) {
                showTask(manager.getTasks());
            } else if (choice.equals("3")) {
                System.out.print("Task id: ");
                try {
                    int id = Integer.parseInt(sc.nextLine().trim());
                    if(manager.markTaskDone(id)){
                        System.out.println("Task marked as done");
                    }
                    else{
                        System.out.println("Invalid id!!");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Invalid entry");
                }

            } else if (choice.equals("4")) {
                System.out.println("Byee!");
                break;
            } else {
                System.out.println("Unknown option");
            }
        }


    }
}
