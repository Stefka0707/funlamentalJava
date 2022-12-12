package ArryasMoreExercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static long[] fibonacceArr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        fibonacceArr = new long[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum +=i;

            System.out.print(fibonacce(sum) + " ");
        }

    }

    private static long fibonacce(int n) {
        if (n <= 1) {
            return n;
        }
        if (fibonacceArr[n] != 0) {
            return fibonacceArr[n];
        }
        long nthFibonacciNumber = (fibonacce(n - 1) + fibonacce(n - 2));
        fibonacceArr[n] = nthFibonacciNumber;
        return nthFibonacciNumber;

    }
}
