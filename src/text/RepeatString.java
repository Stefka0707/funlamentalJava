package text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []wordsArr = scanner.nextLine().split(" ");

        // hi abc add
        // hihi  abcabcabc
        List<String> RepeatList = new ArrayList<>();

        for (int i = 0; i < wordsArr.length ; i++) {
            String currentWord = wordsArr[i];
            int length = currentWord.length();
            String repeatWord = repeatString(currentWord,length);
        RepeatList.add(repeatWord);
        }
        System.out.println(String.join("",RepeatList));

    }
    public  static String repeatString (String word ,int count){
        String result = "";
        for (int i = 0; i <count ; i++) {
            result = result+word;

        }
        return result;

    }
}
