import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        //Using random function to creat a random number
        Random num = new Random();
        int GuessNum = num.nextInt(100) + 1;
    

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            //Guess the user a number
              Scanner scanner = new Scanner(System.in);
              int guess = scanner.nextInt();
    
            if (guess == GuessNum) {
                System.out.println("Congratulations, you guessed the number!");
                break;
            } else if (guess < GuessNum) {
                System.out.println("Your guess is too low. Try again:");
            } else {
                System.out.println("Your guess is too high. Try again:");
            }
        }
    }
}
