package ArraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String [] firstArr = scanner.nextLine().split(" ");
        String [] secondArr = scanner.nextLine().split(" ");

        for (String element:secondArr) {
            //блок от код , който искаме да повторим
            for (String elementFirstArray:firstArr) {
                //обхождаме всеки елемент от първия масив.
                if(element .equals(elementFirstArray)){
                    System.out.print(elementFirstArray + "  ");
                    break;
                }

            }

        }



    }
}
