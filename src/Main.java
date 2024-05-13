import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("""
                               Welcome to the Dolphine Swimming Club
                               1.
                               2.
                               3.
                               4.
                               LOL
                               
                               
                               """);
            int choice = input.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Welcome");
                    break;
                case 2:
                    System.out.println("WELCOME");
                    break;
                case 3:
                    System.out.println("VELKOMMEN!");
                    break;
                case 4:
                    System.out.println("YOU'RE ABANDONING ME?! I AM CRYING!");
                    return;
                default:
                    System.out.println("WRONG INPUT! YOU WORD BLIND OR WHAT.");
            }
        }
    }
}