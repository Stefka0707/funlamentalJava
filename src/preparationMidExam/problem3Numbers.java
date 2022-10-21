package preparationMidExam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class problem3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int count = 0;
        double sum = 0;
        double average = 0;
        for (int i = 0; i < numArr.length; i++) {
            int currentNum = numArr[i];
            sum += currentNum;
        }
        int counter = 0;
        String forpr = "";
        average = (sum / (1.00 * numArr.length));

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > average) {
                int currentNum = numArr[i];

                forpr += numArr[i] + " ";


            }
        }
        if(forpr.length()==0){
            System.out.println("No");
            return;
        }


        int[] forPrintArr = Arrays.stream(forpr.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int currentNumMax = 0;
        int mid = 0;
        String finalNumbers = "";
        for (int i = 0; i < forPrintArr.length; i++) {
            for (int j = i+1; j <forPrintArr.length ; j++) {

            if (forPrintArr[i] < forPrintArr[j]) {
                currentNumMax = forPrintArr[i];
                forPrintArr[i]=forPrintArr[j];
                forPrintArr[j]=currentNumMax;

            }
            }

        }
        for (int i = 0; i <forPrintArr.length ; i++) {
            counter++;
            System.out.print(forPrintArr[i] + " ");
            if (counter == 5) {
                break;
            }
            if(forPrintArr[i]==forPrintArr.length){
                break;
            }
        }


        }


    }

