package AssociativeArraysExercise;

import java.util.*;

public class companyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String,LinkedHashSet<String>> companies = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")){
            String []commandName = input.split("->");
            String companyName=commandName[0];
            String id=commandName[1];
            if (!companies.containsKey(companyName)){
                companies.put(companyName,new LinkedHashSet<>());
                companies.get(companyName).add(id);
            }else {
                    companies.get(companyName).add(id);
            }
            input = scanner.nextLine();
        }
        companies.forEach((k,v )-> {
            System.out.println(k);
           v.forEach(id -> System.out.println("--" + id));
        });
        }
    }

