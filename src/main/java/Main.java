import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code here
        System.out.println("Please enter your age.");
        Scanner inputScanner = new Scanner(System.in);
        int userInput = inputScanner.nextInt();
        if (userInput < 18) {
            System.out.println("Hello kiddos");
            if (userInput < 10) {
                System.out.println("Impressively young to be learning this!");
            }
        } else if (userInput == 18) {
            System.out.println("Hey there.");
            System.out.println("We've been expecting you!");
        } else if (userInput > 18) {
            System.out.println("Hey there.");
            System.out.println("Welcome to the program.");
        }
        // print for all
        System.out.println("Good to see you here!");
    }
}
