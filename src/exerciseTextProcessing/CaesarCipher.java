package exerciseTextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tex = scanner.nextLine();

        for (char symbol:tex.toCharArray()) {
            System.out.print((char) (symbol + 3));

        }
    }
}
