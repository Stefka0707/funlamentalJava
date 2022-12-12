package finalExamPrep1;

import java.util.*;
import java.util.stream.Collectors;


public class archeryChampion<isValidLeftIndex> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberLIst = Arrays.stream(scanner.nextLine().split("\\|"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        int points = 0;

        while (!input.equals("Game over")) {
            String[] command = input.split("@");
            String nameCommand = command[0];


            if (nameCommand.contains("Left")) {
                int startIndex = Integer.parseInt(command[1]);
                int length = Integer.parseInt(command[2]);
                int sumIndex = startIndex + length + 1;
                if (isValidIndexLeft(sumIndex, numberLIst) && startIndex < numberLIst.size() && startIndex >= 0 ){
                    int value = numberLIst.get(sumIndex).intValue();
                    int value2 = 5;
                    int resut = value - value2;
                    numberLIst.set(sumIndex, resut);
                    points += 5;

                } else if (isValidIndexLeft(startIndex, numberLIst)&&sumIndex > numberLIst.size()-1)  {
                    sumIndex = numberLIst.size()-1;
                    int index2 = numberLIst.size() - 1;
                    int value = numberLIst.get(index2).intValue();
                    int value2 = 5;
                    int resut = value - value2;
                    numberLIst.set(sumIndex, resut);
                    points += 5;
                }
            }
            if (nameCommand.contains("Right")) {
                int startIndex = Integer.parseInt(command[1]);
                int length = Integer.parseInt(command[2]);
                int index = numberLIst.size() - (startIndex ) + length ;
                if (isValidIndexRight(index, numberLIst) && startIndex < numberLIst.size() && startIndex >= 0) {
                    int valueRight = numberLIst.get(index).intValue();
                    int value2 = 5;
                    int resut = valueRight - value2;
                    numberLIst.set(index, resut);
                    points += 5;

                } else if (index < 0 || index >= numberLIst.size() - 1) {
                    int startIndexRight =numberLIst.size() - 2;
                    int value = numberLIst.get(startIndexRight).intValue();
                    int value2 = 5;
                    int resut = value - value2;
                    numberLIst.set(startIndexRight, resut);
                    points += 5;

                }
            }
            if (nameCommand.contains("Reverse")) {
                Collections.reverse(numberLIst);
            }
            input = scanner.nextLine();

        }
        for (int index = 0; index <=numberLIst.size()-1; index ++ ) {
            int currentNum = numberLIst.get(index);
            if (index != numberLIst.size() - 1) {

                System.out.print(currentNum + " - ");
            } else

                System.out.println(currentNum);
        }

        System.out.printf("John finished the archery tournament with %d points!", points);

    }

    public static boolean isValidIndexLeft(int index, List<Integer> numberLIst) {
        return index >= 0 && index <= numberLIst.size() - 1;

    }

    public static boolean isValidIndexRight(int index, List<Integer> numberLIst) {
        return index >= 0 && index <= numberLIst.size() - 1;
    }


}
