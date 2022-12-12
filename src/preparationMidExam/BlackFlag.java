package preparationMidExam;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double sumPlunder = 0;
        for (int i = 1; i <= days; i++) {
            sumPlunder += dailyPlunder;
            if (i % 3 == 0) {
                sumPlunder += dailyPlunder * 0.5;

            }
            if (i % 5 == 0) {
                sumPlunder = 0.7 * sumPlunder;
            }


        }
        if (sumPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", sumPlunder);
        } else {
            double procent = (sumPlunder / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.",procent);

        }


    }
}
