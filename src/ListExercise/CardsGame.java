package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        List<Integer> secondCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        while (firstCards.size() > 0 && secondCards.size() > 0) {

            for (int i = 0; i < secondCards.size(); i++) {
                int currentSecondCard = secondCards.get(i);
                int secondforRemove = secondCards.get(0);
                for (int j = 0; j < firstCards.size(); j++) {
                    int furstToremove = firstCards.get(0);
                    int currentfirstCard = firstCards.get(0);
                    if (firstCards.get(j).equals(secondCards.get(i))) {
                        firstCards.remove(0);
                        secondCards.remove(0);

                    } else if (currentfirstCard > currentSecondCard) {


                        firstCards.add(currentfirstCard);
                        firstCards.add(currentSecondCard);
                        firstCards.remove(0);
                        secondCards.remove(0);



                    } else if (currentfirstCard < currentSecondCard) {

                        secondCards.add(currentSecondCard);
                        secondCards.add(currentfirstCard);
                        firstCards.remove(0);
                        secondCards.remove(0);


                    }
break;
                }
                    break;

            }
        }
            int sumFirst = 0;
            int sumSecond = 0;
        for (int i = 0; i <firstCards.size() ; i++) {
            sumFirst +=firstCards.get(i);
        }
        for (int i = 0; i <secondCards.size() ; i++) {
            sumSecond += secondCards.get(i);

        }

        String winner = "";
        boolean itIsBugger =true;
        if (sumSecond > sumFirst ){
            itIsBugger = false;
            winner="Second";
        System.out.printf("%s player wins! Sum: %d",winner,sumSecond);
        }else {
            itIsBugger = true;
            winner = "First";
            System.out.printf("%s player wins! Sum: %d",winner,sumFirst);
        }

    }

}
