package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!command.equals("End")) {
            if (command.contains("Add")) {
                int numAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(numAdd);
            } else if (command.contains("Insert")) {
                int numToInt = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);

                if (isValidIndex(index, numbers)) {
                    numbers.add(index, numToInt);

                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Remove")) {
                int removeIndex = Integer.parseInt(command.split("\\s+")[1]);

                if (isValidIndex(removeIndex, numbers)) {
                    numbers.remove(removeIndex);

                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {
                int countShiftleft = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 1; i <= countShiftleft; i++) {
                    int firstNum = numbers.get(0);
                    numbers.remove(0);//премахваме числото на индекс 0 ,
                    // т.е първото число
                    numbers.add(firstNum);// добавяме го на последна позиция в списъка
                }
            } else if (command.contains("Shift right")) {
                int countShiftRight = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 1; i <= countShiftRight; i++) {
                    int lastNUM = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, lastNUM);
                }
            }
            command = scanner.nextLine();
        }
        for (int index : numbers) {
            System.out.print(index + " ");


        }

    }

    // метод който проверява дали даден индекс съществува.
    // true = ако имаме валиден индекс
    // false = невалиден индекс
    public static boolean isValidIndex (int index, List<Integer> numbers) {
        return index >= 0 && index <= numbers.size() - 1;
    }

}

