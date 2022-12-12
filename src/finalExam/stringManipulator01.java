package finalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringManipulator01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLines = Integer.parseInt(scanner.nextLine());

        String regex = "([@*])(?<tag>[A-Z][a-z]{2,})\\1: \\[(?<string1>[A-Za-z])\\]\\|\\[(?<string2>[A-Za-z])\\]\\|\\[(?<string3>[A-Za-z])";


        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < numLines; i++) {
            String massage = scanner.nextLine();

            Matcher matcher = pattern.matcher(massage);
           if (matcher.find()){
               String tag = matcher.group("tag");
               String s1 = matcher.group("string1");
               String s2 = matcher.group("string2");
               String s3 = matcher.group("string3");

               System.out.printf("%s: %d %d %d%n",tag,(int)s1.charAt(0),(int)s2.charAt(0),(int)s3.charAt(0));
           }else {
               System.out.println("Valid message not found");
           }


        }
    }
}
