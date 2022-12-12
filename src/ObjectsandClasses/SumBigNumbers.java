package ObjectsandClasses;

import javax.security.sasl.SaslClient;
import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(scanner.nextLine());
        BigInteger secondtNum = new BigInteger(scanner.nextLine());

        BigInteger result=firstNum.add(secondtNum);
        System.out.println(result);
    }
}
