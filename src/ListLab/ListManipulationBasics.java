package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> inputLIst = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

            String line = scanner.nextLine();
        while (!line.equals("end")) {

            String[] commandArr = line.split(" ");

            switch (commandArr[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandArr[1]);
                    inputLIst.add(numberToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(commandArr[1]);
                    inputLIst.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int numberToRemoveAt = Integer.parseInt(commandArr[1]);
                    inputLIst.remove(numberToRemoveAt);
                    break;
                case "Insert":
                    int numberInsert = Integer.parseInt(commandArr[1]);
                    int numberToRepleace = Integer.parseInt(commandArr[2]);
                    inputLIst.add(numberToRepleace,numberInsert);
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.println(inputLIst.toString().replaceAll("[\\[\\],]", ""));
    }
}
