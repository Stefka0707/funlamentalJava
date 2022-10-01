package LabBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double graduate = Double.parseDouble(scanner.nextLine());

        if (graduate >=3){
            System.out.println("Passed!");
        }
    }
}
