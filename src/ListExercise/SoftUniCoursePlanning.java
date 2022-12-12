package ListExercise;

import java.util.*;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();
        List<String> schedule = Arrays.stream(lineInput.split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")) {
            List<String> inputCommand = Arrays.stream(command.split(":")).collect(Collectors.toList());
            if (command.contains("Add")) {
                checkequalsLesson(schedule, inputCommand);

            } else if (command.contains("Insert")) {
                checkExcistAndAddOnIndex(schedule, inputCommand);

            } else if (command.contains("Remove")) {
                checkExcistAndRemove(schedule, inputCommand);

            } else if (command.contains("Swap")) {
                checkAndSwap(schedule, inputCommand);

            } else if (command.contains("Exercise")) {

            }


            command = scanner.nextLine();
        }


    }

    public static void checkequalsLesson(List<String> schedule, List<String> inputCommand) {
        for (int i = 0; i <= schedule.size(); i++) {
            String checklesson = inputCommand.get(1);
            String exist = schedule.get(i);
            if (!checklesson.equals(exist)) {
                schedule.add(inputCommand.get(1));
                break;


            }

        }
    }

    public static void checkExcistAndAddOnIndex(List<String> schedule, List<String> inputCommand) {
        for (int i = 0; i <= schedule.size(); i++) {
            String checkLes = inputCommand.get(1);
            int index = Integer.parseInt(inputCommand.get(2));
            String exist = schedule.get(i);
            if (!checkLes.equals(exist)) {
                schedule.add(index, checkLes);
                break;
            }


        }

    }

    public static void checkExcistAndRemove(List<String> schedule, List<String> inputCommand) {
        for (int i = 0; i <= schedule.size(); i++) {
            String checkLes = inputCommand.get(1);
            String exist = schedule.get(i);
            if (!checkLes.equals(exist)) {
                schedule.remove(checkLes);
                break;
            }


        }
    }

    public static void checkAndSwap(List<String> schedule, List<String> inputCommand) {
        String checkles1 = inputCommand.get(1);
        String checkLes2 = inputCommand.get(2);
        if (schedule.contains(checkles1) && schedule.contains(checkLes2)) {
            int oneIndex = schedule.indexOf(checkles1);
            int twoIndex = Integer.parseInt(checkLes2);

            schedule.set(oneIndex, checkLes2);
            schedule.set(twoIndex, checkles1);
            if (schedule.contains("{inputCommand}-Exercise")) {

                schedule.set(twoIndex + 1, "{inputCommand}-Exercise");
                schedule.set(oneIndex + 2, "{inputCommand}-Exercise");
            }

            if (schedule.contains(checkLes2)) {

                schedule.set(twoIndex + 1, "{inputCommand}-Exercise");
                schedule.set(oneIndex + 2, "{inputCommand}-Exercise");
            }

        }


    }

}
