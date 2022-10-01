package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int lostGames = Integer.parseInt(scanner.nextLine());
        double hedSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keybordPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int counthedSett = lostGames / 2;
        int countMouse = lostGames / 3;
        int countKeybords = lostGames / 6;
        int countDisplay = lostGames / 12;

        double finalPrice =( counthedSett * hedSetPrice) + (countMouse * mousePrice) + (countKeybords * keybordPrice)+
                (countDisplay * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.",finalPrice);


    }
}
