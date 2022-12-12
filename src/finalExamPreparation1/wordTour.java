package finalExamPreparation1;

import java.util.Scanner;

public class wordTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        StringBuilder stoppers = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {
            String[] commandName = input.split(":");
            String name = commandName[0];

            switch (name) {
                case "Add Stop":
                    int index = Integer.parseInt(commandName[1]);
                    String text = commandName[2];

                    if (isValidIndex(index,stoppers.toString())){
                        stoppers.insert(index,text);
                        System.out.println(stoppers);
                    }
                    break;
                case "Remove Stop":
                    int startIndex= Integer.parseInt(commandName[1]);
                    int endIndex= Integer.parseInt(commandName[2]);
                    if (isValidIndex(startIndex,stoppers.toString()) && (isValidIndex(endIndex,stoppers.toString()))) {
                        stoppers.delete(startIndex, endIndex + 1);
                    }
                        System.out.println(stoppers);

                    break;
                case "Switch":
                    String oldString = commandName[1];
                    String newString = commandName[2];
                   String destinationAS = stoppers.toString();
                   destinationAS = destinationAS.replaceAll(oldString,newString);
                   stoppers = new StringBuilder(destinationAS);

                    System.out.println(stoppers);

                    break;

            }


            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",stoppers);

    }
    public static boolean isValidIndex (int index,String text){
        return index >=0 && index <text.length();

    }
}
