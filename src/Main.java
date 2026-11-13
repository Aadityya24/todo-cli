import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Task> tasks = new ArrayList<>();
        int nextId = 1;

        while(true){
            System.out.print("Title (q to quit) : ");
            String title = sc.nextLine();

            if(title.equals("q")){
                break;
            }
            Task t = new Task(nextId,title);
            tasks.add(t);
            nextId++;

        }

        System.out.println(tasks);
    }
}
