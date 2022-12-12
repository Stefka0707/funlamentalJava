package regularExpressionsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class starEnigma2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regexMassage ="@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<poplulation>[0-9]+)[^@!:>-]*!(?<attacType>[AD])![^@!:>-]*->(?<soliderCount>[0-9]+)";
        Pattern patternMassage = Pattern.compile(regexMassage);

        List<String> attackersPlanets = new ArrayList<>();
        List<String> destroitedPlanets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String encryptedMassage = scanner.nextLine();// криптирано съобщение
            String decryptedMassage = getDecryptedMassage(encryptedMassage);
            Matcher matcherMassage = patternMassage.matcher(decryptedMassage);
            if (matcherMassage.find()) {
                String planetName = matcherMassage.group("planetName");
                int population = Integer.parseInt(matcherMassage.group("poplulation"));
                String attacType = matcherMassage.group("attacType");
                int soldierCount = Integer.parseInt(matcherMassage.group("soliderCount"));


                if (attacType.equals("A")) {
                    attackersPlanets.add(planetName);

                } else if (attacType.equals("D")) {
                    destroitedPlanets.add(planetName);

                }
            }

        }
        System.out.println("Attacked planets: " + attackersPlanets.size());
        Collections.sort(attackersPlanets);
        attackersPlanets.forEach(planet -> System.out.println("-> " + planet));

        System.out.println("Destroyed planets: " + destroitedPlanets.size());
        Collections.sort(destroitedPlanets);
        destroitedPlanets.forEach(planet -> System.out.println("-> " + planet));
    }

    //връща декриптираното съобщеие
    private static String getDecryptedMassage(String encryptedMassage) {
        //1 . намираме броя на симжолите [s,t,a,r,]=малки и големи
        int countLetters = getSpecialLettersCount(encryptedMassage);
        StringBuilder decryptedMassage = new StringBuilder();

        for (char symbol : encryptedMassage.toCharArray()) {
            char newSymbol = (char) (symbol - countLetters);
            decryptedMassage.append(newSymbol);

        }
        return decryptedMassage.toString();
    }

    //връща общият брой на повтарящите се сбукви
    private static int getSpecialLettersCount(String encryptedMassage) {
        int count = 0;
        for (char symbol : encryptedMassage.toCharArray()) {
            switch (symbol) {
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    count++;
                    break;
            }
        }
        return count;

    }
}
