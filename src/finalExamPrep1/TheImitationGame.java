package finalExamPrep1;


import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputCode = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Decode")) {
            String[] commandName = command.split("\\|");


            switch (commandName[0]) {
                case "Move":
                    int nLetter = Integer.parseInt(commandName[1]);

                 String subString = inputCode.substring(0, nLetter);

                        inputCode = inputCode.replaceAll(subString,"");
                        inputCode = inputCode.concat(subString);

                    break;
                case "Insert":
                    int indeX = Integer.parseInt(commandName[1]) ;
                    String charValue = commandName[2];
                  StringBuilder stringToAD = new StringBuilder(inputCode);
                    stringToAD.insert(indeX, charValue);
                    inputCode = stringToAD.toString();

                    break;
                case "ChangeAll":
                    inputCode = inputCode.replaceAll(commandName[1],commandName[2]);

                    break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s",inputCode);


    }
}
