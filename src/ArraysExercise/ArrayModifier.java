package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                //взимаме елемента на първият индекс
                int element1 = num[index1];
                //взимаме елемента на втрорият индекс
                int element2 = num[index2];
                //размяна
                num[index1] = element2;
                num[index2] = element1;

            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                //взимаме елемента на първият индекс
                int element1 = num[index1];
                //взимаме елемента на втрорият индекс
                int element2 = num[index2];

                int result = element1 * element2;
                num[index1] = result;

            } else if (command.equals("decrease")) {
                //бхождаме всички елемети - -1
                //индекси от 0 до последния (дължината на масива -1)
                for (int index = 0; index <= num.length - 1; index++) {
                    num[index]--;// декрементация
                    //num [index] -=1;


                }

            }
            command = scanner.nextLine();
        }
        //отпечАтваме със запетая и интервал
        for (int index = 0; index <= num.length - 1; index++) {
            int currentNum = num[index];
            if (index != num.length - 1) {
                System.out.printf(currentNum + ", ");
//ako текущото число не е на последна позиция, това е защото след послендото
                //число нямаме запетая и затова посленото го печатаме
                // в елса долу само числото :)
            } else {
                System.out.print(currentNum);
            }
        }
    }

}
