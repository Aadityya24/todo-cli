import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Task> tasks = new ArrayList<>();
        int nextId = 1;

        while(true){
            System.out.println("1: Add task");
            System.out.println("2: show task");
            System.out.println("3: End");
            System.out.print("> ");
            String choice = sc.nextLine();

            if(choice.equals("1")){
                System.out.print("Title : ");
                String title = sc.nextLine();
                Task t = new Task(nextId,title);
                tasks.add(t);
                nextId++;
            }
            else if(choice.equals("2")){
                if(tasks.isEmpty()){
                    System.out.println("No task added.");
                }
                System.out.println(tasks);
            }
            else if(choice.equals("3")){
                System.out.println("Byee!");
                break;
            }
            else {
                System.out.println("Unknown option");
            }
        }


    }
}
