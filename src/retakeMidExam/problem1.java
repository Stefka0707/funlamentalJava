package retakeMidExam;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysCompetition = Integer.parseInt(scanner.nextLine());//3
        int pointsCoveredTotal = Integer.parseInt(scanner.nextLine());//400
        int countSwimmers = Integer.parseInt(scanner.nextLine());//5
        double hotelRoomPrice = Double.parseDouble(scanner.nextLine());//70.6
        double feeSwimmerToParticipate = Double.parseDouble(scanner.nextLine());//15.0



        Double moneyToPay = (hotelRoomPrice + feeSwimmerToParticipate) * countSwimmers; // expenses for each day team
        double totalPoints = 0; //track of points team has won
        for (int day = 1; day <= daysCompetition; day++) {
            double pointsPerDay = Double.parseDouble(scanner.nextLine());

            totalPoints = totalPoints + pointsPerDay;
            if (day > 1) {
                totalPoints += pointsPerDay + (pointsPerDay * 0.05);
            }


        }
        if (totalPoints >= pointsCoveredTotal) {
            moneyToPay = moneyToPay - (moneyToPay * 0.25);
            System.out.printf("Money left to pay: %.02f BGN.%n",moneyToPay);
            System.out.println("The championship was successful!");
        } else {
            moneyToPay = moneyToPay - (moneyToPay * 0.10);
            System.out.printf("Money left to pay: %.02f BGN.%n",moneyToPay);
            System.out.println("The championship was not successful!");
        }
    }
}
