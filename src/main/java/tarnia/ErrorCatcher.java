package tarnia;

public class ErrorCatcher {

    public static void catchMarkCommand(String[] parts, TaskList manager, String command, Ui ui) {
        try {
            int index = Integer.parseInt(parts[1]) - 1;
            if ("mark".equals(command)) {
                manager.markTask(index);
            } else {
                manager.unmarkTask(index);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            ui.printEmptyMessage(command);
        } catch (NumberFormatException e) {
            ui.printNotANumber(command);
        } catch (IndexOutOfBoundsException e) {
            ui.printOutOfRange(command);
        }
    }

    public static void catchTodoCommand(String[] parts, TaskList manager, Ui ui) {
        try {
            manager.addTask(Parser.parseToDo(parts[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            ui.printEmptyMessage("todo");
        }
    }

    public static void catchDeadlineCommand(String[] parts, TaskList manager, Ui ui) {
        try {
            manager.addTask(Parser.parseDeadline(parts[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            ui.printEmptyMessage("deadline");
        } catch (IllegalArgumentException e) {
            if ("badformat".equals(e.getMessage())) {
                ui.printBadDeadlineFormat();
            }
        }
    }

    public static void catchEventCommand(String[] parts, TaskList manager, Ui ui) {
        try {
            manager.addTask(Parser.parseEvents(parts[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            ui.printEmptyMessage("event");
        } catch (IllegalArgumentException e) {
            if ("badformat".equals(e.getMessage())) {
                ui.printBadEventFormat();
            }
        }
    }

    public static void catchDeleteCommand(String[] parts, TaskList manager, Ui ui) {
        try {
            int index = Integer.parseInt(parts[1]) - 1;
            manager.deleteTask(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            ui.printEmptyMessage("delete");
        } catch (NumberFormatException e) {
            ui.printNotANumber("delete");
        } catch (IndexOutOfBoundsException e) {
            ui.printOutOfRange("delete");
        }
    }
}
