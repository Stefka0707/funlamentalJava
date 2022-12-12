package BitwiseOperations;

import java.util.Scanner;

public class BinaryDigitsCount {

    // от десетична -> двуична
    // входни данни -> число и 0 или 1
    // брояч за нули и едници = 0
    // повтаряме деление на 2 -> спираме когато числото стане <=0
    // //1.делим числото на 2
    //2. число = число /2
    // остатъка проверявам дали е валиден и го броим
    //ако числото стане <=0
    // печатаме брояч
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int oneOrZero = Integer.parseInt(scanner.nextLine());
        int countOne = 0;


        while (number > 0) {
            int leftOver = number % 2;
            if (leftOver == oneOrZero) {
                countOne++;
            }
            number /= 2;
        }
        System.out.println(countOne);
    }

}


