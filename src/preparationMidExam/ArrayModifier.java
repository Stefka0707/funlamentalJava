package preparationMidExam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String[] commandArr = inputLine.split(" ");
            String command = commandArr[0];
            switch (command) {
                case "swap":
                    int swapIndexOne = Integer.parseInt(commandArr[1]);
                    int swapIndextwo = Integer.parseInt(commandArr[2]);

                    int valueAtIndexOne = numbersArr[swapIndexOne];
                    int valueAtIndextwo = numbersArr[swapIndextwo];

                    numbersArr[swapIndexOne] = valueAtIndextwo;
                    numbersArr[swapIndextwo] = valueAtIndexOne;

                    break;

                case "multiply":
                    int multiplyIndexOne = Integer.parseInt(commandArr[1]);
                    int multiplyIndextwo = Integer.parseInt(commandArr[2]);

                    int multiply = numbersArr[multiplyIndexOne] * numbersArr[multiplyIndextwo];
                    numbersArr[multiplyIndexOne] = multiply;
                    break;

                case "decrease":
                    for (int i = 0; i <numbersArr.length ; i++) {
                        numbersArr[i] = numbersArr[i]-1;


                    }

                    break;
            }


            inputLine = scanner.nextLine();
        }
        for (int i = 0; i <numbersArr.length ; i++) {
           if(i == numbersArr.length -1){
               System.out.print(numbersArr[i]);
           }else
            System.out.print(numbersArr[i]+", ");
        }

    }


}
