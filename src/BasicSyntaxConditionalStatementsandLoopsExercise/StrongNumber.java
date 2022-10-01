package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int startn = n;
        int curentNum = 0;
        int sum = 0;
        while (n >0){
            curentNum = n %10;
            int facturuel = 1;
            for (int i = 1; i <=curentNum ; i++) {
                facturuel = facturuel * i;

            }
            sum +=facturuel;
        n = n/10;
        }
        if(sum == startn){
            System.out.printf("yes");
        }else {
            System.out.printf("no");
        }
    }
}
