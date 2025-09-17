package tarnia;
import java.util.Scanner;

public class Tarnia {

    public static void main(String[] args) {

        Messages.printHelloMessage();
        Scanner in = new Scanner(System.in);
        Storage storage = new Storage("./data/tarnia.txt");
        TaskManager manager = new TaskManager(storage);
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
    




