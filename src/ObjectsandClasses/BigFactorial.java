package ObjectsandClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int initialNum = 1;
           BigInteger result = new BigInteger(String.valueOf(initialNum));
        int n =Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            result = result.multiply(BigInteger.valueOf(i));

        }
        System.out.println(result);
    }
}
