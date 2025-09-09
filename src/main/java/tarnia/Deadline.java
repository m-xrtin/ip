package tarnia;

public class Deadline extends Task {
    private String by;
    
    public Deadline(String description, String by) {
        super(description);
        this.by = by;
        this.taskType = "D";
    }

    @Override
    public String toString() {
        return super.toString() + " (by: " + by + ")";
    }
}