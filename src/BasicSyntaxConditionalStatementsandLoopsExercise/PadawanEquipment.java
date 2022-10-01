package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double amountMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceSaber = Double.parseDouble(scanner.nextLine());
        double priceRobers = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());


        double toralPriceSaber = priceSaber * (countStudents + Math.ceil(countStudents * 0.1));
        double totalPriceRobes = priceRobers * countStudents;
        double totalPriceBelts = 0;

        if (countStudents > 10) {
            totalPriceBelts = priceBelts * (countStudents - countStudents / 6);
        } else {
            totalPriceBelts = priceBelts * countStudents;
        }

        double allMoneyNeeded = toralPriceSaber + totalPriceRobes + totalPriceBelts;

        if ( amountMoney - allMoneyNeeded >=0) {
            System.out.printf("The money is enough - it would cost %.2flv.", allMoneyNeeded);
        } else {
            System.out.printf("George Lucas will need %.2flv more.",allMoneyNeeded - amountMoney);
        }


    }
}
