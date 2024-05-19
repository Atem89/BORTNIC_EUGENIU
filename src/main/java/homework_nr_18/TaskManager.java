package homework_nr_18;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TaskManager {
    private final List<String> tasks;

    public TaskManager() {
        this.tasks = Collections.synchronizedList(new LinkedList<>());
    }

    public void addTask(String task) {
        if (task != null && !task.isEmpty()) {
            synchronized (tasks) {
                tasks.add(task);
            }
        }
    }

    public void removeTask(String task) {
        synchronized (tasks) {
            tasks.remove(task);
        }
    }

    public int getTaskCount() {
        synchronized (tasks) {
            return tasks.size();
        }
    }

    public List<String> getAllTasks() {
        synchronized (tasks) {
            return new LinkedList<>(tasks);
        }
    }

}
