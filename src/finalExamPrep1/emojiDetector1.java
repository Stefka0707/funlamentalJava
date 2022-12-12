package finalExamPrep1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emojiDetector1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern patternNumbers = Pattern.compile("\\d");
        Pattern patternEmojis = Pattern.compile("(:{2}|\\*{2})(?<emoji>[A-Z][a-z]{2,})\\1");

        String input = scanner.nextLine();

        Matcher matcherNumbers = patternNumbers.matcher(input);

        long coolThreshold = 1;
        while (matcherNumbers.find()) {
            int currentNumber = Integer.parseInt(matcherNumbers.group());
            coolThreshold *= currentNumber;
        }

        List<String> emojisList = new ArrayList<>();
        int emojisCounter = 0;

        Matcher matcherEmojis = patternEmojis.matcher(input);
        while (matcherEmojis.find()) {
            String currentEmoji = matcherEmojis.group("emoji");
            emojisCounter++;

            long emojiCoolness = 0;
            for (char letter : currentEmoji.toCharArray()) {
                emojiCoolness += letter;
            }

            if (emojiCoolness > coolThreshold) {
                String fullEmoji = matcherEmojis.group();
                emojisList.add(fullEmoji);
            }
        }

        System.out.println("Cool threshold: " + coolThreshold);
        System.out.println(emojisCounter + " emojis found in the text. The cool ones are:");
        for (String emoji : emojisList) {
            System.out.println(emoji);
        }
    }
}
