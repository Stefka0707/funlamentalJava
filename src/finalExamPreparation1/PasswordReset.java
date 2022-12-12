package finalExamPreparation1;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passWord = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] command = input.split("\\s+");
            String commandName = command[0];
            switch (commandName) {
                case "TakeOdd":
                    passWord = getOddIndex(passWord);
                    System.out.printf("%s\n", passWord);
                    break;
                case "Cut":
                    int index = Integer.parseInt(command[1]);
                    int length = Integer.parseInt(command[2]);
                    String subStringToRemove = passWord.substring(index , index + length);// текста, който трябва да се премахне

                    passWord = passWord.replaceFirst(subStringToRemove, "");
                    System.out.printf("%s\n", passWord);
                    break;
                case "Substitute":
                    String substring = command[1];
                    String substitute = command[2];
                    if (passWord.contains(substring)) {
                        passWord = passWord.replaceAll(substring, substitute);
                        System.out.printf("%s\n", passWord);

                    } else {
                        System.out.println("Nothing to replace!");
                    }
            }


            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", passWord);
    }

    private static String getOddIndex(String commandName) {
        StringBuilder pass = new StringBuilder();
        //for (int i = 0; i <= commandName.length() - 1; i++) {
        ////  if (i %2!=0){
        //char currentSymbol = commandName.charAt(i);
        //  pass.append(currentSymbol);
        //  }
        // }
        for (int i = 1; i <= commandName.length() - 1; i += 2) {
            char currentSymbol = commandName.charAt(i);
            pass.append(currentSymbol);
        }
        return pass.toString();// казали сме че методът връща
        // Стринг а pass e stringBuilder , за това го преобразуваме :)
    }
}
