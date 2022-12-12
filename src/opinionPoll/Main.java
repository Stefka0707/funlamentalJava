package opinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());// брой на редовете с лична информация 
        for (int row = 1; row <=n ; row++) {
            String data = scanner.nextLine();
            //име / възраст .split(" ")->
            String name = data.split(" ")[0];
            int age = Integer.parseInt(data.split(" ")[1]);


            if (age>30){
                //Създавам запис  -> съхранявам записа  на човека
                Person person = new Person(name,age);
                personList.add(person);
            }

            
        }
        for (Person person:personList) {
            //отпечатваме името и неговата възраст
            System.out.println(person.getName() + " - " + person.getAge());

        }
    }
}
