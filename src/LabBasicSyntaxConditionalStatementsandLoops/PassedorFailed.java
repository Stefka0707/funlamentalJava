package LabBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class PassedorFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double graduate = Double.parseDouble(scanner.nextLine());

        if (graduate > 2.99) {
            System.out.println("Passed!");

        }else {
            System.out.println("Failed!");
        }
    }
}
