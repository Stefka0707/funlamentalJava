package ArryasMoreExercise;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int lineCount = 0;
        int bestStartIndex = Integer.MAX_VALUE;
        int[] bestLine = new int[n];
        int bestLineNum = 0;
        int bestOnes = 0;
        int bestSum = 0;
        int sum = 0;

        while (!command.equals("Clone them!")) {
            int[] currentLine = Arrays.stream(command
                            .split("!+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            lineCount++;
            int longestOnesInArow = 0;// поредица 1ци на тек.ред
            int startIndex = Integer.MAX_VALUE;

            for (int i = 0; i < currentLine.length - 1; i++) {
                int onesInARow = 0;
                for (int j = i; j < currentLine.length; j++) {
                    if (currentLine[i] == currentLine[j] && currentLine[i] == 1) {
                        onesInARow++;

                        if (onesInARow > longestOnesInArow) {
                            longestOnesInArow = onesInARow;
                            startIndex = i;//индекса на 1 ците на текущия ред
                        }
                    } else {
                        break;
                    }

                }

            }
            if (longestOnesInArow > bestOnes) {

                bestOnes = longestOnesInArow; //ъпдейтваме най-добрата поредица 1-ци
                bestLine = currentLine;
                bestLineNum = lineCount;
                bestStartIndex = startIndex;

            } else if (longestOnesInArow == bestOnes) {
                if (startIndex < bestStartIndex) {
                    bestLine = currentLine;
                    bestLineNum = lineCount;
                    bestStartIndex = startIndex;
                } else if (startIndex == bestStartIndex) { //при равни последни 1-ци и индекси
                    //проверяваме сумите на текущия ред  и най -добрия до момента ред

                    for (int i = 0; i < bestLine.length; i++) {
                        bestSum += bestLine[i];

                    }
                    for (int i = 0; i < currentLine.length; i++) {
                        sum += currentLine[i];
                    }
                    if (sum > bestSum) {
                        bestLine = currentLine;
                        bestLineNum = lineCount;
                        bestSum = sum;

                    }

                }

            }

            command = scanner.nextLine();
        }
        bestSum = 0; //да се избегне еврнтуален ред с по - голяма сума,
        //но по - лоша последователност
        for (int i = 0; i < bestLine.length; i++) {
            bestSum += bestLine[i];

        }
        //проверка за само нулеви редове
        if (bestSum == 0) {
            bestLineNum = 1;
        }
        System.out.println(String.format("Best DNA sample %d with sum: %d.", bestLineNum, bestSum));
        for (int i = 0; i < bestLine.length; i++) {

            System.out.print(bestLine[i] + " ");
        }
    }

}

