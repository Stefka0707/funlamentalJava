package finalExamPrep1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emoji2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String regexText = "(:{2}|\\*{2})(?<emoji>[A-Z][a-z]{2,})\\1";
        Pattern patternText = Pattern.compile(regexText);
        String regexDijit = "\\d";
        Pattern patternDigit = Pattern.compile(regexDijit);
        long coolestDigit = 1;

        Matcher matcherDigit = patternDigit.matcher(input);
        while (matcherDigit.find()) {
            int currentDigit = Integer.parseInt(matcherDigit.group());
            coolestDigit *= currentDigit;

        }
        List<String> namesEmojiList = new ArrayList<>();
        int counterValidEmoji = 0;


        Matcher matcherText = patternText.matcher(input);
        while (matcherText.find()){
            String currentNameEmoji = matcherText.group("emoji");
            counterValidEmoji ++;
            long validEmoji=0;
            for (char symbol:currentNameEmoji.toCharArray()) {
                validEmoji +=symbol;
            }
            if (validEmoji > coolestDigit){
                String nameValid = matcherText.group();
                namesEmojiList.add(nameValid);
            }
        }
        System.out.printf("Cool threshold: %d%n",coolestDigit);
        System.out.printf("%d emojis found in the text. The cool ones are:%n",counterValidEmoji);
        for (String name:namesEmojiList) {
            System.out.println(name);

        }

    }
}
