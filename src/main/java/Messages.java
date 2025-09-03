public class Messages {

    public static void printHelloMessage() {
        System.out.println("Hello! I'm 𝓣𝓪𝓻𝓷𝓲𝓪 💔");
        System.out.println("What can I do for you?");
    }

    public static void printAddTaskMessage(Task task, int count) {
        System.out.println("added for ya: " + task);
        System.out.println("Now you have " + count + " task(s) in da list :o");
    }

    public static void printTaskList(Task[] tasks, int count) {
        System.out.println("Here are the tasks in your list! :");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + tasks[i]);
        }
    }

    public static void printMarkTaskMessage(Task task) {
        System.out.println("Yayyyy :), I've marked this task as done:");
        System.out.println("  " + task);
    }

    public static void printUnmarkTaskMessage(Task task) {
        System.out.println("OK :( , I've marked this task as not done yet:");
        System.out.println("  " + task);
    }

    public static void printGoodbyeMessage() {
        System.out.println("BYE BYE. Hope to see you again soon! xo xo");
    }

}
