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
            manager.markTask(Integer.parseInt(parts[1]) - 1);
            break;
        case "unmark":
            manager.unmarkTask(Integer.parseInt(parts[1]) - 1);
            break;
        case "bye":
            Messages.printGoodbyeMessage();
            return false;
        default:
            manager.addTask(line);
            break;
        }
        return true;
    }
}
