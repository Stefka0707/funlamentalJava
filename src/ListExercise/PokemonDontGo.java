package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumRemovedElements = 0;

        while (numbers.size() > 0) {

            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index <= numbers.size() - 1) {
                int removeElement = numbers.get(index);
                sumRemovedElements += removeElement;
                numbers.remove(index);
                modifyList(numbers, removeElement);
            } else if (index < 0) {
                int furstEl = numbers.get(0);
                sumRemovedElements += furstEl;
                numbers.remove(0);
                int lastNum = numbers.get(numbers.size() - 1);
                numbers.add(0, lastNum);
                modifyList(numbers, furstEl);
            } else if (index > numbers.size() - 1) {
                int lastElement = numbers.get(numbers.size() - 1);
                sumRemovedElements += lastElement;
                numbers.remove(numbers.size() - 1);
                int firstEl = numbers.get(0);
                numbers.add(firstEl);
                modifyList(numbers, lastElement);

            }
        }

        System.out.println(sumRemovedElements);
    }

    private static void modifyList(List<Integer> numbers, int removeElement) {
        for (int indexinList = 0; indexinList < numbers.size(); indexinList++) {
            int currentNum = numbers.get(indexinList);
            if (currentNum <= removeElement) {
                currentNum += removeElement;
            } else {
                currentNum -= removeElement;
            }
            numbers.set(indexinList, currentNum);
        }

    }
}

