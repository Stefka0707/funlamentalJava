package regularExpressionsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalSum = 0;
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)";
        //[A-Za-a] == \\w+
        // [0-9]  == \\d+
        Pattern pattern = Pattern.compile(regex);
        List<String> name = new ArrayList<>();

        while (!input.equals("Purchase")) {
            Matcher match = pattern.matcher(input);
            if (match.find()) {
                String furnitureName = match.group("furniture");
                double price = Double.parseDouble(match.group("price"));
                int quantity = Integer.parseInt(match.group("quantity"));
                name.add(furnitureName);
                double currentSum = quantity * price;
                totalSum += currentSum;
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        name.forEach(f-> System.out.println(f)); //може и така name.forEach(System.out ::println);
        System.out.printf("Total money spend: %.2f",totalSum);

    }
}
