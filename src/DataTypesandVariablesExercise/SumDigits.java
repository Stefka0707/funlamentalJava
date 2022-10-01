package DataTypesandVariablesExercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (digit > 0) {

            int curentNum = digit % 10;
            sum +=curentNum;
            digit /= 10;
        }

        System.out.printf("%d", sum);

    }
}
