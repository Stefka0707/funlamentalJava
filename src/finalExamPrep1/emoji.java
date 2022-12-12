package finalExamPrep1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emoji {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        String regexName = "(:{2}|\\*{2})(?<emoji>[A-Z][a-z]{2,})\\1";
        String regexDigit = " ";

        long bestCool = 1;


        Pattern patternName = Pattern.compile(regexName);
        Pattern patternDijit = Pattern.compile(regexDigit);
        Matcher matcherDigit = patternDijit.matcher(input);

        while (matcherDigit.find()) {
            int currentDigit = Integer.parseInt(matcherDigit.group());
            bestCool *= currentDigit;
        }

        List<String > emojiList = new ArrayList<>();
        int numberEmoji = 0;

            Matcher matcherEmojiName = patternName.matcher(input);
            while (matcherEmojiName.find()){
                 String nameCurrentEmoji = matcherEmojiName.group("emoji");
                numberEmoji ++;
                long currentLetterSum = 0;
                for (char symbol:nameCurrentEmoji.toCharArray()) {
                    currentLetterSum +=symbol;
                }
                if (currentLetterSum >bestCool){
                    String nameFull = matcherEmojiName.group();
                    emojiList.add(nameFull);
                }
            }

        System.out.printf("Cool threshold: %d%n",bestCool);
        System.out.printf("%d emojis found in the text. The cool ones are:%n",numberEmoji);
        for (String name:emojiList) {
            System.out.println(name);

        }
    }
}
