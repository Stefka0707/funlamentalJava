package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []  numbersArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        int evenSum = 0;
        for (int i = 0; i <numbersArr.length ; i++) {
            int currentElement = numbersArr[i];
            if (currentElement %2==0){
                evenSum +=currentElement;
            }
        }
            System.out.println(evenSum);
    }
}
