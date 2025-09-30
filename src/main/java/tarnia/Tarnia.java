package tarnia;
import java.util.Scanner;

public class Tarnia {

    private Ui ui;
    private Storage storage;
    private TaskList tasks;
    private CommandManager commands;

    public Tarnia(String filePath) {
        ui = new Ui();
        storage = new Storage(filePath);
        tasks = new TaskList(storage, ui);
        commands = new CommandManager(tasks, ui);
    }

    public void run() {
        ui.printHelloMessage();
        Scanner in = new Scanner(System.in);
        while (true) {
            String line = in.nextLine().trim();
            if (!commands.handleCommand(line)) {
                break;
            }
        }
        in.close();
    }

    public static void main(String[] args) {
        new Tarnia("./data/tarnia.txt").run();
    }
}

    




