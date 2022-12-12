package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsinaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().replaceAll("\\s+","");
        //символ -> колко броя са срещанията
        Map<Character,Integer> symbolsCount = new LinkedHashMap<>();

        // HashMap = когато няма никакво значение как ще се подредят
        // нащите записи
        // linkedHashMap ->когато искаме записите да се подредет по
        // реда на добавянето им
        // TreeMap -> записите се сортират спрямо техбия  ключ =
        // ако ключовете са символи например ще ги порежда от а към Z
        // ако ключовете са числа ги сортира от 1 към 10 например възходящо

        for (char symbol : text.toCharArray()) {
            // за да заменим интерсвалите или горе реплейс или тук
            // if(symbol ==' '{
            // continue;
            //  t.e ако символа е интервал ще пропусне проверките надолу :)   }
            //1) да не сме срещали такъв символ
            if (!symbolsCount.containsKey(symbol)){
                symbolsCount.put(symbol,1);
            }
            //2) да сме срешали такъв символ
             else {
                 int currentCount = symbolsCount.get(symbol);
                 symbolsCount.put(symbol,currentCount+1);
            }

        }

    //отпечатваме
        // символ -> бр. срещания
        // entrySet = ни дава съвкупността от всички записи
        // entry : key,(symbol) -> value(count)
        symbolsCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));


    }
}
