package finalExam;



import java.util.Locale;
import java.util.Scanner;

public class stringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String massage = scanner.nextLine();

        String input = scanner.nextLine();
//o	"Translate {char} {replacement}"
//o	"Includes {substring}"
//o	"Start {substring}"
//o	"Lowercase"
//o	"FindIndex {char}"
//o	"Remove {startIndex} {count}"

        while (!input.equals("End")) {
            String[] commandName = input.split(" ");
            String name = commandName[0];

            switch (name) {
                case "Translate":
                    String ReplaceWithThis = commandName[2];
                    String replaceChar = commandName[1];
                    massage = massage.replaceAll(replaceChar, ReplaceWithThis);
                    System.out.println(massage);
                    break;
                case "Includes":
                    String substring = commandName[1];
                    if (massage.contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String substringStart = commandName[1];
                    String forCheck = massage.substring(0, substringStart.length());
                    if (forCheck.equals(substringStart)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    massage = massage.toLowerCase(Locale.ROOT);
                    System.out.println(massage);
                    break;
                case "FindIndex":
                    String forChar = commandName[1];
                    int retval = massage.lastIndexOf(forChar);
                    System.out.println("" + retval);
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(commandName[1]);
                    int endIndex = Integer.parseInt(commandName[2]);
                    String subStringToRemove = massage.substring(startIndex, startIndex + endIndex);
                    massage = massage.replace(subStringToRemove, "");
                    System.out.println(massage);
                    break;

            }


            input = scanner.nextLine();
        }
    }

}