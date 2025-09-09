package tarnia;
import java.util.Scanner;

public class Tarnia {

    public static void main(String[] args) {

        Messages.printHelloMessage();
        Scanner in = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        CommandManager commandManager = new CommandManager(manager);
        while (true) {
            String line = in.nextLine().trim();
            if (!commandManager.handleCommand(line)) {
                break;
            }
        }
        in.close();
    }
}
    




