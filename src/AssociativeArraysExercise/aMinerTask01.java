package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class aMinerTask01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> resources = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resources.containsKey(input)){
                resources.put(input,quantity);
            }else {
                int num = resources.get(input) + quantity;
                resources.put(input,num);
            }

            input = scanner.nextLine();
        }
        resources.forEach((k,v)-> System.out.println(k +" -> " + v));


    }
}
