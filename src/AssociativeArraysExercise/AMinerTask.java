package AssociativeArraysExercise;

import java.util.*;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sequence = scanner.nextLine();
        Map<String, Integer> minerMap = new LinkedHashMap<>();
        int count = 0;
        while (!sequence.equals("stop")) {
            count++;
            int goal = Integer.parseInt(scanner.nextLine());
            List<Integer> goals = new ArrayList<>();
            if (!minerMap.containsKey(sequence)) {
                minerMap.put(sequence, 0);
                minerMap.put(sequence, minerMap.get(sequence) + goal);

                //minerMap.putIfAbsent(sequence,0);
                //minerMap.put(sequence,0);

            } else {
                minerMap.put(sequence, minerMap.get(sequence) + goal);

            }

            sequence = scanner.nextLine();
        }
    //    for (Map.Entry<String, Integer> entry : minerMap.entrySet()) {
     //       System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
    //    }
        minerMap.forEach((k,v)-> System.out.println(k +" -> " + v));
    }
}

