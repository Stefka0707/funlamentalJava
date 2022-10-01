package DataTypesandVariablesExercise;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int furstNumber = Integer.parseInt(scanner.nextLine());
         int secondNumber = Integer.parseInt(scanner.nextLine());
         int thurthNumber = Integer.parseInt(scanner.nextLine());
         int fourNumber = Integer.parseInt(scanner.nextLine());

         int result =((furstNumber+ secondNumber )/ thurthNumber) * fourNumber;
        System.out.printf("%d",result);

    }
}
