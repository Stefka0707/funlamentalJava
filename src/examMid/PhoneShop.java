package examMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phoneList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());


        String line = scanner.nextLine();
        while (!"End".equals(line)) {
            List<String> command = Arrays.stream(line.split("\\s+")).collect(Collectors.toList());
            String commandWord = command.get(0);

                if (commandWord.contains("Add")) {
                    String forAdd = command.get(2);
                    if (phoneList.contains(forAdd)){
                        break;
                    }else {
                        phoneList.add(command.get(2));
                    }
                }
                if (commandWord.contains("Remove")){
                    String forRemove = command.get(2);
                    if (phoneList.contains(forRemove)){
                        phoneList.remove(command.get(2));
                    }

                }
                if (commandWord.contains("Bonus")){
                    List<String> phones = Arrays.stream(command.get(3).split(":")).collect(Collectors.toList());
                    String oldPhone = phones.get(0);
                    String newPhon= phones.get(1);
                    if (phoneList.contains(oldPhone)){
                        for (int i = 0; i <phoneList.size() ; i++) {
                            if (phoneList.get(i).equals(oldPhone)){
                                phoneList.add(i+1,newPhon);
                            }

                        }
                    }


                }if (commandWord.contains("Last")){
                    String listforList = command.get(2);
                    if (phoneList.contains(listforList)){
                        phoneList.remove(listforList);
                        phoneList.add(listforList);
                    }

            }



            line = scanner.nextLine();
        }
        System.out.println(String.join(", ",phoneList));


    }
}
