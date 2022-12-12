package regularExpressionsExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;

                        List<String> newMassage =new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            String massage = scanner.nextLine();
            List<String> letterList = Arrays.stream(massage.split("")).collect(Collectors.toList());
            List<Character> chars = new ArrayList<>();
            for (char ch : massage.toCharArray()) {
                chars.add(ch);
            }
            String check = "starSTAR";
            for (int c = 0; c < chars.size(); c++) {
                for (int j = 0; j < check.length(); j++) {
                    if (chars.get(c).equals(check.charAt(j)))
                        count++;
                }

            }
            for (int c = 0; c < chars.size(); c++) {
                for (int j = 0; j < check.length(); j++) {
                    if (chars.get(c).equals(check.charAt(j))){
                        int newcharvalue = Integer.parseInt(String.valueOf(chars.get(c)-count));
                        newMassage.add(chars.get(c), String.valueOf(newcharvalue));
                    }else {
                        newMassage.add(chars.get(c),String.valueOf(chars.get(c)));

                    }
                }
                }


            }
        System.out.println(newMassage);

        }
    }
