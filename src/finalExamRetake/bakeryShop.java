package finalExamRetake;

import java.util.*;

public class bakeryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> foodMap = new LinkedHashMap<>();

        int soldQuantity = 0;
        while (!input.contains("Complete")) {
            String[] command = input.split(" ");
            String commandName = command[0];
            String nameFood = command[2];
            int quantity = Integer.parseInt(command[1]);
            switch (commandName) {
                case "Receive":
                    if (quantity <= 0) {
                        break;
                    } else {
                        if (!foodMap.containsKey(nameFood)) {
                            foodMap.put(nameFood, quantity);
                        } else {
                            int num = foodMap.get(input) + quantity;
                            foodMap.put(input, num);
                        }
                    }
                    break;
                case "Sell":
                    if (!foodMap.containsKey(nameFood)) {
                        System.out.printf("You do not have any %s.%n", nameFood);
                    }
                    if (foodMap.containsKey(nameFood)) {
                        if (quantity > foodMap.get(nameFood)) {
                            int num = Math.abs(foodMap.get(input) - quantity);
                            soldQuantity += num;
                            foodMap.remove(nameFood);
                            System.out.printf("There aren't enough %s. You sold the last {sold quantity} of them.%n", nameFood, num);
                        } else if (quantity == foodMap.get(nameFood)) {
                            soldQuantity += quantity;
                            System.out.printf("You sold %d %s.%n", quantity, nameFood);
                            foodMap.remove(nameFood);
                        }else {
                            System.out.printf("You sold %d %s.%n", quantity, nameFood);
                            int num = (foodMap.get(nameFood) - quantity);
                            foodMap.put(nameFood,num);
                            soldQuantity += quantity;

                        }
                    }
            }
            input = scanner.nextLine();
        }
        foodMap.forEach((k,v)-> System.out.println(k +": " + v));
        System.out.printf("All sold: %d goods",soldQuantity);
    }

}


