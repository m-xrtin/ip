package tarnia;

public class Task {
    protected String description;
    protected boolean isDone;
    protected String taskType;
    
    public Task(String description) {
        this.description = description;
        this.isDone = false;
        this.taskType = "T";
    }

    public void markDone() {
        this.isDone = true;
    }

    public void markUndone() {
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    public String getDescription() {
        return this.description;
    }

    public String getTaskType() {
        return taskType;
    }

    @Override
    public String toString() {
        return "[" + taskType + "][" + getStatusIcon() + "] " + description;
    }

    public String toSaveFormat() {
        return "T | " + (isDone ? 1 : 0) + " | " + description;
    }
}
