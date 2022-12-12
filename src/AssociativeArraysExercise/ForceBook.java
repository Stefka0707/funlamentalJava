package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

       //група (side) -> списък с юзъри

        Map<String, List<String>> map = new LinkedHashMap<>();

        while (!command.equals("Lumpawaroo")){
            //проверяваме коя команда сме получили
            //"{force_side} | {force_user}"
            //"{force_user} -> {force_side}"
            if (command.contains(" | ")){
                //command = force_side | force_user.split(" | ") -> ["{force_side}","force_user}"]





            }else if (command.contains(" -> ")){



            }

            command = scanner.nextLine();
        }
    }
}
