package DataTypesandVariablesExercise;

import java.util.Scanner;

public class SumofChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int asciCode = (int) symbol;
            sum += asciCode;


        }
        System.out.printf("The sum equals: %d",sum);
    }
}
