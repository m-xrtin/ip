import java.util.Scanner;
public class Tarnia {
    public static void main(String[] args) {
        System.out.println("Hello! I'm 𝓣𝓪𝓻𝓷𝓲𝓪 💔\n");
        System.out.println("What can I do for you?\n");

        String line;
        Scanner in = new Scanner(System.in);
        while (true) {
            line = in.nextLine();
            if (line.equals("bye")) {
                System.out.println("Bye. Hope to see you again soon! xo xo\n");
                break;
            }
            System.out.println(line);
        }
    }
}
