package text;

import java.util.Scanner;

public class DigitsLettersandOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder digitSb = new StringBuilder();
        StringBuilder letterb = new StringBuilder();
        StringBuilder otherSb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (Character.isDigit(symbol)){
                digitSb.append(symbol);

            }else if (Character.isLetter(symbol)){
                letterb.append(symbol);

            }else{
                otherSb.append(symbol);
            }

        }
        System.out.println(digitSb);
        System.out.println(letterb);
        System.out.println(otherSb);

    }
}
