package regularExpressionsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class furniture2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<String> furnitureNames = new ArrayList<>();
        double totalSum = 0;
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        while (!input.equals("Purchase")){
         Matcher matcher = pattern.matcher(input);

         if (matcher.find()){
             String furnitureName = matcher.group("furniture");
             double price = Double.parseDouble(matcher.group("price"));
             int quantity= Integer.parseInt(matcher.group("quantity"));

             furnitureNames.add(furnitureName);
             double cuurentPrice = price*quantity;
             totalSum +=cuurentPrice;
         }
            input=scanner.nextLine();

        }
        System.out.println("Bought furniture:");
        furnitureNames.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",totalSum);
    }
}
