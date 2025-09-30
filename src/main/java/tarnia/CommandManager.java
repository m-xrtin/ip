package tarnia;

public class CommandManager {
    private TaskList manager;
    private Ui ui;

    public CommandManager(TaskList manager, Ui ui) {
        this.manager = manager;
        this.ui = ui;
    }

    public boolean handleCommand(String line) {
        String[] parts = line.split(" ", 2);
        String command = parts[0];

        switch (command) {
        case "list":
            ui.printTaskList(manager.getTasks());
            break;
        case "mark":
        case "unmark":
            ErrorCatcher.catchMarkCommand(parts, manager, command, ui);
            break;
        case "bye":
            ui.printGoodbyeMessage();
            return false;
        case "deadline":
            ErrorCatcher.catchDeadlineCommand(parts, manager, ui);
            break;
        case "event":
            ErrorCatcher.catchEventCommand(parts, manager, ui);
            break;
        case "todo":
            ErrorCatcher.catchTodoCommand(parts, manager, ui);
            break;
        case "delete":
            ErrorCatcher.catchDeleteCommand(parts, manager, ui);
            break;
        default:
            ui.printUnknownCommand();
            break;
        }
        return true;
    }
}

