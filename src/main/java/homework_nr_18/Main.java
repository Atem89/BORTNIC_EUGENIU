package homework_nr_18;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask("Task 1");
        taskManager.addTask("Task 2");

        System.out.println("Total tasks: " + taskManager.getTaskCount());

        System.out.println("All tasks: " + taskManager.getAllTasks());

        taskManager.removeTask("Task 1");

        System.out.println("Total tasks after removal: " + taskManager.getTaskCount());
        System.out.println("All tasks after removal: " + taskManager.getAllTasks());

    }
}
