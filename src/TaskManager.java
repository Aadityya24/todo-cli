import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;
    private int nextId;

    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.nextId = 1;
    }

    public boolean addTask(String title) {
        if (title.isBlank()) {
            return false;
        } else {
            Task t = new Task(nextId, title);
            this.tasks.add(t);
            nextId++;
        }
        return true;

    }

    public boolean markTaskDone(int id){
        for(Task t : this.tasks){
            if(t.getId() == id){
                t.markDone();
                return true;
            }
        }
        return false;
    }

    public List<Task> getTasks() {
        return List.copyOf(tasks);
    }
}
