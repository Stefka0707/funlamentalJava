package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character,Integer> letterMap = new LinkedHashMap<>();
        char [] letter = input.toCharArray();
        for (char c : letter) {
             if (c !=' '){
                 letterMap.putIfAbsent(c,0);
                 letterMap.put(c,letterMap.get(c) + 1);
             }
        }
      //  for (Map.Entry<Character, Integer> entry : letterMap.entrySet()) {
         //   System.out.println(entry.getKey() + " -> " + entry.getValue());
      letterMap.forEach((k,v) -> System.out.println(k + " -> " +v));
    }
}
