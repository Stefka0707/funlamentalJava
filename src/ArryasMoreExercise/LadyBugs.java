package ArryasMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] bugPositions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] fieldArr = new int[fieldSize];

        for (int i = 0; i <= bugPositions.length - 1; i++) {
            int index = bugPositions[i];
            if (index >= 0 && index <= fieldArr.length - 1) {
                fieldArr[index] = 1;

            }
        }
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] data = command.split(" ");
            int index = Integer.parseInt(data[0]);
            String direction = data[1];
            int flylenght = Integer.parseInt(data[2]);

            if (index < 0 || index >= fieldArr.length || fieldArr[index] != 1) {
                command = scanner.nextLine();
                continue;
            }
            fieldArr[index] = 0;
            switch (direction) {
                case "right":
                    index += flylenght;
                    while (index < fieldSize && fieldArr[index] == 1) {
                        index += flylenght;

                    }
                    if (index < fieldSize) {
                        fieldArr[index] = 1;
                    }
                    break;
                case "left":
                    index -= flylenght;
                    while (index >= 0 && fieldArr[index] == 1) {
                        index -= flylenght;
                    }
                    if (index >= 0) {
                        fieldArr[index] = 1;
                    }
                    break;
            }


            command = scanner.nextLine();
        }
        Arrays.stream(fieldArr).forEach(e -> System.out.print(e + " "));


    }
}
