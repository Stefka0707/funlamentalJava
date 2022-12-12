package finalExamPreparation1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String regex = "(?<separator>[\\/=])(?<destination>[A-Z][A-Za-z]{2,})\\1";

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> destinationList = new ArrayList<>();

        while (matcher.find()) {
            destinationList.add(matcher.group("destination"));
        }

        int travelPoints = destinationList.stream().mapToInt(String::length).sum();
       String text = String.join(", ",destinationList);


        System.out.printf("Destinations: %s%n",text);
        System.out.printf("Travel Points: %d",travelPoints);

    }

}
