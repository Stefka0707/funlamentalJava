package finalExamPrep1;

import java.util.Scanner;

public class PasswordReset2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine(); //паролата за модификация
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            if (command.equals("TakeOdd")) {
                String newPassword = getCharOddPositions(password);
                password = newPassword;
                System.out.println(newPassword);

            } else if (command.contains("Cut")) {
                String[] commandName = command.split("\\s+");

                int startIndex = Integer.parseInt(commandName[1]);
                int length = Integer.parseInt(commandName[2]);
                String subStringToRemove = password.substring(startIndex, startIndex + length);
                password = password.replace(subStringToRemove, "");

            } else if (command.contains("Substitute")) {
                String subString = command.split("\\s+")[1];
                String subStitute = command.split("\\s+")[2];

                if (password.contains(subString)) {
                    password = password.replaceAll(subString, subStitute);
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }

            }

            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", password);


    }

    private static String getCharOddPositions(String password) {

        StringBuilder newPasSB = new StringBuilder();
        for (int position = 0; position <= password.length() - 1; position++) {
            if (position % 2 != 0) {
                char currentSymbol = password.charAt(position);
                newPasSB.append(currentSymbol);
            }

        }
        return newPasSB.toString();
    }
}
