package exerciseTextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        System.out.println(multiply(input[0],input[1] ));


    }

    public static int multiply(String one, String two) {
        char[] firstWordArr = one.toCharArray();
        char[] secondWordArr = two.toCharArray();
        int sum = 0;
        int currentNum = 0;
        int longWord = Math.max(firstWordArr.length, secondWordArr.length);
        int shortWord = Math.min(firstWordArr.length, secondWordArr.length);

        for (int i = 0; i < shortWord; i++) {
            currentNum =  firstWordArr[i] * secondWordArr[i];
            sum += currentNum;

        }
        if (firstWordArr.length < secondWordArr.length) {
            for (int i = shortWord; i <= longWord -1 ; i++) {
                sum += secondWordArr[i];

            }
        } else if (firstWordArr.length > secondWordArr.length) {
            for (int i = shortWord; i <=longWord - 1; i++) {
                sum += firstWordArr[i];

            }
        }
        return sum;
    }
}
