package AssociativeArraysLab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String,Double> fruitMap = new LinkedHashMap<>();

        fruitMap.put("apple", 1.6);
        fruitMap.put("banana", 3.6);

        for (Map.Entry<String, Double> entry : fruitMap.entrySet()) {
            String currentKey = entry.getKey();
            double currentValue = entry.getValue();
            // могат да се изваждат в променливи или да се извикват директно
            System.out.printf("%s - %s%n");

        }


    }
}
