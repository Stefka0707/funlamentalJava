package AssociativeArraysExercise;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> specialItems = new HashMap<>();
        Map<String, Integer> junkItems = new TreeMap<>();//ako e Треемап си е сортирано ,ако е хеш мап трябва да го спритраме

        //•	Shadowmourne - requires 250 Shards
        //•	Valanyr - requires 250 Fragments
        //•	Dragonwrath - requires 250 Motes
        specialItems.put("shards", 0);
        specialItems.put("fragments", 0);
        specialItems.put("motes", 0);

        boolean isObtained = false;

        while (!isObtained) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");

            for (int i = 0; i < tokens.length; i += 2) {
                int quantity = Integer.parseInt(tokens[i]);
                String item = tokens[i + 1].toLowerCase();//защото Item e na 1 index

                if (specialItems.containsKey(item)) {
                    int num = specialItems.get(item) + quantity;
                    specialItems.put(item, num);
                } else {
                    if (!junkItems.containsKey(item)) {
                        junkItems.put(item,quantity);
                    } else {
                        int num1 = junkItems.get(item) + quantity;
                        junkItems.put(item, num1);
                    }
                }
                if (specialItems.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    int num = specialItems.get("shards") - 250;
                    specialItems.put("shards", num);
                    isObtained = true;
                    break;
                } else if (specialItems.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    int num = specialItems.get("fragments") - 250;
                    specialItems.put("fragments", num);
                    isObtained = true;
                    break;
                } else if (specialItems.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    int num = specialItems.get("motes") - 250;
                    specialItems.put("motes", num);
                    isObtained = true;
                    break;
                }
            }

        }
        specialItems.entrySet().stream().sorted((a, b) -> {
           if(b.getValue() - a.getValue() == 0){
               return  a.getKey().compareTo(b.getKey());
           }else {
               return b.getValue() - a.getValue();
           }
        })
        .forEach(e-> System.out.println(e.getKey() + ": " + e.getValue()));
       junkItems
               .forEach((key,value) ->System.out.println(key + ": " + value));
    }
}
