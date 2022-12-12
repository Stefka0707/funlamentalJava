package finalExam;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class massageTranslator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String regex = "!(?<command>[A-Z][a-z]{2,})!:\\[(?<name>[A-Z][A-Za-z]{7,})\\]";

            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String command = matcher.group("command");
                String name = matcher.group("name");

                List<Integer> numbers = new ArrayList<>();
                for (int j = 0; j < name.length(); j++) {
                    int currentSymbol = name.charAt(j);
                    numbers.add(currentSymbol);

                }
                String ready = String.join("", numbers.toString().replaceAll("[\\[\\]]", ""));
              //  String ready = numbers.toString().substring(1).replaceAll("\\]$", "");
               ready = ready.replaceAll(",","");


                System.out.printf("%s: %s %n", command,ready);


            } else {
                System.out.println("The message is invalid");
            }
        }
    }
}



