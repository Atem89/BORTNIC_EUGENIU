package homework_nr_18;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Thread addThread = new Thread(new AddTaskRunnable(taskManager));
        Thread removeThread = new Thread(new RemoveTaskRunnable(taskManager));

        addThread.start();
        removeThread.start();

        try {
            addThread.join();
            removeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Total tasks: " + taskManager.getTaskCount());
        System.out.println("All tasks: " + taskManager.getAllTasks());
    }
}

class AddTaskRunnable implements Runnable {
    private final TaskManager taskManager;

    public AddTaskRunnable(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            taskManager.addTask("Task " + i);
        }
    }
}

class RemoveTaskRunnable implements Runnable {
    private final TaskManager taskManager;

    public RemoveTaskRunnable(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            taskManager.removeTask("Task " + i);
        }
    }
}
