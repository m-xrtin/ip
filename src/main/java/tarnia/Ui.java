package tarnia;

import java.util.ArrayList;

public class Ui {

    public void printHelloMessage() {
        System.out.println("Hello! I'm TARNIA 💔");
        System.out.println("What can I do for you?");
    }

    public void printAddTaskMessage(Task task) {
        System.out.println("added for ya: " + task);
    }

    public void printTaskList(ArrayList<Task> tasks) {
        System.out.println("Here are the tasks in your list! :");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void printMarkTaskMessage(Task task) {
        System.out.println("Yayyyy :), I've marked this task as done:");
        System.out.println("  " + task);
    }

    public void printUnmarkTaskMessage(Task task) {
        System.out.println("OK :( , I've marked this task as not done yet:");
        System.out.println("  " + task);
    }

    public void printGoodbyeMessage() {
        System.out.println("BYE BYE. Hope to see you again soon! xo xo");
    }

    public void printEmptyMessage(String command) {
        System.out.println("Heyy, You need to include a message for this task: " + command);
    }
    public void printNotANumber(String command) {
        System.out.println("NOOOOOO >:( The argument for " + command + " must be a number.");
    }

    public void printOutOfRange(String command) {
        System.out.println("Oopsie Daisies :/ The task index given for " + command + " is out of range.");
    }
    
    public void printBadDeadlineFormat() {
        System.out.println("Damnn the deadline format is wrong. Use: deadline <task> /by <time>");
    }

    public void printBadEventFormat() {
        System.out.println("OOPS!!! The event format is wrong. Use: event <task> /from <start time> /to <end time>");
    }

    public void printUnknownCommand() {
        System.out.println("Sorry Mate, Don't know what you're on about.");
    }

    public void printDeleteMessage(ArrayList<Task> tasks, int index) {
        System.out.println("Okay noteddd, I will delete this task:");
        System.out.println(tasks.get(index));
    }

    public void printListCountMessage(int count) {
        System.out.println("Now you have " + count + " task(s) in da list :o");
    }

    public void printFoundTasks(ArrayList<Task> results) {
        System.out.println("Here are the tasks you searched for in the list!");
        for (int i = 0; i < results.size(); i++) {
            System.out.println((i + 1) + ". " + results.get(i));
        }
    }
    
    public void printFoundNoTasks() {
        System.out.println("Sorryy, didn't manage to find any tasks you searched for:(");
    }

}
