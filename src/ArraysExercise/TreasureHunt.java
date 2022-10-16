package ArraysExercise;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] initialLoot = scanner.nextLine().split("|");
        String command = scanner.nextLine();


        while (!command.equals("Yohoho!")) {
            String[] parts = command.split(" ");

            switch (parts[0]) {

                case "Loot":
                    for (int i = 1; i < parts.length; i++) {
                        boolean repeated = false;
                        for (int j = 0; j < initialLoot.length ; j++) {
                            if (parts[i].equals(initialLoot[j])) {
                                repeated = true;
                                break;
                            }

                        }
                        if (!repeated) {
                            String newChest = parts[i] + " " + String.join(" ", initialLoot);
                            initialLoot = newChest.split(" ");
                        }

                    }
                    break;
                case "Drop":
                    int position = Integer.parseInt(parts[1]);
                    if (position <= initialLoot.length - 1 && position >= 0) {
                        String dropItem = initialLoot[position];
                        for (int i = position; i < initialLoot.length-1 ; i++) {
                            initialLoot[i] = initialLoot[i + 1];

                        }
                        initialLoot[initialLoot.length - 1] = dropItem;
                    } else {
                        break;
                    }
                    break;
                case "Steal":
                    int numOfStealItem = Integer.parseInt(parts[1]);
                    if (numOfStealItem >= 0 && numOfStealItem < initialLoot.length) {
                        for (int i = 0; i < numOfStealItem; i++) {
                            System.out.print(initialLoot[initialLoot.length - numOfStealItem + i]);
                            if (i != numOfStealItem - 1) {
                                System.out.println(",");
                            }

                        }
                        String[] tempCheas = new String[initialLoot.length - numOfStealItem];

                        for (int i = 0; i < tempCheas.length ; i++) {
                            tempCheas[i] = initialLoot[i];
                        }
                        initialLoot = tempCheas;
                    } else if (numOfStealItem >= 0) {
                        for (int i = 0; i < initialLoot.length ; i++) {
                            System.out.print(initialLoot[i]);
                            if (i != initialLoot.length - 1) {
                                System.out.println(",");
                            }
                        }
                        initialLoot = new String[0];
                    }
                    System.out.println();
                    break;

            }
            command = scanner.nextLine();
        }
        String treashurtCount = String.join("",initialLoot);
        int counter = 0;
        for (int i = 0; i <treashurtCount.length(); i++) {
            counter ++;

        }
        double averageTrasure =(1.0 *counter)/ initialLoot.length;
        if (counter >0){
            System.out.printf("Average treasure gain: %.2f pirate credits.",averageTrasure);
        }else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
