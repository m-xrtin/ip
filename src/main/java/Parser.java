public class Parser {
    public static Task parseToDo(String input) {
        return new Task(input.trim());
    }

    public static Deadline parseDeadline(String input) {

        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("empty");
        } else if (!input.contains("/by")) {
            throw new IllegalArgumentException("badformat");
        }

        String[] parts = input.split("/by", 2);
        String description = parts[0].trim();
        String by = parts[1].trim();
        return new Deadline(description, by);
    }

    public static Events parseEvents(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("empty");
        } else if (!input.contains("/from") && !input.contains("/to")) {
            throw new IllegalArgumentException("badformat");
        }
        
        String[] parts = input.split("/from|/to", 3);
        String description = parts[0].trim();
        String from = parts[1].trim();
        String to = parts[2].trim();
        return new Events(description, from, to);
    }
}