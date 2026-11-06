public class Task {
    private int id;
    private String title;
    private boolean done;

    public Task(int id, String title){
        this.id = id;
        this.title = title;
        this.done = false;
    }
    //getters
    public String getTitle(){
        return title;
    }
    public int getId(){
        return id;
    }
    public boolean isDone(){
        return done;
    }

    //action
    public void markDone(){
        this.done = true;
    }

    @Override
    public String toString() {
        String mark = done ? "[x]" : "[ ]";
        return "#" + id + " " + mark + " " + title;
    }
}
