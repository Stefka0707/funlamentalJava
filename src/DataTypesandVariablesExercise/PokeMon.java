package DataTypesandVariablesExercise;

import javax.xml.stream.events.EntityReference;
import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N = Integer.parseInt(scanner.nextLine());//pokePower
        int M = Integer.parseInt(scanner.nextLine());//distance
        int Y = Integer.parseInt(scanner.nextLine());//exhaustionFactor

        int counterPoke = 0;
        int startPower = N;

       while ( N >= M){
           N -= M;
           counterPoke ++;

           if( N == startPower * 0.5){
               if(Y>0){
                   N /=Y;
               }
           }
       }
        System.out.println(N);
        System.out.println(counterPoke);

    }
}
