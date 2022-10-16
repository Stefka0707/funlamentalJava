package methodExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean fstCheck =checkCharactersCount(input);
        boolean secCheck =checkCharactersType(input);
        boolean thirdCheck =checkMinDigits(input);
        if (fstCheck && secCheck && thirdCheck ) {
            System.out.println("Password is valid");
        }
    }

    public static boolean checkCharactersCount(String password) {
        boolean res = false;
        if (password.length() >= 6 && password.length() <= 10) {
            res = true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
        }
        return res;
    }

    public static boolean checkCharactersType(String password) {
        boolean res = true;
        char[] charArr = password.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            char current = charArr[i];
            if (!((current >= 'A' && current <= 'z') || (current >= '0' && current <= '9'))) {
                res = false;
                System.out.println("Password must consist only of letters and digits");
                break;
            }

        }
        return res;
    }

    public static boolean checkMinDigits(String password) {
        boolean res = false;
        char[] charArr = password.toCharArray();
        int digitCounter = 0;
        for (int i = 0; i < charArr.length; i++) {
            char current = charArr[i];
            if (current >= '0' && current <= '9') {
                digitCounter++;
            }

        }
        if (digitCounter >=2){
            res = true;
        }else {
        System.out.println("Password must have at least 2 digits");

        }
        return res;

    }

}
