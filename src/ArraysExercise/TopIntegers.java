package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //за всеки един елемент от масива проверяваме дали е топ
        for (int i = 0; i <= num.length - 1; i++) {
            int currentNum = num[i];
            //обхойдаме всички числа след текущото
            //знаем че последният елемент ни е топ защото няма с какво да сравняваме
            if (i == num.length - 1) {
                System.out.printf(currentNum + " ");
                continue;
            }

            boolean isTop = false;
            for (int j = i + 1; j <= num.length - 1; j++) {
                if (currentNum > num[j]) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }

            }
//проверка дали числото е топ
            if (isTop) {
                System.out.printf(currentNum + " ");
            }
        }
    }


}
