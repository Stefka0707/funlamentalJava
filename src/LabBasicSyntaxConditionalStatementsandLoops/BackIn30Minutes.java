package LabBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inithours = Integer.parseInt(scanner.nextLine());
        int  intminutes = Integer.parseInt(scanner.nextLine());


      int allminutes = (inithours * 60) + intminutes+30;
       int hour = allminutes / 60;
       int minutes = allminutes% 60;
       if(hour >23){
    hour = 0;
        }
        System.out.printf("%d:%02d",hour,minutes);



    }
}
