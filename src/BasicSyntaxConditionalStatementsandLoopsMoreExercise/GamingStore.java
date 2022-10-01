package BasicSyntaxConditionalStatementsandLoopsMoreExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());

        double spend = 0;

        while (true) {
            String nameGame = scanner.nextLine();

            if (nameGame.equals("Game Time") ) {
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n",spend,balance );
                break;
            } if (balance == 0) {
                System.out.printf("Out of money!%n");
                break;
            }
            double price = 0;
            switch (nameGame) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;

                    if (balance >= price) {
                        System.out.printf("Bought %s%n", nameGame);

                    } else {
                        System.out.printf("Too Expensive%n");
                        price = 0;
                    }
                    break;
                case "CS: OG":
                    price = 15.99;
                    if (balance >= price) {
                        System.out.printf("Bought %s%n", nameGame);

                    } else {
                        System.out.printf("Too Expensive%n");
                        price = 0;
                    }
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    if (balance >= price) {
                        System.out.printf("Bought %s%n", nameGame);

                    } else {
                        System.out.printf("Too Expensive%n");
                        price = 0;
                    }
                    break;
                case "Honored 2":
                    price = 59.99;
                    if (balance >= price) {
                        System.out.printf("Bought %s%n", nameGame);

                    } else {
                        System.out.printf("Too Expensive%n");
                        price = 0;
                    }
                    break;
                case "RoverWatch":
                    price = 29.99;
                    if (balance >= price) {
                        System.out.printf("Bought %s%n", nameGame);

                    } else {
                        System.out.printf("Too Expensive%n");
                        price = 0;
                    }
                    break;
                default:
                    System.out.printf("Not Found%n");
                    break;
            }
            balance -=price;
            spend +=price;
        }
    }
}
