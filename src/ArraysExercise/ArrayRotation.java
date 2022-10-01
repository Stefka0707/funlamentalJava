package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] num = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rotation = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= rotation; i++) {
            int firstElement = num[0];


            for (int j = 0; j <= num.length - 1; j++) {

            }
            num[num.length - 1] = firstElement;



        }
    }
}
