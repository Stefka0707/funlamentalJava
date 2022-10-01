package BasicSyntaxConditionalStatementsandLoopsMoreExercise;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int furstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thurthNum = Integer.parseInt(scanner.nextLine());

        if (furstNum > secondNum && furstNum > thurthNum) {
            System.out.println(furstNum);
            if (secondNum > thurthNum) {
                System.out.println(secondNum);
                System.out.println(thurthNum);
            } else {
                System.out.println(thurthNum);
                System.out.println(secondNum);
            }
        } else if (secondNum > furstNum && secondNum > thurthNum) {
            System.out.println(secondNum);
            if (furstNum > thurthNum) {
                System.out.println(furstNum);
                System.out.println(thurthNum);
            } else {
                System.out.println(thurthNum);
                System.out.println(furstNum);
            }
        } else if (thurthNum > furstNum && thurthNum > secondNum) {
            System.out.println(thurthNum);
            if (furstNum > secondNum) {
                System.out.println(furstNum);
                System.out.println(secondNum);
            } else {
                System.out.println(secondNum);
                System.out.println(furstNum);
            }


        }
    }
}
