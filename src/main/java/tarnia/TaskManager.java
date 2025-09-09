package tarnia;

public class TaskManager {

    private static final int MAX_TASKS = 100;
    private Task[] tasks = new Task[MAX_TASKS];
    private int counter = 0;

    public Task[] getTasks() {
        return tasks;
    }

    public int getCount() {
        return counter;
    }

    public void addTask(Task task) {
        tasks[counter] = task;
        counter++;
        Messages.printAddTaskMessage(task, counter);
    }
    
    public void markTask(int index) {
        tasks[index].markDone();
        Messages.printMarkTaskMessage(tasks[index]);
    }

    public void unmarkTask(int index) {
        tasks[index].markUndone();
        Messages.printUnmarkTaskMessage(tasks[index]);
    }
}
