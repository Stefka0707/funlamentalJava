package regularExpressionsExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names = scanner.nextLine();


        List<String> racersNames = Arrays.stream(names.split(", ")).collect(Collectors.toList());
        Map<String, Integer> racersDistance = new LinkedHashMap<>();

        racersNames.forEach(name -> racersDistance.put(name, 0));

        String regexLetters = "[A-Za-z]+";
        Pattern patternLetter = Pattern.compile(regexLetters);

        String regexDigit = "[0-9]";
        Pattern patternDigit = Pattern.compile(regexDigit);

        String input = scanner.nextLine();

        while (!input.equals("end of race")) {
            //име на състезателя -> само от буквите
            StringBuilder nameBuilder = new StringBuilder();
            Matcher matcherLetter = patternLetter.matcher(input);// съвкупност от всички букви

            while (matcherLetter.find()) {
                nameBuilder.append(matcherLetter.group());
            }
            // дистанция -> сумата от цифрите
            int distance = 0;
            Matcher matcherDigit = patternDigit.matcher(input);
            while (matcherDigit.find()) {
                distance += Integer.parseInt(matcherDigit.group());
            }
// добавяме дистанцията на определия състезател
            String racerName = nameBuilder.toString();
            if (racersDistance.containsKey(racerName)) {
                int currentDistance = racersDistance.get(racerName);
                racersDistance.put(racerName, currentDistance + distance);
            }
            input = scanner.nextLine();
        }
        //състезател , дистанция
        // сортираме ги sorted -> сортира във взходящ ред затова ползваме после ->reversorder
        //sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        // после ползползвале .limit() и в скобите оказваме броя на записите който искаме.
        List<String> nameOfFirstThree = racersDistance.entrySet()
                .stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("1st place: " + nameOfFirstThree.get(0));
        System.out.println("2nd place: " + nameOfFirstThree.get(1));
        System.out.println("3rd place: " + nameOfFirstThree.get(2));

    }
}
