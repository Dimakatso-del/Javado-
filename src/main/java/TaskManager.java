import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks;                                                  // = new ArrayList<>(); // hint: will change in iteration 3

    public TaskManager() {
        // Initialize tasks list
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        //throw new UnsupportedOperationException("Implement this method!");
        tasks.add(task);
    }

    public List<String> listTasks() {
//        throw new UnsupportedOperationException("Implement this method!");
        return tasks;
    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
        // leave for iteration 2
    }
}
//testttt