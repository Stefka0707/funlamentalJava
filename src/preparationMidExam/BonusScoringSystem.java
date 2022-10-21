package preparationMidExam;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());
        double maxNum =0;
        int currentAttendance = 0;
        int numst = 0;
        double maxBonus = 0;
        int attendanceMax = 0;


        for (int i = 1; i <=numberOfStudents ; i++) {
        int attendance = Integer.parseInt(scanner.nextLine());
        maxBonus =(1.00* attendance / numberOfLectures) *(5+bonus);
        if (maxBonus >maxNum){
            maxNum = maxBonus;
            attendanceMax = attendance;
        }



        }
        System.out.printf("Max Bonus: %.0f.%n",Math.ceil(maxNum));
        System.out.printf("The student has attended %d lectures.",attendanceMax);

    }

}
