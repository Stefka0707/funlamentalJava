package ArraysLab;

import java.util.Scanner;

public class PrintNumbersinReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numversArr = new int[n];
        for (int i = 0; i < numversArr.length; i++) {

            numversArr[i] = Integer.parseInt(scanner.nextLine());

        }
        for (int i = numversArr.length - 1; i >=0 ; i--) {
            System.out.printf("%d ",numversArr[i]);

        }
    }
}
