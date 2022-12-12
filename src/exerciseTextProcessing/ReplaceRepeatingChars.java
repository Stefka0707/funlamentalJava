package exerciseTextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        char previoursChar = input.charAt(0);
        sb.append(previoursChar);
        for (int i = 1; i <input.length(); i++) {
            char currentChar = input.charAt(i);
            if (previoursChar != currentChar){
                sb.append(currentChar);
                previoursChar = currentChar;
            }

        }
        System.out.println(sb);
    }
}
