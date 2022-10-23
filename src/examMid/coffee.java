package examMid;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class coffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();


        int n = Integer.parseInt(scanner.nextLine());
        List<String> coffeelist = Arrays.stream(input.split(" "))
                .collect(Collectors.toList());


        for (int i = 0; i <= n; i++) {

            List<String> command = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
            String commandWord = command.get(0);

            switch (commandWord) {
                case "Include":
                    String add = command.get(1);
                    coffeelist.add(add);
                    break;
                case "Remove":
                    String position = command.get(1);
                    int element = Integer.parseInt(command.get(2));
                    switch (position) {
                        case "first":
                            for (int j = 1; j <= element; j++) {
                                coffeelist.remove(0);
                            }
                            break;
                        case "last":
                            int index = coffeelist.size() - 1;
                            for (int k = 0; k < element; k++) {
                                if (coffeelist.size() - 1 < element) {
                                    break;
                                } else {
                                    coffeelist.remove(coffeelist.size() - 1);
                                }

                            }
                    }
                    break;
                case "Prefer":
                    int element1 = Integer.parseInt(command.get(1));
                    int element2 = Integer.parseInt(command.get(2));
                    String two = coffeelist.get(element1);
                    String one =coffeelist.get(element2);
                    coffeelist.set(element1,one);
                    coffeelist.set(element2,two);
                    break;
                case "Reverse":
                    Collections.reverse(coffeelist);
                    break;
            }



        }
        System.out.println("Coffees:");
        System.out.println();

        System.out.println(String.join(" ",coffeelist));
    }
}

