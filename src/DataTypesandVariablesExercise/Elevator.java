package DataTypesandVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int peopleNum = Integer.parseInt(scanner.nextLine());
         int capacity = Integer.parseInt(scanner.nextLine());

         int num = peopleNum / capacity;
         int result = peopleNum - num;
         if(result >capacity){

         }



    }
}
