package retakeMid;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class theLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pasanger = Integer.parseInt(scanner.nextLine());
        int capacity = 4;
        int counterWagon = 0;
        List<Integer> stationList = new ArrayList<>();
        int[] num = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < num.length; i++) {
            counterWagon++;
            int freeSpace = capacity - i;
            int leftPasanger = pasanger - freeSpace;
            stationList.add(freeSpace);
            if (pasanger == 0 || counterWagon == num.length) {


            }
        }
    }
}
