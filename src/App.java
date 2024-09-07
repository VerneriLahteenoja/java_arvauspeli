import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        String answer = "John";
        String guess = "";
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Guess a name:");

        while (true) {
            guess = in.nextLine();
            if (guess.equals(answer)) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Wrong, try again.");
            }
        }
    }
}
