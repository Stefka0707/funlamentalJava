package retakeMid;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class memoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String command = scanner.nextLine();
        int counterMove = 0;

        while (!command.equals("end")) {
            counterMove++;
            String[] nameCommand = command.split("\\s+");
            int index1 = Integer.parseInt(nameCommand[0]);
            int index2 = Integer.parseInt(nameCommand[1]);
            if (index1 >= 0 && index2 >= 0 && index1 < numbersList.size() && index2 < numbersList.size() && index2 != index1) {

                if (index1 == index2 || index1 < 0 || index2 < 0 || index1 >= numbersList.size()
                        || index2 >= numbersList.size()) {
                    System.out.println("Invalid input! Adding additional elements to the board");
                    String addString = "-" + counterMove + "a";
                    numbersList.add(numbersList.size() / 2, addString);
                    numbersList.add(numbersList.size() / 2, addString);
                    command = scanner.nextLine();
                    continue;
                }
                if (numbersList.get(index1).equals(numbersList.get(index2))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", numbersList.get(index1));
                    if (index1 > index2) {
                        numbersList.remove(index1);
                        numbersList.remove(index2);

                    }else {
                        numbersList.remove(index2);
                        numbersList.remove(index1);
                    }
                }else {
                    System.out.println("Try again!");
                }
            if (numbersList.size()<=0){
                System.out.printf("You have won in %d turns!",counterMove);
                break;
            }
            command = scanner.nextLine();
            }
            if (command.equals("end")){
                System.out.println("Sorry you lose :(");
                System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
            }
        }

    }
}


