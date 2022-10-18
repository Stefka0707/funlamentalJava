package ListLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputLIst = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] command = line.split(" ");
            switch (command[0]) {
                case "Contains":
                    int number = Integer.parseInt(command[1]);
                    if (inputLIst.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch (command[1]) {
                        case "even":

                            for (int i = 0; i < inputLIst.size(); i++) {
                                if (inputLIst.get(i) % 2 == 0) {
                                    System.out.print(inputLIst.get(i) + " ");

                                }

                            }
                            System.out.println();
                            break;
                        case "odd":
                            for (int i = 0; i < inputLIst.size(); i++) {
                                if (inputLIst.get(i) % 2 != 0) {
                                    System.out.print(inputLIst.get(i) + " ");

                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;

                case "Get":
                    int sum = 0;
                    for (int i = 0; i < inputLIst.size(); i++) {
                        sum += inputLIst.get(i);

                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int currentNum = Integer.parseInt(command[2]);
                    for (int i = 0; i < inputLIst.size(); i++) {
                        switch (command[1]) {
                            case "<":
                                if (currentNum > inputLIst.get(i)) {
                                    System.out.print(inputLIst.get(i) + " ");
                                }
                                break;
                            case ">":
                                if (currentNum < inputLIst.get(i)) {
                                    System.out.print(inputLIst.get(i) + " ");
                                }
                                break;
                            case ">=":
                                if (currentNum <= inputLIst.get(i)) {
                                    System.out.print(inputLIst.get(i) + " ");
                                }
                                break;
                            case "<=":
                                if (currentNum >= inputLIst.get(i)) {
                                    System.out.print(inputLIst.get(i) + " ");
                                }
                    break;
                                    }
                            }
                    System.out.println();
                        }
            line = scanner.nextLine();
            }

        }
    }

