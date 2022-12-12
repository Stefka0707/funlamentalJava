package retakeMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class weppon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> weaponsLIst = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        String line = scanner.nextLine();
        while (!line.equals("Done")) {
            String[] commandName = line.split("\\s+");

            switch (commandName[0]) {
                case "Add":
                    String nameparticle = commandName[1];
                    int index = Integer.parseInt(commandName[2]);
                    if (index >= 0 && index < weaponsLIst.size()) {
                        weaponsLIst.add(index, nameparticle);
                    }
                    break;
                case "Remove":
                    int indexToremove = Integer.parseInt(commandName[1]);
                    if (indexToremove >= 0 && indexToremove < weaponsLIst.size()) {
                        weaponsLIst.remove(indexToremove);
                    }
                    break;
                case "Check":
                    String odenEven = commandName[1];
                    if (odenEven.equals("Even")) {
                        for (int i = 0; i < weaponsLIst.size(); i++) {
                            if (i % 2 == 0) {
                               String toApend = weaponsLIst.get(i);
                                even.append(toApend+" ");
                            }

                        }
                        String ready = String.join("", even.toString().replaceAll("[\\[\\]]", ""));


                        ready = ready.replaceAll(",", "");

                        System.out.println(ready);

                    } else {
                        for (int i = 0; i < weaponsLIst.size(); i++) {
                            if (i % 2 != 0) {
                                String toApend = weaponsLIst.get(i);
                                even.append(toApend).append(" ");
                            }

                        }
                        String ready = String.join("", even.toString().replaceAll("[\\[\\]]", ""));


                        ready = ready.replaceAll(",", "");

                        System.out.println(ready);

                    }
                    break;
            }
            line = scanner.nextLine();
        }
        String ready = String.join("", weaponsLIst.toString().replaceAll("[\\[\\]]", ""));

        ready = ready.replaceAll(",", "");
       ready = ready.replaceAll(" ","");
        System.out.printf("You crafted %s!",ready);
    }
}
