import java.util.Scanner;
public class Tarnia {
    public static void main(String[] args) {
        System.out.println("Hello! I'm 𝓣𝓪𝓻𝓷𝓲𝓪 💔");
        System.out.println("What can I do for you?");

        String line;
        Scanner in = new Scanner(System.in);
        String[] list = new String[100];
        int counter = 0;
        while (true) {
            line = in.nextLine();
            if (line.equals("list")){
                for (int i = 0; i < counter; i ++){
                    System.out.println((i + 1) + ". " + list[i]);
                }
            }
            else if (line.equals("bye")) {
                System.out.println("BYE BYE. Hope to see you again soon! xo xo");
                break;
            }
            else {
                list[counter] = line;
                System.out.println("added for ya: " + list[counter]);
                counter++;
            }
        }
    }
}
