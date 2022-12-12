package finalExamRetake;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
            int counter = 0;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String regex = "(U\\$)(?<username>[A-Z][a-z]{2,})\\1(P@\\$)(?<password>[a-z]{5,}[0-9]{1,})\\3";

            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                counter ++;
                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s%n",matcher.group("username"),matcher.group("password"));

            }else {
                System.out.printf("Invalid username or password%n");
            }


        }
            System.out.printf("Successful registrations: %d",counter);
    }
}
