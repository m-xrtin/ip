public class CommandManager {
    private TaskManager manager;

    public CommandManager (TaskManager manager) {
        this.manager = manager;
    }

    public boolean handleCommand(String line) {
        String[] parts = line.split(" ", 2);
        String command = parts[0];

        switch (command) {
        case "list":
            Messages.printTaskList(manager.getTasks(), manager.getCount());
            break;
        case "mark":
        case "unmark":
            ErrorCatcher.catchMarkCommand(parts, manager, command);
            break;
        case "bye":
            Messages.printGoodbyeMessage();
            return false;
        case "deadline":
            ErrorCatcher.catchDeadlineCommand(parts, manager);
            break;
        case "event": 
            ErrorCatcher.catchEventCommand(parts, manager);
            break;
        case "todo":
            ErrorCatcher.catchTodoCommand(parts, manager);
            break;
        default:
            Messages.printUnkownCommand();
            break;
        }
        return true;
    }
}
