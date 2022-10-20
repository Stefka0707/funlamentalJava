package preparationMidExam;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int healt = 100;
        int bitcoin = 0;
        int bestRoom = 0;
        int currentHealt = 0;
        boolean itIsAlife = true;

        String[] roomsArray = scanner.nextLine().split("\\|");

        for (int i = 0; i <roomsArray.length ; i++) {
            String[] commandRooms = roomsArray[i].split(" ");
             String name = commandRooms[0];

            switch (name) {
                case "chest":
                    int add = Integer.parseInt(commandRooms[1]);
                    bestRoom++;
                    bitcoin += add;
                    System.out.printf("You found %d bitcoins.%n", add);

                    break;

                case "potion":
                    int potion = Integer.parseInt(commandRooms[1]);
                    bestRoom++;
                    if (healt + potion > 100) {
                        potion = 100-healt;
                        System.out.printf("You healed for %d hp.%n", (potion));
                        healt+=potion;
                        currentHealt = 100;

                    } else {

                        System.out.printf("You healed for %d hp.%n", potion);
                        healt+=potion;
                    }
                    System.out.printf("Current health: %d hp.%n", healt);
                    break;
                default:
                    bestRoom++;
                    String nameRoom = commandRooms[0];
                    int attac = Integer.parseInt(commandRooms[1]);
                                healt -=attac;
                            if (healt <=0){
                                System.out.printf("You died! Killed by %s.%n",nameRoom);
                                System.out.printf("Best room: %d",bestRoom);
                                return;
                            }else {
                                System.out.printf("You slayed %s.%n",nameRoom);

                            }


            break;
            }

        }
        System.out.printf("You've made it!%n");
        System.out.printf("Bitcoins: %d%n",bitcoin);
        System.out.printf("Health: %d",healt);


    }
}
