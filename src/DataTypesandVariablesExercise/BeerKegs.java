package DataTypesandVariablesExercise;

import java.util.Scanner;

import static java.lang.Double.MIN_VALUE;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numOfKegs = Integer.parseInt(scanner.nextLine());

        String modelKeg = " ";
        double radius =0;
        int height = 0;

        //π * r^2 * h.

            double result =MIN_VALUE;
            String name = "";
        for (int i = 1; i <=numOfKegs; i++) {
            modelKeg = scanner.nextLine();
            radius = Double.parseDouble(scanner.nextLine());
            height = Integer.parseInt(scanner.nextLine());
            double curentResult =Math.PI *Math.pow(radius,2) * height;
            if (curentResult > result) {
                result = curentResult;
                name = modelKeg;
            }
        }
            System.out.printf(name);

    }
}
