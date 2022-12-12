package finalExamRetake;

import java.util.Locale;
import java.util.Scanner;

public class emailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String massage = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Complete")){
            String[] commandName = input.split(" ");
            String name = commandName[0];
            StringBuilder text = new StringBuilder();
            StringBuilder encrypt = new StringBuilder();

            switch (name){
                case "Make":
                    if (commandName[1].contains("Upper")){
                    massage = massage.toUpperCase(Locale.ROOT);
                    System.out.println(massage);
                    break;
                    }else if (commandName[1].contains("Lower"))
                    massage = massage.toLowerCase(Locale.ROOT);
                    System.out.println(massage);
                    break;
                case "GetDomain":
                    String[]domainInput = massage.split("\\.");
                    String domain = domainInput[1];

                    int num = Integer.parseInt(commandName[1]);
                    String ready =  domain.substring(0, num);

                    System.out.println(ready);

                    break;
                case "GetUsername":
                    if (!massage.contains("@")){
                        System.out.printf("The email %s doesn't contain the @ symbol.%n",massage);
                    }else  {
                        String[] nameInput = massage.split("@");
                        String nameUser = nameInput[0];
                        System.out.println(nameUser);
                    }
                    break;
                case "Replace":
                    String charsurent= commandName[1];
                    massage = massage.replaceAll(charsurent, "-");
                    System.out.println(massage);
                    break;
                case "Encrypt":
                    for (int i =0; i <=massage.length()-1 ; i++) {
                        int Symbol = massage.charAt(i);
                        text.append(Symbol+" ");
                    }
                    System.out.println(text);
                    break;

            }

            input=scanner.nextLine();
        }


    }
}
