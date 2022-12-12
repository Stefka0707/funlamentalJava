package AssociativeArraysLab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer > orderMap = new LinkedHashMap<>();

        String item = scanner.nextLine();

        while (!item.equals("buy")){




            item = scanner.nextLine();
        }

    }
}
