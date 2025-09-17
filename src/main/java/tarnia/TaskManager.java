package tarnia;

import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasks = new ArrayList<>();

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public int getCount() {
        return tasks.size();
    }

    public void addTask(Task task) {
        tasks.add(task);
        Messages.printAddTaskMessage(task);
        Messages.printListCountMessage(tasks.size());
    }
    
    public void markTask(int index) {
        tasks.get(index).markDone();
        Messages.printMarkTaskMessage(tasks.get(index));
    }

    public void unmarkTask(int index) {
        tasks.get(index).markUndone();
        Messages.printUnmarkTaskMessage(tasks.get(index));
    }

    public void deleteTask(int index) {
        Messages.printDeleteMessage(tasks, index);
        tasks.remove(index);
        Messages.printListCountMessage(tasks.size());

    }
}
