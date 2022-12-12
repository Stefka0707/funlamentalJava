package AssociativeArraysExercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> coursesList= new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] command= input.split(" : ");
           String coursName = command[0];
           String studentName= command[1];

           if (!coursesList.containsKey(coursName)){
               coursesList.put(coursName,new LinkedList<>());
              coursesList.get(coursName).add(studentName);
           }else {
               coursesList.get(coursName).add(studentName);
           }
            input=scanner.nextLine();
        }
     coursesList
             .entrySet()
             .stream()
             .sorted((a,b) -> b.getValue().size() - a.getValue().size())
             .forEach(entry ->{ System.out.println(entry.getKey() +": " +entry.getValue().size());
                 entry
                         .getValue()
                         .stream()
                         .sorted((a,b)-> a.compareTo(b))
                         .forEach(s-> System.out.println("-- "+s));

             });


    }
}
