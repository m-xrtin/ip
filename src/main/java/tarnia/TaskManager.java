package tarnia;

import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasks = new ArrayList<>();
    private Storage storage;

    public TaskManager(Storage storage) {
        this.storage = storage;
        try {
            this.tasks = storage.load();
        } catch (Exception e) {
            this.tasks = new ArrayList<>();
        }
    }

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
        saveTasks();
    }
    
    public void markTask(int index) {
        tasks.get(index).markDone();
        Messages.printMarkTaskMessage(tasks.get(index));
        saveTasks();
    }

    public void unmarkTask(int index) {
        tasks.get(index).markUndone();
        Messages.printUnmarkTaskMessage(tasks.get(index));
        saveTasks();
    }

    public void deleteTask(int index) {
        Messages.printDeleteMessage(tasks, index);
        tasks.remove(index);
        Messages.printListCountMessage(tasks.size());
        saveTasks();

    }

    private void saveTasks() {
        try {
            storage.save(tasks);
        } catch (Exception e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

}
