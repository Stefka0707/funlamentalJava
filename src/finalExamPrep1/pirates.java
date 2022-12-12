package finalExamPrep1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, Integer> townMapPopulation = new HashMap<>();
        Map<String, Integer> townMapGold = new TreeMap<>();

        while (!line.equals("Sail")) {
            String[] inputTownsInfo = line.split("\\|{2}");

            String name = inputTownsInfo[0];
            int people = Integer.parseInt(inputTownsInfo[1]);
            int gold = Integer.parseInt(inputTownsInfo[2]);

            if (townMapPopulation.containsKey(name)) {

                int newPopulation = townMapPopulation.get(name) +people;
                townMapPopulation.replace(name,newPopulation);

            } else {
                townMapPopulation.put(name,people);

            }
            if (townMapGold.containsKey(name)) {
                int newGold = townMapGold.get(name)+gold;
               townMapGold.replace(name,newGold);

            } else {

                townMapGold.put(name,gold);
            }

            line = scanner.nextLine();
        }

        String tokens = scanner.nextLine();

        while (!tokens.equals("End")) {
            String[] command = tokens.split("=>");
            String nameCommand = command[0];
            String nameTown = command[1];

            switch (nameCommand) {

                case "Plunder":
                    int currentPeople = Integer.parseInt(command[2]);
                    int currentGold = Integer.parseInt(command[3]);
                    int existingPeople = townMapPopulation.get(nameTown)-currentPeople;
                    int existingGold = townMapGold.get(nameTown)-currentGold;
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",nameTown,currentGold,currentPeople);

                    if (existingGold <=0 || existingPeople <=0){
                        townMapPopulation.remove(nameTown);
                        townMapGold.remove(nameTown);

                        System.out.printf("%s has been wiped off the map!%n",nameTown);
                    }else {
                        townMapGold.replace(nameTown,existingGold);
                        townMapPopulation.replace(nameTown,existingPeople);
                    }

                    break;
                case "Prosper":
                    int currentGold1 = Integer.parseInt(command[2]);
                    if (currentGold1 <0){
                        System.out.println("Gold added cannot be a negative number!%n");
                    }else {
                        int newGold = townMapGold.get(nameTown) +currentGold1;
                        townMapGold.replace(nameTown,newGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",currentGold1,nameTown,townMapGold.get(nameTown));
                    }
                    break;
            }
            tokens = scanner.nextLine();
        }
      /*  int counter = 0;
        for (Integer name :townMapGold.values()) {
            counter++;
        }
        if (counter >0){

            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",counter);
        }else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

       */
       if(townMapGold.isEmpty()){
           System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");

        }else {
           System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",townMapGold.size());
       }
       townMapGold.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
               .forEach(element-> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",element.getKey(), townMapPopulation.get(element.getKey()),element.getValue()));


    }
}
