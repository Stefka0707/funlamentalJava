package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String imput = scanner.nextLine();

        double sumMoney = 0;


        while (imput != "Start") {
            double coins = Double.parseDouble(imput);
            if (coins == 0.10 || coins == 0.20 || coins == 0.50 || coins == 1.00 || coins == 2.00) {
                sumMoney += coins;
            } else {
                System.out.println("Cannot accept " + sumMoney);
            }
        }


    }
}
