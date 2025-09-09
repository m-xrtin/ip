package tarnia;

public class ErrorCatcher {
    
    public static void catchMarkCommand(String[] parts, TaskManager manager, String command) {
        try {
            int index = Integer.parseInt(parts[1]) - 1;

            if (command.equals("mark")) {
                manager.markTask(index);
            } else if (command.equals("unmark")) {
                manager.unmarkTask(index);
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            Messages.printEmptyMessage(command);
        } catch (NumberFormatException e) {
            Messages.printNotANumber(command);
        } catch (IndexOutOfBoundsException e) {
            Messages.printOutOfRange(command);
        }
    }

    public static void catchTodoCommand(String[] parts, TaskManager manager) {
        try {
            manager.addTask(Parser.parseToDo(parts[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            Messages.printEmptyMessage("todo");
        }
    }

    public static void catchDeadlineCommand(String[] parts, TaskManager manager) {
        try {
            manager.addTask(Parser.parseDeadline(parts[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            Messages.printEmptyMessage("deadline");
        } catch (IllegalArgumentException e) {
            if (e.getMessage().equals("badformat")) {
                Messages.printBadDeadlineFormat();
            }
        }
    }

    public static void catchEventCommand(String[] parts, TaskManager manager) {
        try {
            manager.addTask(Parser.parseEvents(parts[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            Messages.printEmptyMessage("event");
        } catch (IllegalArgumentException e) {
            if (e.getMessage().equals("badformat")) {
                Messages.printBadEventFormat();
            }
        }
    }
}
