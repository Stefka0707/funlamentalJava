package exerciseTextProcessing;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        String[] codes = input.split("\\s+");
        double totalSum = 0;//сума от модифицираните ичсла на  всички кодове
        for (String code : codes) {
            //код: буква , число ,буква
            //модифицираме числото в кода спрямо буквите
            double modifiedNumber = getModifiedNumber(code);
            // добавям модифицираното число към сумата
            totalSum += modifiedNumber;
        }
        System.out.printf("%.2f",totalSum);
    }

    private static double getModifiedNumber(String code) {
        char firstLetter = code.charAt(0);

        char secondLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstLetter, ' ')
                .replace(secondLetter, ' ').trim());//"12" -> 12.0 текста 12 се превръща в дабъл
        //1. проверка за firstLetter -> главна или малка
        if (Character.isUpperCase(firstLetter)) {
            //главна буква от asci e [65;90]

            int positionUpperLetter = (int) firstLetter - 64; //защото алфабетик А =1 ..т.е за да стане А = 1;
            number /= positionUpperLetter;
        } else {
            //ako e малка -> asci e [97;120]
            int positionLowerLetter = (int) firstLetter - 96;
            number *= positionLowerLetter;
        }
        //проверка за втората буква
        if (Character.isUpperCase(secondLetter)) {
            //главна буква от asci e [65;90]

            int positionUpperLetter = (int) secondLetter - 64; //защото алфабетик А =1 ..т.е за да стане А = 1;
            number -= positionUpperLetter;
        } else {
            //ako e малка -> asci e [97;120]
            int positionLowerLetter = (int) secondLetter - 96;
            number += positionLowerLetter;
        }
        //връщам модифицираното число спрямо буквите


        return number;
    }

}
