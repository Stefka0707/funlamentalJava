package DataTypesandVariablesExercise;

import java.util.Scanner;

public class PrintPartftheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());

        for (int i = startNumber; i <=lastNumber ; i++) {

            char num = (char)i;
            System.out.printf("%c ",num);

        }


    }
}
