import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Blackjack blackjack = new Blackjack();
    /*Scanner for user input. Takes two integer values. The program then
        checks these values for certain conditions. Condition: Return the value of the
        number that is closer to 21 without going over 21.
         */
        Scanner intScanner = new Scanner(System.in);
        System.out.println("Input your first number.");
        int firstInt = intScanner.nextInt();
        System.out.println("Input your second number.");
        int secondInt = intScanner.nextInt();

        blackjack.blackjack(firstInt,secondInt);

    }
}