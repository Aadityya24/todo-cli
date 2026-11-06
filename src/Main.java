public class Main{
    public static void main(String[] args){
        Task t1 = new Task(1, "Studying DSA");
        Task t2 = new Task(2,"Gym");


        t1.markDone();
        System.out.println(t1);
    }
}
