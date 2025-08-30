import java.util.Scanner;

public class Tarnia {
    public static void main(String[] args) {
        System.out.println("Hello! I'm 𝓣𝓪𝓻𝓷𝓲𝓪 💔");
        System.out.println("What can I do for you?");

        Scanner in = new Scanner(System.in);
        Task[] tasks = new Task[100];
        int counter = 0;

        while (true) {
            String line = in.nextLine().trim();
            // split into command and index
            String[] parts = line.split(" ", 2);
            String command = parts[0];

            // Switch is more efficient for these tasks, changed from if/else statements
            switch (command) {
            case "list":
                System.out.println("Here are the tasks in your list! :");
                for (int i = 0; i < counter; i++) {
                    System.out.println((i + 1) + ". "
                            + "[" + tasks[i].getStatusIcon() + "] "
                            + tasks[i].getDescription());
                }
                break;

            case "mark":
                int mark_index = Integer.parseInt(parts[1]) - 1;
                tasks[mark_index].markDone();
                System.out.println("Yayyyy :), I've marked this task as done:");
                System.out.println("  [" + tasks[mark_index].getStatusIcon() + "] "
                        + tasks[mark_index].getDescription());
                break;

            case "unmark":
                // Offsetting the index
                int unmark_index = Integer.parseInt(parts[1]) - 1;
                tasks[unmark_index].markUndone();
                System.out.println("OK :( , I've marked this task as not done yet:");
                System.out.println("  [" + tasks[unmark_index].getStatusIcon() + "] "
                        + tasks[unmark_index].getDescription());
                break;

            case "bye":
                System.out.println("BYE BYE. Hope to see you again soon! xo xo");
                in.close();
                return;

            default:
                // Assume default is task, add to list
                tasks[counter] = new Task(line);
                System.out.println("added for ya: "
                        + "[" + tasks[counter].getStatusIcon() + "] "
                        + tasks[counter].getDescription());
                counter++;
                break;
            }
        }
    }
}


