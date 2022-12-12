package finalExamPrep1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(#|\\|)(?<name>[A-Za-z\\s]+)\\1(?<expiration>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        StringBuilder allFood = new StringBuilder();
        int totalCall = 0;
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String name = matcher.group("name");
            String expiration = matcher.group("expiration");
            int callories = Integer.parseInt(matcher.group("calories"));
            totalCall +=callories;

            allFood.append(String.format("Item: %s, Best before: %s, Nutrition: %s%n",name,expiration,callories));

        }
        int days = totalCall /2000;
        System.out.printf("You have food to last you for: %s days!%n",days);
        System.out.print(allFood);


    }
}
