import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        String answer = "John";
        String guess = "";
        int guessCount = 0;
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Guess a name:");

        while (true) {
            guess = in.nextLine();

            if (guess.equals("stop")) {
                System.out.println("Stopping...");
                break;
            }

            guessCount++;
            if (guess.equals(answer)) {
                System.out.println("Correct!");
                System.out.printf("You guessed %d times\n", guessCount);
                break;
            } else {
                System.out.println("Wrong, try again.");
            }
        }
    }
}
