package exerciseTextProcessing;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine().replaceFirst("^0+","");
        int second = Integer.parseInt(scanner.nextLine());

        if (second == 0) {
            System.out.println(0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int carryOver = 0;
        for (int i = first.length() - 1; i >= 0; i--) {
            int dogit = Integer.parseInt(String.valueOf(first.charAt(i)));
            int result = dogit * second +carryOver;
            if (i ==0){
            sb.insert(0,result);
            }else {
                int resDigit = result % 10;
                carryOver = result / 10;
                sb.insert(0, resDigit);
            }
        }
        System.out.println(sb);
    }

}
