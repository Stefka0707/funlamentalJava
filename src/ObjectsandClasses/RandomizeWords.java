package ObjectsandClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[]wordsArr = input.split("\\s+");
        Random rntCeneratoe = new Random();
        for (int i = 0; i <wordsArr.length ; i++) {
            int index = rntCeneratoe.nextInt(wordsArr.length);
            int indey = rntCeneratoe.nextInt(wordsArr.length);
           String oldWorldX = wordsArr[index];

            wordsArr[index] = wordsArr[indey];
            wordsArr[indey] = oldWorldX;

        }
        System.out.println(String.join(System.lineSeparator(),wordsArr));
    }
}
